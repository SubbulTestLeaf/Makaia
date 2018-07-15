package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;
import tests.page.MyHomePage;

public class DuplicateLead extends PreAndPost{
	@BeforeTest
	public void setValue()
	{
		 testCaseName="TC_003";
		 testCasedescription="Create the DuplicateLead";
		 nodeName="nodes";
		 authorName="Subbu";
		 category="smoke";
		 sheeetName="DuplicateLead";				
	}
	@Test(dataProvider="duplicate")
	public  void duplicatelead(String id) {
		//Duplicate Lead
		new MyHomePage(/*driver, test*/).LeadsClick().clickFindLeadsForDup().clickFirstID(id).clickFirstIDFind().clickResultID()
		.clickDupLeads().clickSubmitDup();
		/*WebElement eleCreateLead = locateElement("link", "Create Lead");
		click(eleCreateLead);	
		WebElement eleDupFindLead = locateElement("link", "Find Leads");
		click(eleDupFindLead);
		WebElement eleEnterEmail = locateElement("link", "Email");
		click(eleEnterEmail);
		WebElement eleDupEmail = locateElement("name", "emailAddress");
		type(eleDupEmail, email);
		WebElement eleFindLeads1 = locateElement("XPath", "(//button[@class='x-btn-text'])[7]");
		click(eleFindLeads1);
		WebElement eledupResultId = locateElement("XPath","(//a[@class='linktext'])[4]");
		click(eledupResultId);
		WebElement DupUpdate = locateElement("link", "Duplicate Lead");
		click(DupUpdate);
		WebElement eleUpdDupLead = locateElement("name", "submitButton");
		click(eleUpdDupLead);*/
	}
	/*@DataProvider(name="duplicate",indices=0)
	public String[][] getdata()
	{
		String[][] data=new String[1][2];
		data[0][0]="vinu94suji@gmail.com";
		data[0][1]="10664";
		
		
		return data;
		
	}*/

}
