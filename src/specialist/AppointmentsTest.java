package specialist;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class AppointmentsTest extends OverTest
{
	@Test(priority=23)//, dependsOnMethods={"SearchPatient"})
	public void Navigateappointment() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='left-panel']/ul[1]/a[2]/li")).click();
		Thread.sleep(5000);
	}

	@Test(priority=24)//, dependsOnMethods={"Navigateappointment"})
	public void Upcoming() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@class='left-panel']/ul[1]/a[2]/li")).click();
		Thread.sleep(5000);
	}

	@Test(priority=25)//, dependsOnMethods={"Upcoming"})
	public void Cancel() throws InterruptedException
	{
		driver.findElement(By.xpath("//tr[@id='row_2410']/td[7]/button")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[@id='cancel_appointment']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='cancel_appointment_model']/div/div/button")).click();
		Thread.sleep(5000);
	}

	@Test(priority=26)//, dependsOnMethods={"Cancel"})
	public void PastAppointement() throws InterruptedException 
	{
		driver.findElement(By.xpath("//ul[@class='nav nav-tabs appointment-tabs tabs-2']/li[2]")).click();
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
		for(int i=1;i<=6;i++)
		{
			Thread.sleep(3000);
			driver.findElement(By.xpath("//li[@id='past_appointment_table_next']/a")).click();
			Thread.sleep(5000);
		}
	}

	@Test(priority=27)//, dependsOnMethods={"PastAppointement"})
	public void NavigateBack() throws InterruptedException 
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='left-panel']/ul[1]/a[2]/li")).click();
		Thread.sleep(5000);
	}

}
