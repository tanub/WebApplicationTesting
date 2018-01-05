package com.TestNgAnnotation;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursLogInTest 
{

	FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		 driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
	}
	
	@Test
	public void LogIn()
	{
		driver.findElement(By.name("userName")).sendKeys("orial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
}
