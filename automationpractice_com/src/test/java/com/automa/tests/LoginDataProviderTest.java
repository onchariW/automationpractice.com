package com.automa.tests;

import org.testng.annotations.Test;
import com.data.*;

public class LoginDataProviderTest extends BaseTest {

	
	@Test(dataProvider = "LoginData", dataProviderClass =LoginDataProvider.class )
	public void login(String username, String password){
		 
		System.out.println("Username is : " + username  + " and Password  : " + password);
	
	}
	
	
	
	
}
