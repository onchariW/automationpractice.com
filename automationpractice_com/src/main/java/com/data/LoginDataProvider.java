package com.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

/*
 * Should return the data of type object
 */
public class LoginDataProvider {

	@DataProvider(name = "LoginData")
	public Object[][] LoginData() throws FileNotFoundException {
		//static String projectpathString = System.getProperty("user.dir");
		//static String workbookLocation = projectpathString + "/src/test/java/resources/logins.xlsx";
		
		 String filepath = System.getProperty("user.dir") + "/src/test/java/resources/";
		 String fileName = "logins.xlsx";
		// String sheetName = "Sheet4";
		 Object[][] result = null;
			
		try {
			File file = new File(filepath + "/" + fileName);
			FileInputStream inputStream = new FileInputStream(file);
			Workbook workbook = new XSSFWorkbook(inputStream);
			Sheet sheet = workbook.getSheetAt(2);
			int rowCount = (sheet.getLastRowNum() - sheet.getFirstRowNum()) ;
			result = new Object[rowCount][2];
			
			for (int rw = 1; rw < rowCount; rw++) {
				Row row = sheet.getRow(rw);
				for (int cm = 0; cm < row.getLastCellNum(); cm++) {
					result[rw][cm] = row.getCell(cm).getStringCellValue();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
