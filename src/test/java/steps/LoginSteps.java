/*package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	ChromeDriver driver;
	@Given("open the Browser")
public void lanuchBrowser()
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver = new ChromeDriver();
	
}
	@And("Launch the URL")
	public void launchURL()
	{
		driver.get("http://leaftaps.com/opentaps/");
	}
	
	@And("Set timeouts")
	public void setTimeout()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@And("Maximize the window")
	public void maxWindow()
	{
		driver.manage().window().maximize();
	}
	@And("Enter username as (.*)")
	public void typeUsername(String username)
	{
		driver.findElementById("username").sendKeys(username);
	}	
	
	@And("Enter Password as (.*)")
	public void typePassword(String password)
	{
		driver.findElementById("password").sendKeys(password);
	}	
	@When("Click login")
	public void clickLogin()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	
	@Then("login success")
	public void login()
	{
		System.out.println("Login successfull");
	}
	
	
	@When("clickCRMSF")
	public void clickCRMSF()
	{
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@When("ClickLeads")
	public void clickLeads()
	{
		driver.findElementByLinkText("Leads").click();
	}
	
	@When("click creadLeads")
	public void clickCreateLeads()
	{
		driver.findElementByLinkText("Create Lead").click();
	}
	@And("Enter companyName as (.*)")
	public void typeCmpnyName(String Cname)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(Cname);
	}
	
	@And("Enter FirstName as (.*)")
	public void typeFirstName(String Fname)
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(Fname);
	}
	
	@And("Enter LastName as (.*)")
	public void typeLastName(String Lname)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(Lname);
	}
	@When("clickCreateLead")
	public void clickCreateLead()
	{
		driver.findElementByName("submitButton").click();
	}
	@But("failedMethod")
	public void getFailMethod()
	{
		System.out.println("The TC is failed");
	}

}
*/