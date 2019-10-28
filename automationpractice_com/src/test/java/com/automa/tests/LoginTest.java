package com.automa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.data.AutomationDataProvider;
import com.pages.AuthenticationPage;
import com.pages.HomePage;
import com.pages.MyAccountPage;

public class LoginTest extends BaseTest {
	
	//@Test(priority = 1)
	public void verifyAuthenticationPageTitle() {
		HomePage.clickSignInLink();
	    
		Assert.assertTrue(AuthenticationPage.verifyAuthenticationPageTitle());
	}

	
	//@Test(priority = 2)
	public void verifyValidLoginEmailAddress() {
		HomePage.clickSignInLink();
		authentication.setLoginCredentials("test1@automationpractice.com", "");
		Assert.assertTrue(AuthenticationPage.verifyLoginEmailFieldIsGreen());
	}
	
	//@Test (priority = 3)
	public void loginWithValidCredentials() {
		HomePage.clickSignInLink();
		authentication.login("test1@automationpractice.com", "28328719@Aut?!");
		
		Assert.assertTrue(MyAccountPage.getLogoutLink().isDisplayed());
		Assert.assertTrue(MyAccountPage.getCustomerName().isDisplayed(), "is not displayed ");
	}
	
	
	@Test(priority = 4, dataProvider = "getData", dataProviderClass =AutomationDataProvider.class )
	public void login(String username, String password){
		HomePage.clickSignInLink();
		authentication.login(username, password);		
	}
	
	
}

/*
 * provide multiple data to the test
 * 
 */

