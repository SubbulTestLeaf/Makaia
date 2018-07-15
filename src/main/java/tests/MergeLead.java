package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;
import tests.page.MyHomePage;

public class MergeLead extends PreAndPost{
	@BeforeTest
	public void setValue()
	{
		 testCaseName="TC_004";
		 testCasedescription="Create the MergeLead";
		 nodeName="nodes";
		 authorName="Subbu";
		 category="sanity";
		 sheeetName="MergeLead";				
	}
	//@Test(enabled=false)
	
	@Test(dataProvider="mergeId")
	public  void mergelead(String Fid, String Tid) throws InterruptedException {
		
		new MyHomePage(/*driver, test*/).LeadsClick().clickMergeLead().clickfromLead().typeFromID(Fid).clickFindLeadsFrom().clickIDFrom()
		.clickToLead().typeToID(Tid).clickFindLeadsTo().clickIDTo().clickMergeFTLead();


		/*WebElement eleCreateLead = locateElement("link", "Create Lead");
		click(eleCreateLead);	

		WebElement eleMergeLead = locateElement("link", "Merge Leads");
		click(eleMergeLead);

		WebElement eleFromLead = locateElement("XPath", "(//img[@alt='Lookup'])[1]");
		click(eleFromLead);
		switchToWindow(1);
		verifyExactTitle(getAlertText());

		WebElement eleNavigateFromLead = locateElement("XPath", "//input[@name='id']");
		type(eleNavigateFromLead, Fid);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement eleClickFindlead = locateElement("XPath", "//button[text()='Find Leads']");
		click(eleClickFindlead);
		WebElement eleIDSelect = locateElement("link", Fid);
		click(eleIDSelect);
		switchToWindow(0);
		verifyExactTitle(getAlertText());
		WebElement eleToLead = locateElement("XPath", "(//img[@alt='Lookup'])[2]");
		click(eleToLead);
		switchToWindow(1);
		WebElement eleEnterToLeadId = locateElement("XPath", "//input[@name='id']");
		type(eleEnterToLeadId, Tid);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement eleclickFindLead = locateElement("XPath", "(//button[@type='button'])[1]");
		click(eleclickFindLead);

		WebElement eleToIDSelect = locateElement("link", Tid);
		click(eleToIDSelect);
		switchToWindow(0);

		WebElement elemergeLead = locateElement("link", "Merge");
		click(elemergeLead);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		acceptAlert();*/
	}
	/*@DataProvider(name="mergeId")
	public String[][] getdata3()
	{
		String[][] data = new String[1][2];
		data[0][0]="11191";
		data[0][1]="11193";
		return data;
		
	}*/

}
