package learninhooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import lib.selenium.WebDriverServiceImpl;

public class LearnHooks extends WebDriverServiceImpl{
	@Before
	public void beforeScenario(Scenario sc)
	{
		startReport();
		startTestCase(sc.getName(), sc.getId());
		startModule("nodes");
		test.assignAuthor("Subbu");
		test.assignCategory("Smoke");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		webdriver = new ChromeDriver();
		driver = new EventFiringWebDriver(webdriver);
		driver.register(this);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("beforeMethod");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);
		
		System.out.println(sc.getName());
		System.out.println(sc.getId());
			
		
	}
	@After
	public void afterScenario(Scenario sc)
	{
		endReult();
		closeActiveBrowser();

		/*System.out.println(sc.getStatus());
	System.out.println(sc.isFailed());*/
	}

}
