package src.Specialistportal;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AccountTest extends ResourcesTest
{
	@Test(priority=69)
	public void navigateAccount() throws InterruptedException
	{
		//Navigating To Account page
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='left-panel']/ul[2]/a[1]/li")).click();
	}

	@Test(priority=70)
	public void personalDetails() throws InterruptedException, AWTException
	{
		//Adding Personal Details of Specialist
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='user_first_name']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='user_first_name']")).sendKeys("Lok");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='user_middle_name']")).sendKeys("Test");
		Thread.sleep(4000);
		Select Gender=new Select(driver.findElement(By.xpath("//select[@id='user_gender']")));
		Gender.selectByIndex(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='datepicker2']")).click();
		Thread.sleep(5000);
		String month="January 1993";
		String date="12";
		while(true){
			String element = driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr[2]/th[2]")).getText();
			if(element.equals(month)) 
			{ 
				break;
			}
			else
			{ 
				driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr[2]/th[1]")).click();		
			}
		}
		driver.findElement(By.xpath("//div[@class='datepicker-days']/table/tbody/tr/td[contains(text(),"+date+")]")).click();
		Thread.sleep(5000);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		Select CountryCode=new Select(driver.findElement(By.xpath("//div[@class='tab-content appointment-tab-content account-tab-section']/div[1]/form/div[1]/div/div[1]/div/div[2]/div[3]/div/select")));
		CountryCode.selectByIndex(3);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='physician_account_details_phone_number']")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='physician_account_details_phone_number']")).sendKeys("740-503-5468");
		Thread.sleep(4000);
	}

	@Test(priority=71)
	public void specialty() throws InterruptedException
	{
		//Adding Specialty of Specialist
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		Select spec=new Select(driver.findElement(By.xpath("//select[@id='user_physician_info_attributes_specialty_id']")));
		spec.selectByIndex(5);
		Thread.sleep(4000);
		Select subSpec=new Select(driver.findElement(By.xpath("//select[@id='user_physician_info_attributes_sub_specialty_id']")));
		subSpec.selectByIndex(3);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='account-form-btn btn custom_btn add add_specialty_btn add_nested_fields']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='account-form-btn btn custom_btn remove specialty_btn remove_nested_fields']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//textarea[@id='user_physician_info_attributes_areas_of_expertise']")).sendKeys("Orthopedic, Dermatology, Acupunture");
		Thread.sleep(4000);
	}

	@Test(priority=72)
	public void professionalDetails() throws InterruptedException
	{
		//Adding professional Details of Specialist
		driver.findElement(By.xpath("//input[@id='user_title']")).sendKeys("MD, PHD");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='account_email']")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='account_email']")).sendKeys("nm+qaopcp@conciergekeyhealth.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='user_instagram']")).sendKeys("Testdata");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='user_facebook']")).sendKeys("Testdata1");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='user_twitter']")).sendKeys("Testdata2");
		Thread.sleep(4000);	
	}

	@Test(priority=73)
	public void image() throws InterruptedException, AWTException
	{
		//Uploading profile picture 
		Thread.sleep(4000);	
		driver.findElement(By.xpath("//span[@class='profile-upload-btn']")).click();
		StringSelection sel = new StringSelection("download.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		Thread.sleep(5000);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(5000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
	} 

	@Test(priority=74)
	public void drapDrop() throws InterruptedException
	{
		//Cropping image as per user need
		WebElement drag=driver.findElement(By.xpath("//input[@class='cr-slider']"));
		System.out.println(drag.getText());
		Actions action=new Actions(driver);
		action.moveToElement(drag).dragAndDropBy(drag, 300, 0).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary upload-result']")).click();
		Thread.sleep(4000);
	}	 

	@Test(priority=75)
	public void practiceInfo() throws InterruptedException
	{
		//Adding Practice Information of specialist
		Thread.sleep(4000);
		WebElement list=driver.findElement(By.xpath("//select[@id='insurance_company_list']"));
		List<WebElement> option=list.findElements(By.tagName("option"));
		for(int i=0;i<option.size();i++)
		{
			String element;
			element=option.get(i).getAttribute("value");
			if(element.equals("2") || element.equals("4") || element.equals("10"))
			{
				option.get(i).click();
			}
		}
		Thread.sleep(3000);
		Select options=new Select(driver.findElement(By.xpath("//select[@id='user_contact_info_attributes_office_phone_prefix']")));
		options.selectByIndex(4);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='physician_account_details_practice_number']")).clear();
		Thread.sleep(4000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='physician_account_details_practice_number']")).sendKeys("740-503-8711");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='col-12 col-sm-6 form-group']/input[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='user_practice_address_attributes_city']")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='user_practice_address_attributes_city']")).sendKeys("Santa Ana");
		Thread.sleep(4000);
		Select Country=new Select(driver.findElement(By.xpath("//select[@id='user_practice_address_attributes_country']")));
		Country.selectByIndex(1);
		Thread.sleep(4000);
		Select State=new Select(driver.findElement(By.xpath("//select[@id='user_practice_address_attributes_state']")));
		State.selectByIndex(4);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='practce_address_code']")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='practce_address_code']")).sendKeys("92654");
		Thread.sleep(4000);
	}

	@Test(priority=76)
	public void educationInfo() throws InterruptedException, AWTException
	{
		//Adding Education Information of specialist
		driver.findElement(By.xpath("//input[@id='user_physician_info_attributes_physician_educations_attributes_0_school']")).sendKeys("st.johns");
		Thread.sleep(4000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='user_physician_info_attributes_physician_educations_attributes_0_degree']")).sendKeys("MBBS");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='user_physician_info_attributes_physician_educations_attributes_0_year']")).sendKeys("1995");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//form[@id='health_detail']/div[1]/div/div[4]/div[1]/a")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//form[@id='health_detail']/div[1]/div/div[4]/div[1]/div[2]/div/div/a")).click();
		Thread.sleep(4000);
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,100)");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='physician_internship']")).sendKeys("test");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='user[physician_info_attributes][residency]']")).sendKeys("test");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='is_residency']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='user[physician_info_attributes][fellowship]']")).sendKeys("test");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='is_fellowship']")).click();
	}

	@Test(priority=77)
	public void affiliationsInfo() throws InterruptedException
	{	
		//Adding Affiliations Information of specialist
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='user_hospital_affiliations_attributes_0_description']")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='user_hospital_affiliations_attributes_0_description']")).sendKeys("sahara");
		Thread.sleep(4000);	
		driver.findElement(By.xpath("//a[@class='account-form-btn btn custom_btn add add1st add_nested_fields']")).click();
		Thread.sleep(4000);	
		driver.findElement(By.xpath("//form[@id='health_detail']/div[1]/div/div[5]/div[1]/div/div/div/div[2]/a")).click();
		Thread.sleep(4000);	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='user_board_certifications_attributes_0_description']")).clear();
		Thread.sleep(4000);	
		driver.findElement(By.xpath("//input[@id='user_board_certifications_attributes_0_description']")).sendKeys("yes");
		Thread.sleep(4000);	
		driver.findElement(By.xpath("//form[@id='health_detail']/div[1]/div/div[5]/div[2]/div/div/div/a")).click();
		Thread.sleep(4000);	
		driver.findElement(By.xpath("//form[@id='health_detail']/div[1]/div/div[5]/div[2]/div/div/div/div[2]/a")).click();
		Thread.sleep(4000);	
		driver.findElement(By.xpath("//input[@id='user_professional_groups_attributes_0_description']")).clear();
		Thread.sleep(4000);	
		driver.findElement(By.xpath("//input[@id='user_professional_groups_attributes_0_description']")).sendKeys("Test3");
		Thread.sleep(4000);	
		driver.findElement(By.xpath("//form[@id='health_detail']/div[1]/div/div[5]/div[3]/div/div/div/a")).click();
		Thread.sleep(4000);	
		driver.findElement(By.xpath("//form[@id='health_detail']/div[1]/div/div[5]/div[3]/div/div/div/div[2]/a")).click();
		Thread.sleep(4000);	
	}

	@Test(priority=78)
	public void personalStatement() throws InterruptedException
	{
		//Adding Personal statement
		driver.findElement(By.id("user_physician_info_attributes_personal_statement")).sendKeys("test7");
		Thread.sleep(4000);	
	}

	@Test(priority=79)
	public void importantMessage() throws InterruptedException
	{
		//Important message to patients
		driver.findElement(By.id("user_physician_info_attributes_important_message_to_patients")).sendKeys("test8");
		Thread.sleep(5000);
	}

	@Test(priority=80)
	public void cancelDetails() throws InterruptedException
	{
		//Canceling Details of Specialist
		driver.findElement(By.xpath("//div[@class='search-referral-btn accounts-btn-sec']/button[1]")).click();
		Thread.sleep(5000);
	}

	@Test(priority=81)
	public void saveDetails() throws InterruptedException, AWTException
	{
		//Saving Details of Specialist
		driver.findElement(By.xpath("//button[@class='btn custom_btn submit_btn']")).click();
		Thread.sleep(5000);
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_HOME);
		Thread.sleep(5000);
	}
}
