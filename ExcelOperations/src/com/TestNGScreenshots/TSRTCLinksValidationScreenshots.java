package com.TestNGScreenshots;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TSRTCLinksValidationScreenshots 
{
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
	}
	@Test
	public void HeaderblockLinks() throws IOException
	{
		WebElement HeaderBlock = driver.findElement(By.className("menu-wrap"));
		List<WebElement> HeaderBlockLinks = HeaderBlock.findElements(By.tagName("a"));
		System.out.println(HeaderBlockLinks.size());
		for(int i=0;i<HeaderBlockLinks.size();i++)
		{
			String LinkName = HeaderBlockLinks.get(i).getText();
			System.out.println(LinkName);
			String ExpectedURL = HeaderBlockLinks.get(i).getAttribute("href");
			System.out.println(ExpectedURL);
			HeaderBlockLinks.get(i).click();
			String ActualURL = driver.getCurrentUrl();
			System.out.println(ActualURL);
			Sleeper.sleepTightInSeconds(30);
			
			File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcfile, new File("C:\\Users\\guru\\Desktop\\Selenium_scripts\\TSRTS_Dec\\"+LinkName+i+".png"));
			if(ActualURL.equals(ExpectedURL))
			System.out.println("URLs matched -- PASS");
			else
			System.out.println("URLs not matched -- FAIL");
			driver.navigate().back();
			Sleeper.sleepTightInSeconds(10);
			HeaderBlock = driver.findElement(By.className("menu-wrap"));
			HeaderBlockLinks = HeaderBlock.findElements(By.tagName("a"));
		}
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	
	
}
