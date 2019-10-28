package com.automa.tests;

import org.testng.annotations.Test;
import com.data.*;

public class LoginDPTest extends BaseTest {

	
	@Test(dataProvider = "getData", dataProviderClass =AutomationDataProvider.class )
	public void setData(String username, String password){
		int x = 1; 
		System.out.println(x + " : Username is : " + username  + " and Password  : " + password);
		x++;
	}
	
	
}
