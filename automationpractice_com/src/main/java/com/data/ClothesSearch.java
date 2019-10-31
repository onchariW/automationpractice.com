package com.data;

import java.lang.reflect.Method;
import java.util.Iterator;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

public class ClothesSearch {

	@DataProvider(name ="clothesSearchDataProvider" )
	public static Object[][] clothesSearch(Method m) {
		Object[][] data = null;
		
		//data[0][0] = "Casual Dresses";
		//data[1][0] = "Evening Dresses";
		//data[2][0] = " Summer Dresses";
		//data[3][0] = "T-shirts";
		//data[4][0] = "Blouses";
		
		
		
		if(m.getName().equalsIgnoreCase("searchAllWomenClothes")) {
			
			data =  new Object[][] {
				{"Casual Dresses"},
				{"Evening Dresses"},
				{"Summer Dresses"},
				{"T-shirts"},
				{"Brouses"}
			};
		}
		
		if(m.getName().equalsIgnoreCase("searchOnlyDresses")) {
			data =  new Object[][] {
				{"Casual Dresses"},
				{"Evening Dresses"},
				{"Summer Dresses"}
				
			};
		}
			
		return data;
	
	}
	
	@DataProvider(name = "iTestContextDataProiver")
	public static Object iTestContextDataProiver(ITestContext iTestContext) {
		Object[][] data = null;
		
	for (String group : iTestContext.getIncludedGroups()) {
		if(group.equalsIgnoreCase("ABC")) {
			data = new Object[][] {
				{"Method A"},
				{"Method B"},
				{"Method C"}
			};
			break;
		}
		else if(group.equalsIgnoreCase("XYZ")) {
			data = new Object[][] {
				{"Method X"},
				{"Method Y"},
				{"Method Z"}
			};
			break;
		}
	}
		
		return data;
	}
}
