package com.Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BingHeaderLinkNames 
{
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("http://www.bing.com");
	}
	@Test
	public void HeaderLinkNames()
	{
		WebElement Header = driver.findElement(By.id("sc_hdu"));
		List<WebElement> HeaderLinks = Header.findElements(By.tagName("a"));
		System.out.println(HeaderLinks.size());
		for(int i=0;i<HeaderLinks.size();i++)
		
			System.out.println(i+"."+HeaderLinks.get(i).getText());
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	
	}
}
