package src.Specialistportal;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ResourcesTest extends SpecialistsearchTest
{
	@Test(priority=65)
	public void navigateResource() throws InterruptedException
	{
		//Navigating to Resource
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='left-panel']/ul[1]/a[6]/li")).click();
	}

	@Test(priority=66)
	public void viewData() throws InterruptedException
	{
		//Viewing Details
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//input[@class='btn loginbtn pricing_report_0']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		Thread.sleep(6000);
	}

	@Test(priority=67)
	public void cancelDetail() throws InterruptedException
	{
		//Closing of data
		driver.findElement(By.xpath("//div[@class='ui-dialog-titlebar ui-widget-header ui-corner-all ui-helper-clearfix']/a/span")).click();
	}

	@Test(priority=68)
	public void viewVideo() throws InterruptedException
	{
		//Viewing Video
		Thread.sleep(5000);
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='reference']/div/div/div[2]/div[1]/div/div/video")).click();
		Thread.sleep(78000);  		
	}
}