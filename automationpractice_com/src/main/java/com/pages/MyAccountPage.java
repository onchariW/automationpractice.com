package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.Utils;

public class MyAccountPage extends BasePage {

	static By logoutLink = By.className("logout");
	
	
	public MyAccountPage(WebDriver webDriver) {
		super(webDriver);
	}
	
	public static WebElement getLogoutLink() {
		return Utils.waitForLinkToBeClickable(logoutLink);
	}
	
	//

}
