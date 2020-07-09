package src.Specialistportal;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class AppointmentsTest extends OverTest
{
	@Test(priority=23)//, dependsOnMethods={"searchPatient"})
	public void navigateAppointment() throws InterruptedException
	{
		//Navigating to the Appointments page
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='left-panel']/ul[1]/a[2]/li")).click();
		Thread.sleep(5000);
	}

	@Test(priority=24)//, dependsOnMethods={"navigateAppointment"})
	public void upComingAppointment() throws InterruptedException
	{
		//the default tab is Upcoming Appointments
		driver.findElement(By.xpath("//div[@class='left-panel']/ul[1]/a[2]/li")).click();
		Thread.sleep(5000);
	}

	@Test(priority=25)//, dependsOnMethods={"upComingAppointment"})
	public void cancel() throws InterruptedException
	{
		//the entry gets deleted
		driver.findElement(By.xpath("//tr[@id='row_2417']/td[7]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='cancel_appointment']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='cancel_appointment_model']/div/div/button")).click();
		Thread.sleep(5000);
	}

	@Test(priority=26)//, dependsOnMethods={"cancel"})
	public void pastAppointement() throws InterruptedException 
	{
		//Navigates to past Appointments & checks the listing
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

	@Test(priority=27)//, dependsOnMethods={"pastAppointement"})
	public void NavigateBack() throws InterruptedException 
	{
		//Navigate back to overview
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='left-panel']/ul[1]/a[2]/li")).click();
		Thread.sleep(5000);
	}
}
