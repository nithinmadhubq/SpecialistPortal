package specialist;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class OverTest extends SigninTest{

	@Test(priority=13)//, dependsOnMethods={"signin"})
	public void Announcement() throws InterruptedException, AWTException 
	{
		driver.findElement(By.xpath("//div[@id='main_content']/div[2]/div/div/div[1]/div/p[2]/a")).click();
		Thread.sleep(3000);
		for(int i=0;i<=90;i++) 
		{
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(3000);
		}
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_HOME);	
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='specialistAgreementModal']/div/div/button")).click(); 
		Thread.sleep(3000);

	}
	@Test(priority=14)//, dependsOnMethods={"Announcement"})
	public void Resources() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@class='announcements']/div/div[2]/div/p[2]/a")).click();
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='left-panel']/ul[1]/a[1]/li")).click();
	}

	@Test(priority=15)//, dependsOnMethods={"Resources"})
	public void Appointment() throws InterruptedException
	{
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
	}

	@Test(priority=16)//, dependsOnMethods={"Appointment"})
	public void Allappointments() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='main-content']/p[1]/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='left-panel']/ul[1]/a[1]/li")).click();
	}

	@Test(priority=17)//, dependsOnMethods={"Allappointments"})
	public void statuscheck() throws InterruptedException
	{
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='2_75']")).click();
		Thread.sleep(5000);
	}

	@Test(priority=18)//, dependsOnMethods={"Allappointments"})
	public void uncheckstatus() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='5_70']")).click();
		Thread.sleep(5000);
	}

	@Test(priority=19)//, dependsOnMethods={"uncheckstatus"})
	public void Selected() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='main_content']/div[7]/div/div/table/tbody/tr/td[1]/table/tbody/tr[1]/td/span/a[1]")).click();
		Thread.sleep(5000);
	}

	@Test(priority=20)//, dependsOnMethods={"Selected"})
	public void Deselected() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='main_content']/div[7]/div/div/table/tbody/tr/td[3]/table/tbody/tr[1]/td/span/a[2]")).click();
		Thread.sleep(5000);
	}

	@Test(priority=21)//, dependsOnMethods={"Deselected"})
	public void AllPatient() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='main_content']/p[2]/a")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@class='left-panel']/ul[1]/a[1]/li")).click();
	}

	@Test(priority=22)//, dependsOnMethods={"AllPatient"})
	public void SearchPatient() throws InterruptedException, AWTException
	{
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@id='search_patients']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='search_patients']")).sendKeys("Nithin");
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
	}
}