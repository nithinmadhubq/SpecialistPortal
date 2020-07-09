package src.Specialistportal;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class PatientsTest extends SchedulesTest
{
	@Test(priority=46)//, dependsOnMethods={"scheduleBack"})
	public void patientNavigation() throws InterruptedException
	{
		//Navigate to Patient page
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='left-panel']/ul[1]/a[4]/li")).click();
		Thread.sleep(5000);
	}  			

	@Test(priority=47)//, dependsOnMethods={"patientNavigation"})
	public void searchPatientdata() throws InterruptedException, AWTException 
	{
		//Checking the results filtered are as per the given search test
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='search_patients']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='search_patients']")).sendKeys("Nithin");
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);	 
	}

	@Test(priority=48)//, dependsOnMethods={"searchPatientdata"})
	public void seeMoreDetails() throws InterruptedException
	{
		//Navigate to detailed information of patient
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='patients_list']/div/div[1]/div/p[1]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='left-panel']/ul[1]/a[4]/li")).click();
	}

	@Test(priority=49)//, dependsOnMethods={"seeMoreDetails"})
	public void PatientMailId() throws InterruptedException, AWTException
	{
		//Clicking on MailId of patient  
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='patients_list']/div/div[1]/div/div/ul/li[1]/a")).click();
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ALT);
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_F4);
		Thread.sleep(4000);
		robot.keyRelease(KeyEvent.VK_F4);
		Thread.sleep(4000);
		robot.keyRelease(KeyEvent.VK_ALT);
	}

	@Test(priority=50)//, dependsOnMethods={"patientMailId"})
	public void patientPhoneNo() throws InterruptedException
	{
		//Opens up an PopUp window 
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='patients_list']/div/div[1]/div/div/ul/li[2]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='jconfirm-buttons']/button")).click();
	} 

	@Test(priority=51)//, dependsOnMethods={"patientPhoneNo"})
	public void patientPharmacy() throws InterruptedException, AWTException
	{
		//Opens up an PopUp window with two different downloading options
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='patients_list']/div/div[1]/div/div/ul/li[3]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='patient_history_download_options']/a[1]/button")).click();
		Thread.sleep(5000);
		for(int i=1;i<=4;i++)
		{
			Thread.sleep(5000);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_TAB);	
			Thread.sleep(5000);
		}
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='patient_history_download_options']/a[2]/button")).click();
		Thread.sleep(5000);
		for(int i=1;i<=4;i++)
		{
			Thread.sleep(5000);
			Robot robot1 = new Robot();
			robot1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(5000);
		}
		Thread.sleep(5000);
		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='patient_history_download']/div/div/button")).click();
	} 

	@Test(priority=52)//, dependsOnMethods={"patientPharmacy"})
	public void patientHistory() throws InterruptedException, AWTException
	{
		//Opens up an PopUp window with secured password with two different downloading options
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
		for(int i=1;i<=4;i++)
		{
			Thread.sleep(5000);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_TAB);	
			Thread.sleep(5000);
			
		}
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='patient_history_download_options']/a[2]/button")).click();
		Thread.sleep(5000);
		for(int i=1;i<=4;i++)
		{
			Thread.sleep(5000);
			Robot robot1 = new Robot();
			robot1.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(5000);
		}
		Thread.sleep(5000);
		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='patient_history_download']/div/div/button")).click();
	}

	@Test(priority=53)//, dependsOnMethods={"patientPharmacy"})
	public void patientCard() throws InterruptedException, AWTException
	{
		//Opens up an PopUp window with secured password with two different downloading options
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='patients_list']/div/div[1]/div/div/ul/li[5]/a")).click();
		Thread.sleep(5000);
		for(int i=1;i<=4;i++)
		{
			Thread.sleep(5000);
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(5000);
		}
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);			
	}
}
