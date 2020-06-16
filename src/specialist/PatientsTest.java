package specialist;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class PatientsTest extends ScheduleTest
{
	@Test(priority=46)//, dependsOnMethods={"scheduleback"})
	public void PatientNavigation() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='left-panel']/ul[1]/a[4]/li")).click();
		Thread.sleep(5000);
	}

	@Test(priority=47)//, dependsOnMethods={"PatientNavigation"})
	public void SearchPatient() throws InterruptedException, AWTException 
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='search_patients']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='search_patients']")).sendKeys("Nithin");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);	 
	}

	@Test(priority=48)//, dependsOnMethods={"SearchPatient"})
	public void SeeMore() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='patients_list']/div/div[1]/div/p[1]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='left-panel']/ul[1]/a[4]/li")).click();
	}

	@Test(priority=49)//, dependsOnMethods={"SeeMore"})
	public void Mail() throws InterruptedException, AWTException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='patients_list']/div/div[1]/div/div/ul/li[1]/a")).click();
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ALT);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_F4);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_ALT);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_F4);
	}

	@Test(priority=50)//, dependsOnMethods={"Mail"})
	public void Phone() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='patients_list']/div/div[1]/div/div/ul/li[2]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='jconfirm-buttons']/button")).click();
	} 

	@Test(priority=51)//, dependsOnMethods={"Phone"})
	public void Pharmacy() throws InterruptedException, AWTException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='patients_list']/div/div[1]/div/div/ul/li[3]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='patient_history_download_options']/a[1]/button")).click();
		Thread.sleep(5000);
		for(int i=0;i<=5;i++)
		{
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_TAB);	
		}
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='patient_history_download_options']/a[2]/button")).click();
		Thread.sleep(5000);
		for(int i=0;i<=5;i++)
		{
			Robot robot1 = new Robot();
			robot1.keyPress(KeyEvent.VK_TAB);	
		}
		Thread.sleep(5000);
		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='patient_history_download']/div/div/button")).click();
	} 

	@Test(priority=52)//, dependsOnMethods={"Pharmacy"})
	public void History() throws InterruptedException, AWTException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='patients_list']/div/div[1]/div/div/ul/li[4]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[@class='table-popup-input']/input[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//p[@class='table-popup-input']/input[1]")).sendKeys("Password1");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='check_password_button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='patient_history_download_options']/a[1]/button")).click();
		Thread.sleep(5000);
		for(int i=0;i<=5;i++)
		{
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_TAB);	
		}
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='patient_history_download_options']/a[2]/button")).click();
		Thread.sleep(5000);
		for(int i=0;i<=5;i++)
		{
			Robot robot1 = new Robot();
			robot1.keyPress(KeyEvent.VK_TAB);	
		}
		Thread.sleep(5000);
		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='patient_history_download']/div/div/button")).click();
	}
}
