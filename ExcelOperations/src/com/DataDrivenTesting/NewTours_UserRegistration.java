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

public class NewTours_UserRegistration
{
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
		FileInputStream file = new FileInputStream("C:\\Users\\guru\\Eclipse_Tanuja_workspace\\ExcelOperations\\src\\com\\ExcelTestDataFiles\\Demo.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int RowCount= sheet.getLastRowNum();
		for(int i=1;i<=RowCount;i++)
		{
			
		Row r = sheet.getRow(i);
				
		driver.findElement(By.name("firstName")).sendKeys(r.getCell(0).getStringCellValue());
		driver.findElement(By.name("lastName")).sendKeys(r.getCell(1).getStringCellValue());
		
		double d= r.getCell(2).getNumericCellValue();
		long x = (long)d;
		String PhoneNumber = Long.toString(x);
		
		driver.findElement(By.name("phone")).sendKeys(PhoneNumber);
		driver.findElement(By.name("userName")).sendKeys(r.getCell(3).getStringCellValue());

		driver.findElement(By.name("address1")).sendKeys(r.getCell(4).getStringCellValue());
	
		driver.findElement(By.name("city")).sendKeys(r.getCell(5).getStringCellValue());
		
		driver.findElement(By.name("state")).sendKeys(r.getCell(6).getStringCellValue());
		
		double t = r.getCell(7).getNumericCellValue();
		long y = (long)t;
		String PostalCode = Long.toString(y);
		driver.findElement(By.name("postalCode")).sendKeys(PostalCode);
		driver.findElement(By.name("country")).sendKeys(r.getCell(8).getStringCellValue());
		
		driver.findElement(By.name("email")).sendKeys(r.getCell(9).getStringCellValue());
		
		driver.findElement(By.name("password")).sendKeys(r.getCell(10).getStringCellValue());
		
		driver.findElement(By.name("confirmPassword")).sendKeys(r.getCell(11).getStringCellValue());
		
		driver.findElement(By.name("register")).click();
												
		Sleeper.sleepTight(10);
		
		String ExpectedUsername = r.getCell(9).getStringCellValue();
		String Actualname = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")).getText();
			
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
		
		FileOutputStream file1 = new FileOutputStream("C:\\Users\\guru\\Eclipse_Tanuja_workspace\\ExcelOperations\\src\\com\\TestReultFiles\\DemoResults.xlsx");
		workbook.write(file1);
		driver.navigate().back();
		}
		
	}
	
	@AfterTest
	public void tearDown()
	{driver.close();}
	

}

