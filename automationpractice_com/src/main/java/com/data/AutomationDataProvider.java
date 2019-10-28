package com.data;

import org.testng.annotations.DataProvider;


public class AutomationDataProvider {


	
	@DataProvider
	public static Object[][] getData(){
		
		Object[][] data = new Object[3][2];
		
		//1st row Correct Credentials
		data[0][0] = "test21@automationpractice.com";
		data[0][1] = "28328719@Aut?!";
		
		//2nd row Wrong username
		data[1][0] = "wrong@username.com";
		data[1][1] = "28328719@Aut?!";
		
		//3rd row Wrong password
		data[2][0] = "test1@automationpractice.com";
		data[2][1] = "wrongPassword";
		
		
		
		return data;
		
	}
}
