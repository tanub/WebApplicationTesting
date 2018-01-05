package com.TestNGAnnotations;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 
{
	FirefoxDriver driver = new FirefoxDriver();
	@BeforeTest
	public void FacebookLogin()
	{
		
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void LogIn()
	{
		driver.findElement(By.id("email")).sendKeys("tanuja@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("sdfd");
		
	}
	@AfterTest()
	public void FacebookClose()
	{
		driver.close();
	}
	
}
