package com.automationpractice.tests;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.pages.AuthenticationPage;
import com.pages.HomePage;

public class AuthenticationpageTest extends BaseTest {

	@Test
	public void verifyAuthenticationPageTitle() {
		HomePage.clickSignInLink();
	    Assert.assertTrue(AuthenticationPage.verifyAuthenticationPageTitle());
	}
}
