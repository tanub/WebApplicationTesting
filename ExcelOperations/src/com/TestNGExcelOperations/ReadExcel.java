package com.TestNGExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel 
{
	@Test
	public void ReadExcel() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\guru\\Desktop\\Excel sheets\\TanujaTestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		Row r = sheet.getRow(0);
		Cell c = r.getCell(0);
		String testdata=c.getStringCellValue();
		System.out.println(testdata);
		
	}
}
