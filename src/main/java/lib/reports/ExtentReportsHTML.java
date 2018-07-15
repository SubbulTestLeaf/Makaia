package lib.reports;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsHTML {

	public static void main(String[] args) throws IOException {
		ExtentHtmlReporter html = new ExtentHtmlReporter("./Reports/result.html");
		html.setAppendExisting(true);
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);
		//html.loadXMLConfig("./src/test/resources/extent-config.xml");
		ExtentTest testSuite = extent.createTest("TC001_CreateLead", "Create a new Createlead");
		ExtentTest test = testSuite.createNode("Leads");
		test.assignCategory("Smoke");
		test.assignAuthor("subbu");
		test.pass("The data entered is correctly", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps.snap1.jpg").build());
		test.fail("The Data crmsfa is Entered Successfully");
		test.pass("The Login button is clicked Successfully");
		extent.flush();




	}

}
