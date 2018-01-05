package com.ExcelOperationsReadAndWrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelRetest {

	public static void main(String[] args) throws IOException 
	
	{
FileInputStream file = new FileInputStream("C:\\Users\\guru\\Desktop\\ExcelTestData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		Row r = sheet.getRow(0);
		Cell c = r.getCell(0);
		
		String testdata = c.getStringCellValue();
		System.out.println(testdata);

	}

}
