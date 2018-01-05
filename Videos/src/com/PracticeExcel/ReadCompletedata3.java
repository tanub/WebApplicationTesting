package com.PracticeExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadCompletedata3 {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\guru\\Desktop\\Excel sheets\\TanujaTestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int RowCount = sheet.getLastRowNum();
		
		for (int i=0;i<=RowCount;i++)
		{
			Row r = sheet.getRow(i);
			int CellCount = r.getLastCellNum();
			
			for (int j=0;j<=CellCount;j++)
			{
				Cell c = r.getCell(j);
			//	String testdata = c.getStringCellValue();
				//System.out.print(testdata);
				
			//	String testdata = c.getStringCellValue();
				//System.out.println(testdata);
				String testdata = c.getStringCellValue();
				System.out.println(testdata);
			}
			
		}

	}

}
