package specialist;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ScheduleTest extends AppointmentsTest{

	@Test(priority=28)//, dependsOnMethods={"NavigateBack"})
	public void ScheduleNavigation() throws InterruptedException 
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='left-panel']/ul[1]/a[3]/li")).click();
		Thread.sleep(5000);
	}

	@Test(priority=29)//, dependsOnMethods={"ScheduleNavigation"})
	public void ScheduleInformation() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='side-head-sec margin-t30']/h2/a/i")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//div[@class='jconfirm-box jconfirm-hilight-shake jconfirm-type-default jconfirm-type-animated']/div[1]")).click();
		Thread.sleep(5000);
	}

	@Test(priority=30)//, dependsOnMethods={"ScheduleInformation"})
	public void Monday() throws InterruptedException
	{
		Thread.sleep(5000);
		Select Start_Morngsession=new Select(driver.findElement(By.xpath("//select[@id='morning_start_1']")));
		Start_Morngsession.selectByIndex(3);
		Thread.sleep(3000);
		Select End_Morngsession=new Select(driver.findElement(By.xpath("//select[@id='morning_end_1']")));
		End_Morngsession.selectByIndex(17);
		Thread.sleep(3000);
		Select Start_Evngsession=new Select(driver.findElement(By.xpath("//select[@id='evening_start_1']")));
		Start_Evngsession.selectByIndex(3);
		Thread.sleep(3000);
		Select End_Evngsession=new Select(driver.findElement(By.xpath("//select[@id='evening_end_1']")));
		End_Evngsession.selectByIndex(15);
	}

	@Test(priority=31)// dependsOnMethods={"Monday"})
	public void Tuesday() throws InterruptedException
	{
		Thread.sleep(5000);
		Select Start_Morngsession=new Select(driver.findElement(By.xpath("//select[@id='morning_start_2']")));
		Start_Morngsession.selectByIndex(3);
		Thread.sleep(3000);
		Select End_Morngsession=new Select(driver.findElement(By.xpath("//select[@id='morning_end_2']")));
		End_Morngsession.selectByIndex(17);
		Thread.sleep(3000);
		Select Start_Evngsession=new Select(driver.findElement(By.xpath("//select[@id='evening_start_2']")));
		Start_Evngsession.selectByIndex(3);
		Thread.sleep(3000);
		Select End_Evngsession=new Select(driver.findElement(By.xpath("//select[@id='evening_end_2']")));
		End_Evngsession.selectByIndex(15);
	}

	@Test(priority=32)//, dependsOnMethods={"Tuesday"})
	public void Wednesday() throws InterruptedException
	{
		Thread.sleep(5000);
		Select Start_Morngsession=new Select(driver.findElement(By.xpath("//select[@id='morning_start_3']")));
		Start_Morngsession.selectByIndex(3);
		Thread.sleep(3000);
		Select End_Morngsession=new Select(driver.findElement(By.xpath("//select[@id='morning_end_3']")));
		End_Morngsession.selectByIndex(17);
		Thread.sleep(3000);
		Select Start_Evngsession=new Select(driver.findElement(By.xpath("//select[@id='evening_start_3']")));
		Start_Evngsession.selectByIndex(3);
		Thread.sleep(3000);
		Select End_Evngsession=new Select(driver.findElement(By.xpath("//select[@id='evening_end_3']")));
		End_Evngsession.selectByIndex(15);
	}

	@Test(priority=33)//, dependsOnMethods={"Wednesday"})
	public void Thursday() throws InterruptedException
	{
		Thread.sleep(5000);
		Select Start_Morngsession=new Select(driver.findElement(By.xpath("//select[@id='morning_start_4']")));
		Start_Morngsession.selectByIndex(3);
		Thread.sleep(3000);
		Select End_Morngsession=new Select(driver.findElement(By.xpath("//select[@id='morning_end_4']")));
		End_Morngsession.selectByIndex(17);
		Thread.sleep(3000);
		Select Start_Evngsession=new Select(driver.findElement(By.xpath("//select[@id='evening_start_4']")));
		Start_Evngsession.selectByIndex(3);
		Thread.sleep(3000);
		Select End_Evngsession=new Select(driver.findElement(By.xpath("//select[@id='evening_end_4']")));
		End_Evngsession.selectByIndex(15);
	}

	@Test(priority=34)//, dependsOnMethods={"Thursday"})
	public void Friday() throws InterruptedException
	{
		Thread.sleep(5000);
		Select Start_Morngsession=new Select(driver.findElement(By.xpath("//select[@id='morning_start_5']")));
		Start_Morngsession.selectByIndex(3);
		Thread.sleep(3000);
		Select End_Morngsession=new Select(driver.findElement(By.xpath("//select[@id='morning_end_5']")));
		End_Morngsession.selectByIndex(17);
		Thread.sleep(3000);
		Select Start_Evngsession=new Select(driver.findElement(By.xpath("//select[@id='evening_start_5']")));
		Start_Evngsession.selectByIndex(3);
		Thread.sleep(3000);
		Select End_Evngsession=new Select(driver.findElement(By.xpath("//select[@id='evening_end_5']")));
		End_Evngsession.selectByIndex(15);
	}

	@Test(priority=35)//, dependsOnMethods={"Friday"})
	public void Saturday() throws InterruptedException
	{
		Thread.sleep(5000);
		Select Start_Morngsession=new Select(driver.findElement(By.xpath("//select[@id='morning_start_6']")));
		Start_Morngsession.selectByIndex(3);
		Thread.sleep(3000);
		Select End_Morngsession=new Select(driver.findElement(By.xpath("//select[@id='morning_end_6']")));
		End_Morngsession.selectByIndex(17);
		Thread.sleep(3000);
		Select Start_Evngsession=new Select(driver.findElement(By.xpath("//select[@id='evening_start_6']")));
		Start_Evngsession.selectByIndex(3);
		Thread.sleep(3000);
		Select End_Evngsession=new Select(driver.findElement(By.xpath("//select[@id='evening_end_6']")));
		End_Evngsession.selectByIndex(15);
	}

	@Test(priority=36)//, dependsOnMethods={"Saturday"})
	public void Sunday() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//tr[@id='tr_7']/td[4]/button")).click();
	}

	@Test(priority=37)//, dependsOnMethods={"Sunday"})
	public void cancel() throws InterruptedException 
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='schedule-btn-group justify-content-center']/button[1]")).click();
	}

	@Test(priority=38)//, dependsOnMethods={"cancel"})
	public void submit() throws InterruptedException 
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='schedule-btn-group justify-content-center']/button[2]")).click();
	}

	@Test(priority=39)//, dependsOnMethods={"submit"})
	public void AccessElite() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='main-content']/div[2]/ul/li[2]")).click();
		Thread.sleep(5000);
	}

	@Test(priority=40)//, dependsNoMethods={"AccessElite"})
	public void WeeklyView() throws InterruptedException 
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='schedule-subtab1']/div/div/div/table/tbody/tr/td[2]/table/tbody/tr[1]/td/span/a[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='schedule-subtab1']/div/div/div/table/tbody/tr/td[4]/table/tbody/tr[1]/td/span/a[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='5_72']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='5_76']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='5_81']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='6_70']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='6_79']")).click();
		Thread.sleep(3000);	
	}

	@Test(priority=41)//, dependsOnMethods={"WeeklyView"})
	public void MontlyView() throws InterruptedException 
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//ul[@class='nav nav-tabs appointment-tabs tabs-2 appointment-subtabs']/li[2]")).click();
		Thread.sleep(3000);
	}

	@Test(priority=42)//, dependsOnMethods={"MontlyView"})
	public void Selectingdate() throws InterruptedException
	{
		Thread.sleep(5000);
		String month="July";
		String year="2020";
		String date="01";
		while(true){
			String element = driver.findElement(By.xpath("//div[@id='schedule-subtab2']/div[1]/div/div[1]/div/p")).getText();
			if(element.equals(month)) 
			{ 
				String ele= driver.findElement(By.xpath("//div[@id='schedule-subtab2']/div[1]/div/div[1]/div/h3")).getText();
				if(ele.equals(year))
				{
					break;
				}}
			else
			{

				driver.findElement(By.xpath("//div[@id='schedule-subtab2']/div[1]/div/div[1]/a[2]/span[2]")).click();		
			}
		}
		driver.findElement(By.xpath("//div[@id='schedule-subtab2']/div[1]/div/div[3]/div/div/a[contains(text(),"+date+")]")).click();
		Thread.sleep(5000);
	}

	@Test(priority=43)//, dependsOnMethods={"Selectingdate"})
	public void Selectingreset() throws InterruptedException
	{
		String data="Fri, Jul 3rd";
		while(true)
		{
			String Lists=driver.findElement(By.xpath("//div[@id='day_wise_schedules']/div[1]/div[2]")).getText();
			if(Lists.equals(data))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//div[@id='day_wise_schedules']/div[1]/div[3]/span")).click();
			}
		}
		Thread.sleep(4000);
		Select Start_Morngsession=new Select(driver.findElement(By.xpath("//select[@id='morning_start']")));
		Start_Morngsession.selectByIndex(3);
		Thread.sleep(3000);
		Select End_Morngsession=new Select(driver.findElement(By.xpath("//select[@id='morning_end']")));
		End_Morngsession.selectByIndex(17);
		Thread.sleep(3000);
		Select Start_Evngsession=new Select(driver.findElement(By.xpath("//select[@id='evening_start']")));
		Start_Evngsession.selectByIndex(3);
		Thread.sleep(3000);
		Select End_Evngsession=new Select(driver.findElement(By.xpath("//select[@id='evening_end']")));
		End_Evngsession.selectByIndex(15);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='slots_wise_schedules_id']/table/tbody/tr[1]/td[3]/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='slots_wise_schedules_id']/table/tbody/tr[2]/td[3]/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='slots_wise_schedules_id']/table/tbody/tr[3]/td[2]/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='slots_wise_schedules_id']/table/tbody/tr[4]/td[5]/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='modal-footer justify-content-center']/button[1]")).click();
	}

	@Test(priority=44)//, dependsOnMethods={"Selectingdate"})
	public void Selectingsubmit() throws InterruptedException
	{
		Thread.sleep(4000);
		Select Start_Morngsession=new Select(driver.findElement(By.xpath("//select[@id='morning_start']")));
		Start_Morngsession.selectByIndex(3);
		Thread.sleep(3000);
		Select End_Morngsession=new Select(driver.findElement(By.xpath("//select[@id='morning_end']")));
		End_Morngsession.selectByIndex(17);
		Thread.sleep(3000);
		Select Start_Evngsession=new Select(driver.findElement(By.xpath("//select[@id='evening_start']")));
		Start_Evngsession.selectByIndex(3);
		Thread.sleep(3000);
		Select End_Evngsession=new Select(driver.findElement(By.xpath("//select[@id='evening_end']")));
		End_Evngsession.selectByIndex(15);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='slots_wise_schedules_id']/table/tbody/tr[1]/td[3]/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='slots_wise_schedules_id']/table/tbody/tr[2]/td[3]/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='slots_wise_schedules_id']/table/tbody/tr[3]/td[2]/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='slots_wise_schedules_id']/table/tbody/tr[4]/td[5]/button")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='modal-footer justify-content-center']/button[2]")).click();
	}
	@Test(priority=45)//, dependsOnMethods={"Selectingdate"})
	public void scheduleback() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='left-panel']/ul[1]/a[3]/li")).click();
	}

}
