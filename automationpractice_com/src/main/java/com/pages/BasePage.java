package com.pages;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
 protected static WebDriver driver; 	

public BasePage(WebDriver webDriver) {
	BasePage.driver = 	webDriver;	
}
 

}
