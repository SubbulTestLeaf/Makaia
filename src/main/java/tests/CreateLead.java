package tests;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data_reader.ReadExcel;
import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;
import tests.page.MyCreateLeadsPage;
import tests.page.MyHomePage;
import tests.page.MyLeadsPage;
import tests.page.MyViewLeadsPage;

public class CreateLead extends PreAndPost{

	@BeforeTest
	public void setValue()
	{
		testCaseName="TC_001";
		testCasedescription="Create a new CreateLead";
		nodeName="nodes";
		authorName="Subbu";
		category="smoke";
		sheeetName="CreateLead";				
	}
	@Test(dataProvider="SIT")
	//@Test(groups="smoke")
	public void createLead(String cName, String fName, String lName ) {
	/*new MyHomePage().LeadsClick()
		.clickCreateLeads()
		.typeCmpnyName(cName).typeFirstName(fName).typeLastName(lName).CreateLeadSubmit();*/
		//new MyViewLeadsPage()

		
		WebElement eleCreateLead = locateElement("link", "Create Lead");
		click(eleCreateLead);
		WebElement eleCompName = locateElement("id", "createLeadForm_companyName");
		type(eleCompName,cName);
		WebElement eleFirstName = locateElement("id", "createLeadForm_firstName");
		type(eleFirstName,fName);
		WebElement eleLastName = locateElement("id", "createLeadForm_lastName");
		type(eleLastName,lName);	
		/*WebElement elephoneAreaCode = locateElement("id", "createLeadForm_primaryPhoneAreaCode");
		type(elephoneAreaCode, aCode);

		WebElement elephonenum = locateElement("id", "createLeadForm_primaryPhoneNumber");
		type(elephonenum, pNum);
		WebElement eleEmail = locateElement("id", "createLeadForm_primaryEmail");
		type(eleEmail, eMail);
		WebElement eleDropDownSource = locateElement("id", "createLeadForm_dataSourceId");
		selectDropDownUsingVisibleText(eleDropDownSource, "Direct Mail");

		WebElement eleDropIndex = locateElement("id", "createLeadForm_marketingCampaignId");
		selectDropDownUsingIndex(eleDropIndex,2 );*/
		
		WebElement eleSubCreateLead = locateElement("name", "submitButton");
		click(eleSubCreateLead);
	}



}






