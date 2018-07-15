package tests.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import lib.selenium.WebDriverServiceImpl;

public class MyEditLeadsPage extends WebDriverServiceImpl{


	public MyEditLeadsPage(/*EventFiringWebDriver driver,ExtentTest test*/)
	{

		/*this.driver=driver;
		this.test=test;*/
		PageFactory.initElements(driver, this);
	}
	@Then("navigate to EditLead Page")
	public void navEditLeadPage()
	{
		System.out.println("Navigate to the Editlead pages");
	}
	@FindBy(id="updateLeadForm_companyName")
	WebElement eleCmpnyName;
	@And("clear existing company name")
	public MyEditLeadsPage clearCmpnyName()
	{
		clear(eleCmpnyName);
		return this;
	}

	@FindBy(id="updateLeadForm_companyName")
	WebElement eleUptCmpnyName;
	@And("update company name as (.*)")
	public MyEditLeadsPage UpdateCmpnyName(String data)
	{
		type(eleUptCmpnyName, data);
		return this;
	}

	@FindBy(xpath="//input[@value='Update']")
	WebElement eleClickEditUpd;
	@Then("click update")
	public void clickEditUpdate() {
		click(eleClickEditUpd);
		//return new MyEditLeadsViewPage(driver, test);	
	}

}
