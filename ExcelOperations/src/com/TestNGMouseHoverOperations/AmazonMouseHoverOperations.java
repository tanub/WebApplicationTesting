package com.TestNGMouseHoverOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonMouseHoverOperations 
{

	FirefoxDriver driver;
	@BeforeTest 
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com.au/");
			
	}
	
	@Test
	public void YourAccount()
	{
		Actions act = new Actions(driver);
		WebElement AboutUs = driver.findElement(By.id("nav-link-yourAccount"));
		act.moveToElement(AboutUs).perform();		
	}
	@Test
	public void YourOrders() throws InterruptedException
	{
		driver.findElement(By.id("nav_prefetch_yourorders")).click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
