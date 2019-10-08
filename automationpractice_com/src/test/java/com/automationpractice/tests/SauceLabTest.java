package com.automationpractice.tests;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SauceLabTest extends BaseTest {
  
	
	@Test
	public void openTest() {
		System.out.print("Opening First |Test");
		
	}

		 // @Test
		 // @DisplayName("shouldOpenSafari()")
		  public void shouldOpenSafari() throws MalformedURLException {
		   
		    String sauceUserName = "onchari.abuga.wycliffe";
		    String sauceAccessKey = "cba0bfa9-e2bf-44ec-ba3d-bb8086ffcb14";

		    DesiredCapabilities capabilities = new DesiredCapabilities();
		    capabilities.setCapability("username", sauceUserName);
		    capabilities.setCapability("accessKey", sauceAccessKey);
		    capabilities.setCapability("browserName", "Safari");
		    capabilities.setCapability("platform", "macOS 10.13");
		    capabilities.setCapability("version", "11.1");
		    capabilities.setCapability("name", "Onchari Test 00656");

		    driver = new RemoteWebDriver(new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub"), capabilities);

		    //navigate to the url of the Sauce Labs Sample app
		    driver.navigate().to("http://automationpractice.com/");

		    //Create an instance of a Selenium explicit wait so that we can dynamically wait for an element
		    WebDriverWait wait = new WebDriverWait(driver, 5);

		    
		    driver.quit();

		  }
	}