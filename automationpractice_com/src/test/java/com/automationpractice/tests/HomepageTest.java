package com.automationpractice.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.HomePage;

public class HomepageTest extends BaseTest {	

	@Test
	public void verifyHomepageTitle() {
		
		Assert.assertTrue(HomePage.verifyHomePageTitle());
	}
	



}
