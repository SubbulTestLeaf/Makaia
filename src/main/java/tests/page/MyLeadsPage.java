package tests.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.When;
import lib.selenium.WebDriverServiceImpl;

public class MyLeadsPage extends WebDriverServiceImpl{


	public MyLeadsPage(/*EventFiringWebDriver driver,ExtentTest test*/)
	{
		/*this.driver=driver;
		this.test=test;*/
		PageFactory.initElements(driver, this);

	}
	@FindBy(linkText="Create Lead")
		WebElement eleCreateLeads;
	@When("click creadLeads")

	public MyCreateLeadsPage clickCreateLeads()
	{
		click(eleCreateLeads);
		return new MyCreateLeadsPage(/*driver, test*/);
	}
	@FindBy(linkText="Find Leads")
	WebElement eleClickFindLeadsedit;
@When("click findleads")
	public MyFindLeadsPage clickFindLeadsForEdit()
	{
		click(eleClickFindLeadsedit);
		return new MyFindLeadsPage(/*driver, test*/);
	}
	
	@FindBy(linkText="Find Leads")
	WebElement eleClickFindLeadsDup;

	public MyFindLeadsPage clickFindLeadsForDup()
	{
		click(eleClickFindLeadsDup);
		return new MyFindLeadsPage(/*driver, test*/);
	}
	@FindBy(linkText="Find Leads")
	WebElement eleClickFindLeadsDel;

	public MyFindLeadsPage clickFindLeads()
	{
		click(eleClickFindLeadsDel);
		return new MyFindLeadsPage(/*driver, test*/);
	}
	@FindBy(linkText="Merge Leads")
	WebElement eleClickMergeLeads;

	public  MyMergeLeadPages clickMergeLead() throws InterruptedException
	{
		click(eleClickMergeLeads);
		return new MyMergeLeadPages(driver, test);
	}
}
