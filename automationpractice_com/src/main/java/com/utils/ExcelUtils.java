
//http://automationtesting.in/row-count-and-column-count-in-excel/

package com.utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelUtils {

	static XSSFWorkbook xsssWorkbook = null;
	static XSSFSheet xssFsheet = null;
	static int rowCount = 0;
	Object[][] login = null;

	public ExcelUtils(String excelPath, String sheetName) {
		try {
			xsssWorkbook = new XSSFWorkbook(excelPath);
			xssFsheet = xsssWorkbook.getSheet(sheetName);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// get row count
	public int getRowCount() {
		return xssFsheet.getPhysicalNumberOfRows();
	}

	// get String cell data
	public String getCellDataString(int rownum, int cellnum) {
		return xssFsheet.getRow(rownum).getCell(cellnum).getStringCellValue();

	}

	// get numeric cell data
	public double getCellDataNumeric(int rownum, int cellnum) {
		return xssFsheet.getRow(rownum).getCell(cellnum).getNumericCellValue();

	}

	// login data provider
	@DataProvider(name = "automationLoginDataProvider")
	public Object[][] loginDataProvider() {
		rowCount = getRowCount();
		login = new Object[rowCount][2];

		for (int rw = 1; rw < rowCount-1; rw++) {
			Row row = xssFsheet.getRow(rw);
			for (int cm = 0; cm < row.getLastCellNum(); cm++) {
				login[rw][cm] = row.getCell(cm).getStringCellValue();
			}
		}
		return login;
	}
}
