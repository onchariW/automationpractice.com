package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.Constants;

public abstract class BasePage {
 protected static WebDriver driver; 	
 protected static WebDriverWait wait;
 public static int timeOutInSeconds = Constants.TIME_OUT_IN_SECONNDS;
 
public BasePage(WebDriver webDriver) {
	BasePage.driver = 	webDriver;	
	wait = new WebDriverWait(driver, timeOutInSeconds); 
}
 

}
