package com.automa.tests;

import org.testng.annotations.Test;

import com.data.ClothesSearch;

public class iContextDataProviderTest {

	@Test(dataProvider = "iTestContextDataProiver", dataProviderClass = ClothesSearch.class, groups = "ABC"  )
	public void groupA(String c) {
		System.out.println("GROUP ABC " + c);
	}
	
		
	
	@Test(dataProvider = "iTestContextDataProiver", dataProviderClass = ClothesSearch.class, groups = "XYZ"  )
	public void groupX(String d) {
		System.out.println("GROUP XYZ " + d);
	}
	
}
