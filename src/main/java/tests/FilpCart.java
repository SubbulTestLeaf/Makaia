package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.DoubleClickAction;
import org.testng.annotations.Test;

import lib.selenium.WebDriverServiceImpl;

public class FilpCart extends WebDriverServiceImpl {
	@Test
	public void main() throws InterruptedException {

		driver.getKeyboard().pressKey(Keys.ESCAPE);
		WebElement TVAppl = locateElement("XPath", "//span[text()='TVs & Appliances']");
		moveToEle(TVAppl);
		Thread.sleep(3000);
		WebElement samsung = locateElement("XPath", "(//span[text()='Samsung'])[2]");
		click(samsung);
		WebElement eleMinAmount = locateElement("XPath", "//select[@class='fPjUPw']");
		selectDropDownUsingValue(eleMinAmount, "25000");
		WebElement eleMaxAmount = locateElement("XPath", "(//select[@class='fPjUPw'])[2]");
		selectDropDownUsingValue(eleMaxAmount, "60000");
		WebElement eleScreenSize = locateElement("XPath", "//div[text()='Screen Size']");
		click(eleScreenSize);
		WebElement eleSize = locateElement("XPath", "//div[text()='48 - 55']");
		click(eleSize);
		/*eleSize.isSelected();
		if(eleSize.isSelected())
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("false");
		}
		 */
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement eleFirstPageAmount = locateElement("XPath", "//div[@class='_1uv9Cb']//div");
		String Amount1 = eleFirstPageAmount.getText();
		System.out.println(Amount1);
		WebElement eleFirstProduct = locateElement("XPath", "//div[@class='_3wU53n']");
		click(eleFirstProduct);
		switchToWindow(1);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement eleSecodPageAmount = locateElement("XPath", "//div[@class='_1uv9Cb']//div");
		String Amount2 = eleSecodPageAmount.getText();
		System.out.println(Amount2);
		if(Amount1.equals(Amount2))
		{
			System.out.println("Both are equal");

		}

		else
		{
			System.out.println("Not equal");
		}
		driver.close();
		switchToWindow(0);
		WebElement eleAddToCpm1 = locateElement("XPath", "//span[text()='Add to Compare']");
		click(eleAddToCpm1);
		WebElement eleAddToCpm2 = locateElement("XPath", "(//span[text()='Add to Compare'])[2]");
		click(eleAddToCpm2);
		WebElement eleCompareTwoProd = locateElement("XPath", "//span[text()='COMPARE']");
		click(eleCompareTwoProd);
		System.out.println(driver.getCurrentUrl());
		System.err.println(driver.getTitle());
		WebElement eleprice1 = locateElement("XPath", "//div[@class='_1vC4OE']");
		String price1 = eleprice1.getText();
		price1=price1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(price1);
		int price11=Integer.parseInt(price1);
		Thread.sleep(2000);
		WebElement eleprice2 = locateElement("XPath", "(//div[@class='_1vC4OE'])[2]");
		String price2 = eleprice2.getText();
		price2=price2.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(price2);
		int price12=Integer.parseInt(price2);
		if(price11<price12)
		{
			System.out.println("lowest price is "+ price11);
		}
		else
		{
			System.out.println(price12);
		}
	}




}
