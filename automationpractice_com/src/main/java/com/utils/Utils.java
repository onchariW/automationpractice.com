package com.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.BasePage;

public class Utils extends BasePage {
	
	public Utils(WebDriver webDriver) {
		super(webDriver);
	}
	
	
	
	public static WebElement waitForLinkToBeClickable(By locator) {		
		return wait.until(ExpectedConditions.elementToBeClickable(locator));	
	}


	public static WebElement waitForPresenceOfAutoElement(By locator) {
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));	
	}

	public static WebElement waitForVisibilityOfAutoElement(By locator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	
}
