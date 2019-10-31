package com.automa.tests;

import org.testng.annotations.Test;

import com.data.ClothesSearch;

public class ClothSearchTest {

	//@Test(dataProvider = "clothesSearchDataProvider", dataProviderClass = ClothesSearch.class)
	public void searchCloth(String cloth) {
		System.out.println("ALL My search : " + cloth);
	}
	
	
	
	@Test(dataProvider ="clothesSearchDataProvider", dataProviderClass = ClothesSearch.class)
	public void searchAllWomenClothes(String women) {
		System.out.println("Searching only WOMEN : " + women);
	}
	
	@Test(dataProvider ="clothesSearchDataProvider", dataProviderClass = ClothesSearch.class)
	public void searchOnlyDresses(String dress) {
		System.out.println("Searching only DRESSES : " + dress);
	}
	

	
}
