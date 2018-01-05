package com.ExcelOperations;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingData {

	public static void main(String[] args) throws IOException
	{
		
		FileInputStream file = new FileInputStream("C:\\Users\\guru\\Desktop\\TanujaTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		Row r =sheet.createRow(5);
		Cell c=r.createCell(3);
		
		c.setCellValue("Hello Tanuja");
		
		FileOutputStream file1 = new FileOutputStream("C:\\\\Users\\\\guru\\\\Desktop\\\\TanujaTestData.xlsx");
		workBook.write(file1);

	}

}
