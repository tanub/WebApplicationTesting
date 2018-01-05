package com.KeyWord;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursLogInTest1
{
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
	}
	
	@Test
	public void NewToursSignIn() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\guru\\Eclipse_Tanuja_workspace\\ExcelOperations\\NewToursSignInProperties");
		
		Properties Pr = new Properties();
		Pr.load(file);
		
		driver.findElement(By.name(Pr.getProperty("Username"))).sendKeys("tutorial");
		driver.findElement(By.name(Pr.getProperty("Password"))).sendKeys("tutorial");
		driver.findElement(By.name(Pr.getProperty("SignIn"))).click();
		
				
	}
}
