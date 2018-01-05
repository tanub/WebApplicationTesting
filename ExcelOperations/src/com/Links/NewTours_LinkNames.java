package com.Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_LinkNames 
{
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
	}
	@Test
	public void DisplayingLinkNames()
	{
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println(Links.size());
		for (int i=0; i<Links.size();i++)
		
			System.out.println(i+"."+Links.get(i).getText());
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
		
	}
	
}
