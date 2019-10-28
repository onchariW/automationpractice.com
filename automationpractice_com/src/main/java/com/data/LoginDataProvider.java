package com.data;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*
 * Should return the data of type object
 */
public class LoginDataProvider {

	@DataProvider(name = "LoginData")
	public Object[][] LoginData() {
		
		Object[][] result = new Object[5][2];
		result[0][0] = "Admin1";
		result[0][1] = "pass1";
		
		result[1][0] = "Admin2";
		result[1][1] = "pass2";
		
		result[3][0] = "Admin3";
		result[3][1] = "pass3";
		
		result[4][0] = "Admin4";
		result[4][1] = "pass4";
		
		return result;
	}
	
	
	@Test(dataProvider = "LoginData")
	public void useDataProvider(String user, String pass) {
		System.out.println("\tUsername :" + user + "\n\t Password :" + pass);
	}
}
