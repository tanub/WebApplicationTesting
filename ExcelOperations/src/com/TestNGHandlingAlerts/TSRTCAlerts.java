package com.TestNGHandlingAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TSRTCAlerts {
	
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web");
	}
	@Test(priority=1)
	public void CheckAvailability() 
	{
		driver.findElement(By.id("searchBtn")).click();
		//Thread.sleep(5000);
		// driver.switchTo().alert().accept();
		
	}
	@Test(priority=2)
	public void Alert() throws InterruptedException
	{
		
		//driver.switchTo().alert().accept();
		Alert al = driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println(al.getText());
		al.accept();
	
	}

	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
