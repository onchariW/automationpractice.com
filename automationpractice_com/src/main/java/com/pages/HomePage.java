package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.*;

public class HomePage extends BasePage {
	
	
	
	static By signInLink = By.xpath( "//a[@class=\"login\"]");
	
	public HomePage(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}

	
	//GETTERS
		
		private static WebElement getSignInLink() {
			return Utils.waitForLinkToBeClickable(signInLink);	
		}
		
		public static AuthenticationPage clickSignInLink() {
			getSignInLink().click();
			return new AuthenticationPage(driver);
		}
		
		
		
	public static Boolean verifyHomePageTitle() {
	
		String expectedTitle = "My Store";
		if(driver.getTitle().equalsIgnoreCase(expectedTitle)) {
			return true;
		}
		return false;
	}
}
