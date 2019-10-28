package com.utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static String projectpathString = System.getProperty("user.dir");
	static String workbookLocation = projectpathString + "/src/test/java/resources/logins.xlsx";
	
	public static void main(String[] args) {
		getRowCount();
	}
	
	
	
	public static void getRowCount() {
	try {
		
		XSSFWorkbook workbook = new XSSFWorkbook(workbookLocation);
		XSSFSheet  sheet = workbook.getSheet("Sheet1");
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Number of rows : "  + rowCount);
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
		e.getCause();
		e.printStackTrace();
	}
		
	}
}
