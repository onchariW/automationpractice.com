package com.automationpractice.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthenticationpageTest extends BaseTest {

	@Test
	public void verifyAuthenticationpageTitle() {
		Assert.assertTrue(authentication.verifyPageTitle());
	}
}
