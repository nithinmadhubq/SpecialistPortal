package src.Specialistportal;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SpecialistsearchTest extends PatientsTest
{
	@Test(priority=54)
	public void specialistSearch() throws InterruptedException
	{
		//Navigating to Specialist Search
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='left-panel']/ul[1]/a[5]/li")).click();
	}

	@Test(priority=55)
	public void selectSpecialty() throws InterruptedException
	{
		//Selecting Multiple Specialty
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='main-content']/div[2]/div[1]/div[1]/p")).click();
		Thread.sleep(5000);
		List<WebElement> list=driver.findElements(By.xpath("//input[@type='radio']"));
		for(WebElement e:list)
		{
			if(e.getAttribute("name").equals("179") || e.getAttribute("name").equals("132") || e.getAttribute("name").equals("180"))
			{
				e.click();
			}
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='main-content']/div[2]/div[1]/div[1]/p")).click();
		Thread.sleep(5000);
	}

	@Test(priority=56)
	public void location() throws InterruptedException
	{
		//Selecting specialist through location
		driver.findElement(By.xpath("//div[@class='main-content']/div[2]/div[1]/div[2]/input")).sendKeys("Santa Ana");
		Thread.sleep(5000);
	}

	@Test(priority=57)
	public void specialistName() throws InterruptedException
	{
		//Selecting specialist through Name
		driver.findElement(By.xpath("//div[@class='main-content']/div[2]/div[1]/div[3]/input")).sendKeys("Testing Patient");
		Thread.sleep(5000);
	}

	@Test(priority=58)
	public void insuranceCarrier() throws InterruptedException
	{
		//Selecting specialist through insuranceCarrier
		driver.findElement(By.xpath("//div[@class='main-content']/div[2]/div[1]/div[4]/input")).sendKeys("Cigna");
		Thread.sleep(5000);
	}

	@Test(priority=59)
	public void filterBy() throws InterruptedException
	{
		//Selecting specialist through star rating
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='main-content']/div[2]/div[2]/i[3]")).click();
	}

	@Test(priority=60)
	public void search() throws InterruptedException
	{
		//Searching Specialist using Search button
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='main-content']/div[2]/div[1]/div[6]")).click();
		Thread.sleep(4000);
	}

	@Test(priority=61)
	public void selectSpecilist() throws InterruptedException
	{
		//De-selecting Multiple Specialty
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='main-content']/div[2]/div[1]/div[1]/p")).click();
		Thread.sleep(5000);
		List<WebElement> list=driver.findElements(By.xpath("//input[@type='radio']"));
		for(WebElement e:list)
		{
			if(e.getAttribute("name").equals("179") || e.getAttribute("name").equals("132"))
			{
				e.click();
			}
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='main-content']/div[2]/div[1]/div[1]/p")).click();
		Thread.sleep(5000);
	}

	@Test(priority=62)
	public void specialistData() throws InterruptedException
	{
		//De-selecting Specialist Name
		driver.findElement(By.xpath("//div[@class='main-content']/div[2]/div[1]/div[3]/input")).clear();
		Thread.sleep(5000);
	}

	@Test(priority=63)
	public void insuranceData() throws InterruptedException
	{
		//De-selecting Specialist insurance Data
		driver.findElement(By.xpath("//div[@class='main-content']/div[2]/div[1]/div[4]/input")).clear();
		Thread.sleep(5000);
	}

	@Test(priority=64)
	public void searchSpacialist() throws InterruptedException
	{
		//Searching Specialist using Search button
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='main-content']/div[2]/div[1]/div[6]")).click();
		Thread.sleep(4000);
	}
}

