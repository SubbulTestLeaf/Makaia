package tests.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import lib.selenium.WebDriverServiceImpl;

public class MyCreateLeadsPage extends WebDriverServiceImpl{


	public MyCreateLeadsPage(/*EventFiringWebDriver driver,ExtentTest test*/)
	{
		/*
		this.driver=driver;
		this.test=test;*/
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="createLeadForm_companyName")
	WebElement eleCmpnyName;
	@And("Enter companyName as (.*)")

	public MyCreateLeadsPage typeCmpnyName(String cmpnyName)
	{
		type(eleCmpnyName, cmpnyName);

		return this;
	}
	public void getTypedCmpnyName(String data)
	{
		verifyExactAttribute(eleCmpnyName, "value", data);
	}
	@FindBy(id="createLeadForm_firstName")
	WebElement eleFirstName;
	@And("Enter FirstName as (.*)")
	public MyCreateLeadsPage typeFirstName(String firstName)
	{
		type(eleFirstName, firstName);

		return this;
	}
	public void getTypedFirstName(String data1)
	{
		verifyExactAttribute(eleFirstName, "value", data1);
	}
	//
	@FindBy(id="createLeadForm_lastName")
	WebElement eleLastName;
	@And("Enter LastName as (.*)")
	public MyCreateLeadsPage typeLastName(String lastName)
	{
		type(eleLastName, lastName);

		return this;
	}
	public void getTypedLastName(String data3)
	{
		verifyExactAttribute(eleLastName, "value", data3);
	}
	@FindBy(name="submitButton")
	WebElement eleCreateClick;
	@When("clickCreateLead")
	public MyViewLeadsPage CreateLeadSubmit()
	{
		click(eleCreateClick);
		return new MyViewLeadsPage(/*driver, test*/);
	}
}
