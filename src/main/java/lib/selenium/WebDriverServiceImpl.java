package lib.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.interactions.CompositeAction;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.beust.jcommander.JCommander.Builder;
import com.google.common.collect.ImmutableMap;

import lib.listeners.WebDriverListener;

public class WebDriverServiceImpl extends WebDriverListener implements WebDriverService{
	Actions builder;
	public WebElement locateElement(String locator, String locValue) {

		try {
			switch (locator) {
			case "id": return driver.findElement(By.id(locValue));

			case "class": return driver.findElement(By.className(locValue));

			case "link" : return driver.findElement(By.linkText(locValue));

			case "name" : return driver.findElement(By.name(locValue));

			case "XPath" :return driver.findElement(By.xpath(locValue));

			default:
				break;
			}
		} catch (NoSuchElementException e) {

			System.err.println("The element  locator "+locator+" is not found with "+locValue);
		}
		return null;
	}
	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
			reportsStep("The data " +data+ " is Entered Successfully", "pass");
		} catch (Exception e) {
			reportsStep("The Data "+data+" is not Entered Successfully", "fail");
		}		
	}
	public void click(WebElement ele) {
		ele.click();		
	}

	public String getText(WebElement ele) {
		try {
			ele.getText();
		} catch (NoSuchElementException e) {
			System.err.println("The text is "+ele+ "not present in the ");
		}
		return null;
	}

	public void selectDropDownUsingVisibleText(WebElement ele, String value) {
		try {
			Select SelDrop = new Select(ele);
			SelDrop.selectByVisibleText(value);
		} catch (NoSuchElementException e) {

			System.err.println("Something went wrong to select dropdown" +value);
		}

	}

	public void selectDropDownUsingValue(WebElement ele, String value) {
		Select SelDrop = new Select(ele);
		SelDrop.selectByValue(value);

	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		try {
			Select selDropIndex = new Select(ele);
			selDropIndex.selectByIndex(index);
		} catch (NoSuchElementException e) {
			System.err.println();
			throw new RuntimeException("Unable to locate element with"+index);
		}

	}

	public boolean verifyExactTitle(String expectedTitle) {
		try {
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
		} catch (Exception e) {
			System.err.println("Unable to get the URL and Title"+expectedTitle);

		}

		return false;
	}

	public boolean verifyPartialTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		String text = ele.getText();
		System.out.println(text);
		if(text.contains(expectedText))
		{
			System.out.println("Extected text: "+expectedText+" matched with actual text "+text);
		}
		else
		{
			System.out.println("Extected text: "+expectedText+" doesnot matched with actual text "+text);
		}

	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		System.out.println();

	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
boolean equals = ele.getAttribute(attribute).equals(value);
if (equals==true) {
	System.out.println("The attribute is "+value+" same as value ");
}else
{
	System.out.println("The attaribute"+value+" is NOT same as value");
}

	}
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public void verifySelected(WebElement ele) {


	}

	public void verifyDisplayed(WebElement ele) {
		ele.getText();
	}

	public void switchToWindow(int index) {
		Set<String> Windows = driver.getWindowHandles();
		List<String> allWindows = new ArrayList<String>();
		allWindows.addAll(Windows);
		driver.switchTo().window(allWindows.get(index));

	}

	public void switchToFrame(WebElement ele) {
		try {
			switchToFrame(ele);
		} catch (NoSuchFrameException e) {
			System.err.println("The given frame doesnot contain frame");
		}
	}

	public void acceptAlert() {
		driver.switchTo().alert().accept();

	}

	public void dismissAlert() {

	}

	public String getAlertText() {

		return null;
	}

	public void closeActiveBrowser() {
		driver.close();

	}

	public void closeAllBrowsers() {


	}

	@Override
	public void clear(WebElement ele) {
		ele.clear();

	}


	public void moveToEle(WebElement ele) {
		builder = new Actions(driver); 
		builder.moveToElement(ele).perform();

	}
	public void clickOn(WebElement ele) {
		builder.click().perform();

	}

	public void getCurrentUrl() {
		driver.getCurrentUrl();
		
	}
}
