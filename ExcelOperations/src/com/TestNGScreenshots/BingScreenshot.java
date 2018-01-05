package com.TestNGScreenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BingScreenshot
{
	FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("https://www.bing.com/");
	}
	
	@Test
	public void Screenshot() throws IOException
	{
		Sleeper.sleepTightInSeconds(30);
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("C:\\users\\guru\\Desktop\\Selenium_scripts\\Bing4.png"));
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
