package tests.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lib.selenium.WebDriverServiceImpl;

public class MyViewLeadsPageAfterClickFirstId extends WebDriverServiceImpl{

	public MyViewLeadsPageAfterClickFirstId(/*EventFiringWebDriver driver,ExtentTest test*/)
	{
		
		/*this.driver=driver;
		this.test=test;*/
		PageFactory.initElements(driver, this);
	}
	
	//To capture ID
		/*@FindBy(xpath="(//span[@class='tabletext'])[3]")
		WebElement elegetID;
		public MyViewLeadsPageAfterClickFirstId getID(String AccID)
		{
			//verifyExactAttribute(elegetID, "value", data4);
			//click(elegetID);
			MyFindLeadsPage flp = new MyHomePage(driver, test).LeadsClick().clickFindLeads();
			
			String firstLeadID =  flp.getText(ele)
			AccID1=AccID1.replaceAll("[^a-zA-Z]", "");
			System.out.println(AccID1);
			return this;
		}
	*/
	@Then("Navigate to view lead page")
	public void viewLead()
	
	{
		System.out.println("View Lead pages");
	}
	@FindBy(linkText="Edit")
	WebElement eleClickEditLead;
	@When("clickEditButton")
	public MyEditLeadsPage clickEditLeads()
	{
		click(eleClickEditLead);
		return new MyEditLeadsPage(/*driver, test*/);
	}
	
	@FindBy(linkText="Delete")
	WebElement eleClickdeleLead;
	public MyFindLeadsAfterDelPage clickDeleteLeads()
	{
		click(eleClickdeleLead);
		return new MyFindLeadsAfterDelPage(driver, test);
	}
	@FindBy(linkText="Duplicate Lead")
	WebElement eleClickDupLead;
	public MyDupLeadsPage clickDupLeads()
	{
		click(eleClickDupLead);
		return new MyDupLeadsPage(driver, test);
	}
}
