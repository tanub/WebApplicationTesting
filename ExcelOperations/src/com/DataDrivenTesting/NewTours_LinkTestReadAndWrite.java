package com.DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_LinkTestReadAndWrite
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
		FileInputStream file = new FileInputStream("C:\\Users\\guru\\Eclipse_Tanuja_workspace\\ExcelOperations\\src\\com\\ExcelTestDataFiles\\NewTours_LinksTest.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		List<WebElement> Link = driver.findElements(By.tagName("a"));
		for(int i=0;i<Link.size();i++)
		{
			Link = driver.findElements(By.tagName("a"));
			Row r = sheet.getRow(i);
			String LinkName = Link.get(i).getText();
			System.out.println(LinkName);
			r.createCell(0).setCellValue(LinkName);
			String ExpectedURL = Link.get(i).getAttribute("href");
			System.out.println(ExpectedURL);
			r.createCell(1).setCellValue(ExpectedURL);
			Link.get(i).click();
			Sleeper.sleepTightInSeconds(10);
			String ActualURL = driver.getCurrentUrl();
			r.createCell(2).setCellValue(ActualURL);
			System.out.println(ActualURL);
			if(ActualURL.contains(ExpectedURL))
			{
				System.out.println("Page navigated to the Expected URL -- PASS");
				r.createCell(3).setCellValue("Page navigated to the Expected URL -- PASS");
			}
			else
			{
				System.out.println("Page navigated to an unexpected URL -- FAIL");
				r.createCell(3).setCellValue("Page navigated to an unexpected URL -- FAIL");
			}
			FileOutputStream file1 = new FileOutputStream("C:\\Users\\guru\\Eclipse_Tanuja_workspace\\ExcelOperations\\src\\com\\TestReultFiles\\NewTours_LinksTest_RaW.xlsx");
			
			workbook.write(file1);
			driver.navigate().back();
			
		}
		
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
