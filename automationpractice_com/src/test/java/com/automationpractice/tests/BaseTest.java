package com.automationpractice.tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.pages.*;


import io.github.bonigarcia.wdm.WebDriverManager;
//https://www.journaldev.com/21237/testng-factory-annotation

public class BaseTest {

	public static WebDriver driver;
	public static final boolean REMOTE_DRIVER = false;
	public static final String BROWSER = "Chrome";
	private static final String URL = "automationpractice.com/";
    public HomePage homePage; 
    public static AuthenticationPage authentication;
	
	@BeforeTest(alwaysRun = true)
	public void setupWebDriver() throws MalformedURLException {		
		
		if(REMOTE_DRIVER) {
			setupRemoteDriver();
		}
		else {
			setupLocalDriver();
		}
		homePage = new HomePage(driver);
		authentication = new AuthenticationPage(driver);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	private void setupLocalDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
	}


	private void setupRemoteDriver() throws MalformedURLException {
		 DesiredCapabilities capabilities = new DesiredCapabilities();
		if(BROWSER.equalsIgnoreCase("chrome")) {
			   // capabilities = DesiredCapabilities.chrome();
			    String sauceUserName = "onchari.abuga.wycliffe";
			    String sauceAccessKey = "cba0bfa9-e2bf-44ec-ba3d-bb8086ffcb14";
			    capabilities.setCapability("username", sauceUserName);
			    capabilities.setCapability("accessKey", sauceAccessKey);
			    capabilities.setCapability("browserName", "Safari");
			    capabilities.setCapability("platform", "macOS 10.13");
			    capabilities.setCapability("version", "11.1");
			    capabilities.setCapability("name", "Onchari Test Omollo");

		}
		
		else {
			throw new RuntimeException("Browser type is unsupported.");
		}
		
		
		   driver = new RemoteWebDriver(new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub"), capabilities);
		
	}

	
	@BeforeMethod(alwaysRun = true)
	public void loadWebApplication() {
		 driver.navigate().to("http://automationpractice.com/");
	}
	
	
	@AfterMethod(alwaysRun = true)
	public void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}

	@AfterTest(alwaysRun = true)
	public void tearDownSuite() {
		driver.quit();
	}
}
