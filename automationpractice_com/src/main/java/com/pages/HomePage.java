package com.pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

	
	
	
	public HomePage(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}

	public static Boolean verifyHomePageTitle() {
		
		String expectedTitle = "My Store";
		if(driver.getTitle().equalsIgnoreCase(expectedTitle)) {
			return true;
		}
		return false;
	}
}
