package com.DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursLinksTest 
{
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
	}
	
	@Test
	public void LinksTest() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\guru\\Eclipse_Tanuja_workspace\\ExcelOperations\\src\\com\\ExcelTestDataFiles\\DataDrivenLinksTestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int RowCount = sheet.getLastRowNum();
		for(int i=1;i<=RowCount;i++)
		{
			Row r = sheet.getRow(i);
			String Link1 = r.getCell(0).getStringCellValue();
			String ExpectedURL = r.getCell(1).getStringCellValue();
			driver.findElement(By.linkText(Link1)).click();
			Sleeper.sleepTightInSeconds(10);
			String ActualURL = driver.getCurrentUrl();
			r.createCell(2).setCellValue(ActualURL);
			if(ActualURL.contains(ExpectedURL))
				
			{
				System.out.println("Link navigated to the expected URL -- PASS");
				r.createCell(3).setCellValue("Link navigated to the expected URL -- PASS");
			}
			else
			{
				System.out.println("Page navigated to an unexpected URL -- FAIL");
				r.createCell(3).setCellValue("Page navigated to an unexpected URL -- FAIL");
			}
			
			FileOutputStream file1 = new FileOutputStream("C:\\Users\\guru\\Eclipse_Tanuja_workspace\\ExcelOperations\\src\\com\\TestReultFiles\\LinksTestResults.xlsx");
			workbook.write(file1);
			driver.navigate().back();
		}
	}
	@AfterTest
	public void tearDown()
	{driver.close();}
}
