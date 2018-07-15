package tests.page;

import org.jsoup.select.Evaluator.Id;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import lib.selenium.WebDriverServiceImpl;

public class MyFindLeadsPage extends WebDriverServiceImpl {

	public MyFindLeadsPage(/*EventFiringWebDriver driver,ExtentTest test*/)
	{

		/*this.driver=driver;
		this.test=test;*/
		PageFactory.initElements(driver, this);
	}
	/*@FindBy(linkText="Find Leads")
	WebElement eleClickFindLeadsTab;
	public void clickFindLeadsTab()

	{
	click(eleClickFindLeadsTab);	

	}*/

	/*@FindBy(xpath="(//input[@name='firstName'])[3]")
	WebElement eleEnterFnameFindLeads;

	public MyFindLeadsPage getTypeFname(String EditfName)
	{
		type(eleEnterFnameFindLeads, EditfName);
		return this;
	}*/

	@FindBy(xpath="//input[@name='id']")
	WebElement eleFirstID;
	@When("Enter AccID in LeadID as (.*)")
	public MyFindLeadsPage clickFirstID(String id) {
		type(eleFirstID, id);
		return this;

	}

	@FindBy(xpath="//button[text()='Find Leads']")
	WebElement eleFirstIDFind;
	@And("clickFindLead")
	public MyFindLeadsPage clickFirstIDFind() {
		click(eleFirstIDFind);
		return this;

	}
	@FindBy(xpath="(//a[@class='linktext'])[4]")
	WebElement eleResultID;
	@And("select Result id")
	public MyViewLeadsPageAfterClickFirstId clickResultID() {
		click(eleResultID);
		return new MyViewLeadsPageAfterClickFirstId(/*driver, test*/);

	}
	/*@FindBy(xpath="(//a[@class='linktext'])[4]")
	WebElement elegeID;
	public MyViewLeadsPageGetIDFirstId getID(String data4)
	{
		verifyExactAttribute(eleViewFirstName, "value", data4);
		click(elegeID);
		String id = elegeID.getText();
		id=id.replaceAll("[^a-zA-Z]", "");
		return new MyViewLeadsPageGetIDFirstId(driver, test);
	}	*/





}
