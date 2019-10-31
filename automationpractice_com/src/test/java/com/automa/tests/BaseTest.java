package com.automa.tests;

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
import org.testng.annotations.Parameters;

import com.pages.*;
import com.utils.ExcelUtils;

import io.github.bonigarcia.wdm.WebDriverManager;
//https://www.journaldev.com/21237/testng-factory-annotation

public class BaseTest {

	public static WebDriver driver;
	public static final boolean REMOTE_DRIVER = false;
	public static final String BROWSER = "Chrome";
	private static final String AUT_URL = "http://automationpractice.com/";
	private static final String SAUCELAB_USERNAME = "onchari.abuga.wycliffe";
	private static final String SAUCELAB_ACCESSKEY = "cba0bfa9-e2bf-44ec-ba3d-bb8086ffcb14";
	
    public HomePage homePage; 
    public static AuthenticationPage authentication;
    public static RegistrationPage registration;
    
	String excelPath = System.getProperty("user.dir") + "/src/test/java/resources/logins.xlsx";;
	String sheetName = "Sheet3";
	ExcelUtils excelUtils  = null;
	
	
	@BeforeTest(alwaysRun = true)
	//@Parameters({"", "", "", ""})
	public void setupWebDriver() throws MalformedURLException {		
		
		if(REMOTE_DRIVER) {
			setupRemoteDriver();
		}
		else {
			setupLocalDriver();
		}
		
		homePage = new HomePage(driver);
		authentication = new AuthenticationPage(driver);
		registration = new RegistrationPage(driver);
		excelUtils = new ExcelUtils(excelPath, sheetName);
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	

	private void setupLocalDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
	}


	private void setupRemoteDriver() throws MalformedURLException {
		 
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		 if(BROWSER.equalsIgnoreCase("chrome")) {
			   // capabilities = DesiredCapabilities.chrome();
			  
			 
			    capabilities.setCapability("username", SAUCELAB_USERNAME);
			    capabilities.setCapability("accessKey", SAUCELAB_ACCESSKEY);
			    capabilities.setCapability("browserName", "Safari");
			    capabilities.setCapability("platform", "macOS 10.13");
			    capabilities.setCapability("version", "11.1");
			    capabilities.setCapability("build", "Automation");
			    capabilities.setCapability("name", "Test methods in Saucelabs");

		}
		
		else {
			throw new RuntimeException("Browser type is unsupported.");
		}
		
		
		   driver = new RemoteWebDriver(new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub"), capabilities);
		
	}

	
	@BeforeMethod(alwaysRun = true)
	public void loadWebApplication() {
		 driver.navigate().to(AUT_URL);
		 driver.manage().window().maximize();
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
