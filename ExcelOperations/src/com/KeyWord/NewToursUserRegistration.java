package com.KeyWord;


import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursUserRegistration {
	
		FirefoxDriver driver;
		@BeforeTest
		public void setUp()
		{
			driver = new FirefoxDriver();
			driver.get("http://newtours.demoaut.com");
		}

		@Test(priority=1)
		public void Register()
		{
			driver.findElement(By.linkText("REGISTER")).click();
			
		}
		@Test(priority=2)
		public void UserRegistration() throws IOException
		{
			FileInputStream file = new FileInputStream("C:\\Users\\guru\\Eclipse_Tanuja_workspace\\ExcelOperations\\src\\com\\Hybrid\\HybridNewToursUserRegistration.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			
			FileInputStream file2 =  new FileInputStream("C:\\Users\\guru\\Eclipse_Tanuja_workspace\\ExcelOperations\\HybridNewToursUserRegistration");
			Properties Pr = new Properties();
			Pr.load(file2);
			
			int RowCount= sheet.getLastRowNum();
			for(int i=1;i<=RowCount;i++)
			{
				
			Row r = sheet.getRow(i);
					
			driver.findElement(By.name(Pr.getProperty("FirstName"))).sendKeys(r.getCell(0).getStringCellValue());
			driver.findElement(By.name(Pr.getProperty("LastName"))).sendKeys(r.getCell(1).getStringCellValue());
			
			double d= r.getCell(2).getNumericCellValue();
			long x = (long)d;
			String PhoneNumber = Long.toString(x);
			
			driver.findElement(By.name(Pr.getProperty("Phone"))).sendKeys(PhoneNumber);
			driver.findElement(By.name(Pr.getProperty("UserName"))).sendKeys(r.getCell(3).getStringCellValue());

			driver.findElement(By.name(Pr.getProperty("Address"))).sendKeys(r.getCell(4).getStringCellValue());
		
			driver.findElement(By.name(Pr.getProperty("City"))).sendKeys(r.getCell(5).getStringCellValue());
			
			driver.findElement(By.name(Pr.getProperty("State"))).sendKeys(r.getCell(6).getStringCellValue());
			
			double t = r.getCell(7).getNumericCellValue();
			long y = (long)t;
			String PostalCode = Long.toString(y);
			driver.findElement(By.name(Pr.getProperty("PostalCode"))).sendKeys(PostalCode);
			driver.findElement(By.name(Pr.getProperty("Country"))).sendKeys(r.getCell(8).getStringCellValue());
			
			driver.findElement(By.name(Pr.getProperty("Email"))).sendKeys(r.getCell(9).getStringCellValue());
			
			driver.findElement(By.name(Pr.getProperty("Password"))).sendKeys(r.getCell(10).getStringCellValue());
			
			driver.findElement(By.name(Pr.getProperty("ConfirmPassword"))).sendKeys(r.getCell(11).getStringCellValue());
			
			driver.findElement(By.name(Pr.getProperty("Register"))).click();
													
			Sleeper.sleepTight(10);
			
			String ExpectedUsername = r.getCell(9).getStringCellValue();
			String Actualname = driver.findElement(By.xpath(Pr.getProperty("UserNameVerify"))).getText();
				
			if(Actualname.contains(ExpectedUsername))
			{
				System.out.println("User registration is successful -- PASS");
				r.createCell(12).setCellValue("User registration is successful -- PASS");
			}
			else
			{
				System.out.println("User registration failed -- FAIL");
				r.createCell(12).setCellValue("User registration failed -- Fail");
			}
			
			FileOutputStream file1 = new FileOutputStream("C:\\Users\\guru\\Eclipse_Tanuja_workspace\\ExcelOperations\\src\\com\\TestReultFiles\\HybridNewToursUserRegistrationResults.xlsx");
			workbook.write(file1);
			driver.navigate().back();
			}
			
		}
		
		@AfterTest
		public void tearDown()
		{driver.close();}
		

	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


