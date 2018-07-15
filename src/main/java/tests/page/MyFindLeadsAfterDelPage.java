package tests.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class MyFindLeadsAfterDelPage extends WebDriverServiceImpl{

	public MyFindLeadsAfterDelPage(EventFiringWebDriver driver,ExtentTest test)
	{
		
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Find Leads")
	WebElement eleClickFindLeadAfterDel;
	
	public MyFindLeadsAfterDelPage ClickFindLeadAfterDel()
	{
		click(eleClickFindLeadAfterDel);
		return this;
	}
	@FindBy(xpath="//input[@name='id']")
	WebElement eleEnterDeletedID;
	
	public MyFindLeadsAfterDelPage typeDeletedID(String id)
	{
		type(eleEnterDeletedID, id);
		return this; 
	}
	@FindBy(xpath="//button[text()='Find Leads']")
	WebElement eleFindID;
	
	public MyFindLeadsAfterDelPage ClickFindLeadAfterid()
	{
		click(eleFindID);
		return this;
	}
	@FindBy(className="x-paging-info")
	WebElement eleVerifyError;
	
	public MyFindLeadsAfterDelPage VerifyError()
	{
		verifyExactText(eleVerifyError, "No records to display");
		return this;
	}
	
	

}
