package lib.reports;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import lib.selenium.PreAndPost;

public abstract class Reports {
	public static ExtentHtmlReporter html;
	public static ExtentReports extent;
	public static ExtentTest testSuite;
	public static ExtentTest test;
	//@BeforeSuite
	public void startReport()
	{
		html = new ExtentHtmlReporter("./Reports/result.html");
		html.setAppendExisting(true);
		html.loadXMLConfig("./src/test/resources/extent-config.xml");
		extent = new ExtentReports();
		extent.attachReporter(html);

	}
	//@BeforeClass
	public ExtentTest startTestCase(String testCaseName,String testCasedescription)
	{
		testSuite = extent.createTest(testCaseName, testCasedescription);

		return testSuite;

	}
	//@BeforeMethod
	public ExtentTest startModule(String nodes)
	{
		test = testSuite.createNode(nodes);
		return test;

	}
	//@AfterSuite
	public void endReult()

	{
		extent.flush();
	}
	public abstract long takeSnap();
	public void reportsStep(String desc,String status)
	{
		MediaEntityModelProvider img = null;

		long snapNumber = 1000000L;
		snapNumber = takeSnap();
		try {
			img = MediaEntityBuilder.createScreenCaptureFromPath("./../Reports/images/"+snapNumber+".png").build();
			
		} catch (IOException e) {			
		}
		
		if(status.equalsIgnoreCase("PASS"))
		{
			test.pass(desc,img);
		}else if(status.equalsIgnoreCase("FAIL")) {
			test.fail(desc, img);
			throw new RuntimeException();
		}else if(status.equalsIgnoreCase("WARNING")) {
			test.warning(desc, img);		
		}else {
			test.info(desc);
		}
	}

}
