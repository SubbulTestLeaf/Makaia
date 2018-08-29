package lib.selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import data_reader.ReadExcel;

public class PreAndPost extends WebDriverServiceImpl {

	public String testCaseName,testCasedescription,nodeName,authorName,category,sheeetName;
	//@BeforeMethod(groups="smoke")
	@Parameters({"url","userName","Password"}) 
	@BeforeMethod()
	public void beforeMethod(String url,String UsrNme,String pswrd) {
		startModule(nodeName);
		test.assignAuthor(authorName);
		test.assignCategory(category);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		webdriver = new ChromeDriver();
		driver = new EventFiringWebDriver(webdriver);
		driver.register(this);
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("beforeMethod");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, UsrNme);
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, pswrd);
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);
		click(locateElement("link", "Leads"));
	}
	@DataProvider(name="SIT")
	public String[][] getdata() throws IOException
	{
		ReadExcel excel = new ReadExcel();
		String[][] createLeadData = excel.readExcelData(sheeetName);
		return createLeadData;
	}
	/*@DataProvider(name="editdata")
	public String[][] getdata() throws IOException
	{
		ReadExcel excel = new ReadExcel();
		String[][] editLeadData = excel.readExcelData(sheeetName);
		return editLeadData;
	}*/
	 	/*@DataProvider(name="duplicate")
	public String[][] getdata() throws IOException
	{
		ReadExcel excel = new ReadExcel();
		String[][] editLeadData = excel.readExcelData(sheeetName);
		return editLeadData;
	}*/
	/*@DataProvider(name="mergeId")
	public String[][] getdata() throws IOException
	{
		ReadExcel excel = new ReadExcel();
		String[][] editLeadData = excel.readExcelData(sheeetName);
		return editLeadData;
	}*/
	/*@DataProvider(name="DeleteRecords")
	public String[][] getdata() throws IOException
	{
		ReadExcel excel = new ReadExcel();
		String[][] editLeadData = excel.readExcelData(sheeetName);
		return editLeadData;
	}*/
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
		closeActiveBrowser();
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
		startTestCase(testCaseName, testCasedescription);	
	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}


	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
		startReport();
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
		endReult();
	}

}