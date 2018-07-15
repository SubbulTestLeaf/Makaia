package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class CreateAccount extends PreAndPost{
	@Test
	public void main() throws InterruptedException {

		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);
		WebElement eleAccount = locateElement("link", "Create Account");
		eleAccount.click();
		WebElement eleAccountName = locateElement("XPath", "//input[@id='accountName']");
		type(eleAccountName, "RANJINISK");
		WebElement eleIndustry = locateElement("XPath", "//select[@name='industryEnumId']");
		selectDropDownUsingVisibleText(eleIndustry, "Health Care");
		WebElement eleCurrencySel = locateElement("XPath", "//select[@name='currencyUomId']");
		selectDropDownUsingValue(eleCurrencySel, "INR");
		WebElement eleSourceID = locateElement("XPath", "//select[@id='dataSourceId']");
		selectDropDownUsingIndex(eleSourceID, 4);
		WebElement eleMarketComp = locateElement("XPath", "//select[@id='marketingCampaignId']");
		selectDropDownUsingIndex(eleMarketComp, 7);
		WebElement elePhoneNumber = locateElement("XPath", "//input[@id='primaryPhoneNumber']");
		type(elePhoneNumber, "9578854546");
		WebElement eleCity = locateElement("XPath", "//input[@id='generalCity']");
		type(eleCity, "Chennai");
		WebElement eleEmailAdd = locateElement("XPath", "//input[@id='primaryEmail']");
		type(eleEmailAdd, "vinu94suji@gmail.com");
		WebElement eleCountry = locateElement("XPath", "//select[@name='generalCountryGeoId']");
		selectDropDownUsingVisibleText(eleCountry, "India");
		/*WebElement eleStatePro = locateElement("XPath", "//select[@name='generalStateProvinceGeoId']");
		selectDropDownUsingValue(eleStatePro, "Indiana");*/
		WebElement eleCreateAccount = locateElement("XPath", "//input[@value='Create Account']");
		click(eleCreateAccount);
		WebElement eleCaptureID = locateElement("XPath", "(//span[@class='tabletext'])[3]");
		String text1 = eleCaptureID.getText();
		text1=text1.replaceAll("[^a-zA-Z]", "");
		System.out.println(text1);
		String text2 = eleCaptureID.getText();
		text2=text2.replaceAll("[^0-9]", "");

		System.out.println(text2);
		Thread.sleep(3000);
		WebElement eleFindAcc = locateElement("link", "Find Accounts");
		click(eleFindAcc);
		WebElement eleFindAccountName = locateElement("XPath", "(//input[@name='accountName'])[2]");
		type(eleFindAccountName, text1);
		WebElement eleFindAccID = locateElement("XPath", "//input[@name='id']");
		type(eleFindAccID,text2);
		WebElement eleFindAccountsSearch = locateElement("XPath", "//button[text()='Find Accounts']");
		click(eleFindAccountsSearch);
		Thread.sleep(3000);
		WebElement eleVerifyTextMsg = locateElement("class", "x-paging-info");
		verifyExactText(eleVerifyTextMsg, "Displaying records 1 - 1 of 1");
		//closeActiveBrowser();













	}

}
