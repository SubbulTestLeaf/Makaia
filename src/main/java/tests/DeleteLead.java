package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;
import tests.page.MyHomePage;

public class DeleteLead extends PreAndPost{
	@BeforeTest
	//@Test(dependsOnMethods= {"tests.CreateLead.createLead"},alwaysRun=true)
	public void setValue()
	{
		 testCaseName="TC_005";
		 testCasedescription="Create the DuplicateLead";
		 nodeName="nodes";
		 authorName="Subbu";
		 category="Regression";
		 sheeetName="DeleteLead";				
	}
	@Test(dataProvider="DeleteRecords")
	public void deletelead(String id) {
		
		new MyHomePage(/*driver, test*/).LeadsClick().clickFindLeads()
		.clickFirstID(id).clickFirstIDFind().clickResultID()
		.clickDeleteLeads().ClickFindLeadAfterDel().ClickFindLeadAfterid().typeDeletedID(id).ClickFindLeadAfterid()
		.VerifyError();
		
		
		/*
		
		WebElement eleCreateLead = locateElement("link", "Create Lead");
		click(eleCreateLead);	
		WebElement eleFindLeads = locateElement("link", "Find Leads");
		click(eleFindLeads);
		WebElement eleFirstdata = locateElement("XPath", "(//a[@class='linktext'])[4]");
		click(eleFirstdata);		
		WebElement eleCmpnyNamewithID = locateElement("id", "viewLead_companyName_sp");
		String text = eleCmpnyNamewithID.getText();
		text=text.replaceAll("[^a-zA-Z]", "");
		System.out.println(text);
		WebElement eleFindByfName = locateElement("XPath", "(//input[@name='firstName'])[3]");
		type(eleFindByfName, fName);
		WebElement eleFindByCName = locateElement("XPath", "(//input[@name='companyName'])[2]");
		type(eleFindByCName, cName);
		WebElement eleFindLEads = locateElement("XPath", "//button[text()='Find Leads']");
		click(eleFindLEads);
		WebElement eleResultId = locateElement("link", "(//a[@class='linktext'])[4]");
		click(eleResultId);	
		String text = eleResultId.getText();
		System.out.println(text);
		WebElement eleDelete = locateElement("link", "Delete");
		click(eleDelete);
		WebElement eleVerifyIDFindLeads = locateElement("link", "Find Leads");
		click(eleVerifyIDFindLeads);
		WebElement eleEnterDeletedID = locateElement("XPath", "//input[@name='id']");
		type(eleEnterDeletedID, text);
		WebElement eleFindLeadsVer = locateElement("XPath", "//button[text()='Find Leads']");
		click(eleFindLeadsVer);
		WebElement eleVerifyErrorMsg = locateElement("class", "x-paging-info");
		verifyExactText(eleVerifyErrorMsg, "No records to display");
	}*/
	/*@DataProvider(name="DeleteRecords",indices=0)
	public String[][] getdata1()
	{
		String data[][]=new String[1][1];
		data[0][0]="11167";
		return data;
		
	}*/

}
}

