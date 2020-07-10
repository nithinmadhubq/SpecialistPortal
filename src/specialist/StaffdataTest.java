package src.Specialistportal;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class StaffdataTest extends AccountTest 
{
	@Test(priority=82)
	public void navigateStaff() throws InterruptedException
	{
		//Navigating to Invite Staff 
		Thread.sleep(4000);
		driver.findElement(By.xpath("//ul[@class='nav nav-tabs appointment-tabs tabs-3']/li[2]")).click();
	}
	
	@Test(priority=83)
	public void submitDetails() throws InterruptedException
	{
		//Saving data without any details 
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='submit_staff_button']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
	}

	@Test(priority=84)
	public void inviteStaff() throws InterruptedException
	{
		//checking condition for already invited Staff 
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Priya");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("M");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Priya123@gmail.com");
		Thread.sleep(4000);
		Select code=new Select(driver.findElement(By.xpath("//form[@id='add_staff_form']/div[2]/div[2]/div/div/select")));
		code.selectByIndex(2);
		driver.findElement(By.xpath("//input[@id='staff_phone_number']")).sendKeys("7685432091");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='submit_staff_button']")).click();
		Thread.sleep(4000);
	}
	
	@Test(priority=85)
	public void cancelStaff() throws InterruptedException
	{
		//Canceling invitation
		driver.findElement(By.xpath("//div[@class='schedule-btn-group justify-content-center']/button[1]")).click();
		Thread.sleep(4000);  
	}
	
	@Test(priority=86)
	public void staffDetails() throws InterruptedException
	{
	    //Adding New data to invite Staff 
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Teju");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("M");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Teju1234@gmail.com");
		Thread.sleep(4000);
		Select code=new Select(driver.findElement(By.xpath("//form[@id='add_staff_form']/div[2]/div[2]/div/div/select")));
		code.selectByIndex(2);
		driver.findElement(By.xpath("//input[@id='staff_phone_number']")).sendKeys("9876543210");
		Thread.sleep(4000);
	}
	
	@Test(priority=87)
	public void saveStaffDetails() throws InterruptedException
	{
		//Saving data
		driver.findElement(By.xpath("//button[@id='submit_staff_button']")).click();
		Thread.sleep(5000);
	}
	
	@Test(priority=88)
	public void re_InvitStaff() throws InterruptedException
	{
		//Re-Inviting staff
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//table[@id='staff_list_table']/tbody/tr[1]/td[7]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='resend_staff_invite_button']")).click();
		Thread.sleep(5000);
	}
	
	@Test(priority=89)
	public void cancelInvit() throws InterruptedException
	{
		//Canceling re-invitation
		Thread.sleep(5000);
		driver.findElement(By.xpath("//table[@id='staff_list_table']/tbody/tr[2]/td[7]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='reinvite_staff_model']/div/div/div[2]/button[2]")).click();
		Thread.sleep(5000);
	}
	
	@Test(priority=90)
	public void cancelDeletion() throws InterruptedException
	{
		//Canceling deletion of staff
		Thread.sleep(5000);
		driver.findElement(By.xpath("//table[@id='staff_list_table']/tbody/tr[5]/td[7]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='delete_staff_model']/div/div/div[2]/button[2]")).click();
		Thread.sleep(5000);
	}

	@Test(priority=91)
	public void deleteStaff() throws InterruptedException
	{
	    //Deleting Staff
		Thread.sleep(5000);
		driver.findElement(By.xpath("//table[@id='staff_list_table']/tbody/tr[4]/td[7]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='delete_staff_button']")).click();
		Thread.sleep(5000);
	}	
   
	@Test(priority=92)
	public void agreement() throws InterruptedException
	{
		//Navigating to Agreement
		driver.findElement(By.xpath("//ul[@class='nav nav-tabs appointment-tabs tabs-3']/li[3]")).click();
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
	}
	
	@Test(priority=93)
	public void logout() throws InterruptedException
	{
	        //logout
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='left-panel']/ul[2]/a[2]/li")).click();
		Thread.sleep(4000);
	}
	
	@Test(priority=94)
	public void quit() throws InterruptedException
	{
		//Closing the browser
		Thread.sleep(7000);
		driver.quit();
	}
}
