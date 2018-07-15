package tests.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;

public class MyViewLeadsPage extends WebDriverServiceImpl{


	public MyViewLeadsPage(/*EventFiringWebDriver driver,ExtentTest test*/)
	{
		/*
		this.driver=driver;
		this.test=test;*/
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="viewLead_firstName_sp")
	WebElement eleViewFirstName;


	public void getFirstName(String data4)
	{
	/*	verifyExactAttribute(eleViewFirstName, "value", data4);*/
		
		String text = eleViewFirstName.getText();
		System.out.println(text);
	}
	
	@FindBy(linkText="Edit")
	WebElement eleClickEdit;
	public MyEditLeadsPage clickEdit() {
		click(eleClickEdit);
		return new MyEditLeadsPage(/*driver, test*/);	
	}
	
}
