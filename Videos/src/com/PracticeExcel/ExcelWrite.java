package com.PracticeExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("C:\\Users\\guru\\Desktop\\Excel sheets\\TanujaTestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("Sheet2");
		
		Row r = sheet.createRow(1);
		Cell c = r.createCell(1);
		
		c.setCellValue("Rama");
		
		FileOutputStream file1 = new FileOutputStream("C:\\Users\\guru\\Desktop\\Excel sheets\\TanujaTestData.xlsx");
		workbook.write(file1);

	}

}
