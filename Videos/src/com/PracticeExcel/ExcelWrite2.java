package com.PracticeExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite2 {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\guru\\Desktop\\Excel sheets\\TanujaTestData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet= workbook.getSheet("Sheet3");
		
		Row r= sheet.createRow(3);
		Cell c = r.createCell(3);
		
		c.setCellValue("Namasthe");
		
		FileOutputStream file1= new FileOutputStream("C:\\Users\\guru\\Desktop\\Excel sheets\\TanujaTestData.xlsx");
		workbook.write(file1);

	}

}
