package com.automa.tests;

import com.utils.ExcelUtils;

public class ExcelUtilDemo {

	public static void main(String[] args) {
		
		String excelPath = System.getProperty("user.dir") + "/src/test/java/resources/logins.xlsx";;
		String sheetName = "Sheet3";
		ExcelUtils excelUtils  = new ExcelUtils(excelPath, sheetName);
		
		System.out.println(excelUtils.getRowCount());
		System.out.println(excelUtils.getCellDataString(2, 1));
		System.out.println(excelUtils.getCellDataNumeric(2, 3));	
		
		excelUtils.loginDataProvider();
	}
}
