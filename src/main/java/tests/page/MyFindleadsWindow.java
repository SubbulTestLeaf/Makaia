package tests.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class MyFindleadsWindow extends WebDriverServiceImpl{
		public MyFindleadsWindow(EventFiringWebDriver driver,ExtentTest test) throws InterruptedException
		{
			this.driver=driver;
			this.test=test;
			PageFactory.initElements(driver, this);
			Thread.sleep(3000);
		}
		
		//From lead code
		@FindBy(xpath="//input[@name='id']")
		WebElement eleNavFromLeads;
		public MyFindleadsWindow typeFromID(String Fid)
		{
			type(eleNavFromLeads, Fid);
			return this;
		
		}
		
		@FindBy(xpath="(//button[@type='button'])[1]")
		WebElement eleClickfindLeadsFrom;
		public MyFindleadsWindow clickFindLeadsFrom()
		{
			click(eleClickfindLeadsFrom);
			return this;
		}
		
		@FindBy(xpath="(//a[@class='linktext'])[1]")
	
		WebElement eleClickFromID;
		public MyMergeLeadPages clickIDFrom() throws InterruptedException
		{
			click(eleClickFromID);
			switchToWindow(0);
			return new MyMergeLeadPages(driver, test);
		}
		
		
		//To lead code
		@FindBy(xpath="//input[@name='id']")
		WebElement eleTypeToLeads;
		public MyFindleadsWindow typeToID(String Tid)
		{
			type(eleNavToLeads, Tid);
			return this;
		
		}
		@FindBy(xpath="(//button[@type='button'])[1]")
		WebElement eleNavToLeads;
		public MyFindleadsWindow clickFindLeadsTo()
		{
			click(eleNavToLeads);
			return this;
		}
		
		@FindBy(xpath="(//a[@class='linktext'])[1]")
		WebElement eleClickTpID;
		public MyMergeLeadPages clickIDTo() throws InterruptedException
		{
			click(eleClickTpID);
			switchToWindow(0);
			return new MyMergeLeadPages(driver, test);
		}
		
}
