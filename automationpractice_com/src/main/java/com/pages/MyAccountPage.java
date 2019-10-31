package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.utils.Utils;

public class MyAccountPage extends BasePage {
	static By logoutLink = By.className("logout");
	///span[contains(text(), \"Onchari Wycliffe\")]

	static By customName = By.xpath("//a[@class = \"account\"]");
	
	public MyAccountPage(WebDriver webDriver) {
		super(webDriver);
	}
	
	public static WebElement getCustomerName() {
		return Utils.waitForPresenceOfAutoElement(customName);
	}
	
	public static WebElement getLogoutLink() {
		return Utils.waitForLinkToBeClickable(logoutLink);
	}
	
	//
	public static WebElement verifyCustomerName(String customer) {
		customer = "Wycliffe Onchari";
		By locator = By.xpath("//a[@class = \"account\"]/span[contains(text(), \" " + customer  +"\")]");
		return Utils.waitForPresenceOfAutoElement(locator);
	}
	
	
	public static void signOut() {
		getLogoutLink().click();
	}

}
