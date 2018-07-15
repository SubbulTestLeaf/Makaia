package tests.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class MyDupLeadsPage extends WebDriverServiceImpl {
	
	public MyDupLeadsPage(EventFiringWebDriver driver,ExtentTest test)
	{
		
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="submitButton")
	WebElement eleSubDup;
	public MyViewLeadsPage clickSubmitDup()
	{
		click(eleSubDup);
		return new MyViewLeadsPage(/*driver, test*/);
	}
}
