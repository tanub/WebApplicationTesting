package com.TestNGValidatingTitle;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ValidatingFacebookTitle
{
	FirefoxDriver driver;
	String ActualTitle;String ExpectedTitle;
	
	@BeforeTest
	public void setUp()
	{
		driver= new FirefoxDriver();
		driver.get("https://facebook.com");
	}
	
	@Test
	public void ExpectedAndActualTitles()
	{
		 ExpectedTitle = "Facebook";
		 ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		
	}
	@Test
	public void validatingTitle()
	{
		if(ActualTitle.contains(ExpectedTitle))
			System.out.println("Titles matched -- PASS");
	
		else
			System.out.println("Titles not matced -- FAIL");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	}
	
	
	

