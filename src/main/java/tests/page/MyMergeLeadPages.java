package tests.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class MyMergeLeadPages extends WebDriverServiceImpl{
	public MyMergeLeadPages(EventFiringWebDriver driver,ExtentTest test) throws InterruptedException
	{
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
		Thread.sleep(3000);

	}
	@FindBy(xpath="(//img[@alt='Lookup'])[1]")
	WebElement eleFromLeads;
	
	public MyFindleadsWindow clickfromLead() throws InterruptedException
	{
		click(eleFromLeads);
		
		verifyExactTitle(getAlertText());
		switchToWindow(1);
		return new MyFindleadsWindow(driver, test);
		
	}
	@FindBy(xpath="(//img[@alt='Lookup'])[2]")
	WebElement eleToLeads;
	
	public MyFindleadsWindow clickToLead() throws InterruptedException 
	{
		click(eleToLeads);
		
		verifyExactTitle(getAlertText());
		switchToWindow(1);
		return new MyFindleadsWindow(driver, test);
		
	}
	@FindBy(linkText="Merge")
	WebElement eleMergeLeads;
	
	public void clickMergeFTLead()
	{
		click(eleMergeLeads);
		
		verifyExactTitle(getAlertText());
		acceptAlert();
		
		//return new MyFindleadsWindow(driver, test);
		
	}
}
