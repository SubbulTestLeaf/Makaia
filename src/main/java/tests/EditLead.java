package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;
import tests.page.MyHomePage;
import tests.page.MyHomePage;

public class EditLead extends PreAndPost{
	@BeforeTest
	public void setValue()
	{
		 testCaseName="TC_002";
		 testCasedescription="Update the EditLead";
		 nodeName="nodes";
		 authorName="Subbu";
		 category="Functional";
		 sheeetName="EditLead";				
	}
	
	@Test(dataProvider="editdata")
	//@Test(groups="smoke")
	public void editlead( String EditCmny) {
		//To Edit need to write create lead inputs and all
		
		new MyHomePage(/*driver, test*/).LeadsClick().clickFindLeadsForEdit().clickResultID().clickEditLeads()
		.clearCmpnyName().UpdateCmpnyName(EditCmny).clickEditUpdate();
		
		/*new MyHomePageEdit(driver, test).LeadsClickForEdit().clickFindLeads().clickFirstID().clickEditLeads()
		.clearCmpnyName().UpdateCmpnyName(EditCmny).clickEditUpdate();*/
		
		
		/*WebElement eleCreateLead = locateElement("link", "Create Lead");
		click(eleCreateLead);
		WebElement eleCompName = locateElement("id", "createLeadForm_companyName");
		type(eleCompName,cName);
		WebElement eleFirstName = locateElement("id", "createLeadForm_firstName");
		type(eleFirstName,fName);
		WebElement eleLastName = locateElement("id", "createLeadForm_lastName");
		type(eleLastName,lName);

		WebElement elephoneAreaCode = locateElement("name", "primaryPhoneAreaCode");
		type(elephoneAreaCode, "91");

		WebElement elephonenum = locateElement("name", "primaryPhoneNumber");
		type(elephonenum, "9578854377");

		WebElement eleEmail = locateElement("id", "createLeadForm_primaryEmail");
		type(eleEmail, "vinu94suji@gmail.com");

		WebElement eleDropDownSource = locateElement("id", "createLeadForm_dataSourceId");
		selectDropDownUsingVisibleText(eleDropDownSource, "Direct Mail");
		
		WebElement eleDropIndex = locateElement("id", "createLeadForm_marketingCampaignId");
		selectDropDownUsingIndex(eleDropIndex, 2);
		
		WebElement eleSubCreateLead = locateElement("name", "submitButton");
		click(eleSubCreateLead);
		WebElement eleFindLeads = locateElement("link", "Find Leads");
		click(eleFindLeads);
		WebElement eleFindByID = locateElement("XPath", "//input[@name='id']");
		type(eleFindByID, Editid);
		WebElement eleFindLEads = locateElement("XPath", "//button[text()='Find Leads']");
		click(eleFindLEads);
		WebElement eleResultId = locateElement("link", Editid);
		click(eleResultId);

		WebElement eleedit = locateElement("link", "Edit");
		click(eleedit);

		WebElement eleEditCmpnyName = locateElement("id","updateLeadForm_companyName");
			clear(eleEditCmpnyName);

		WebElement eleUptCmpnyName = locateElement("id", "updateLeadForm_companyName");
		type(eleUptCmpnyName,EditCmny);

		WebElement eleUpdate = locateElement("XPath", "//input[@value='Update']");
		click(eleUpdate);*/


	}
/*@DataProvider(name="editdata")

public String[][] getdata2()
{
	String[][] data=new String[1][2];
	data[0][0]="10664";
	data[0][1]="Highroads";
	
	
	return data;
	
	
}*/
}
