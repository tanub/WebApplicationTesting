package com.LinksValidation_Screenshots;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A2_NewTours_ValidateAllLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
		driver.manage().window().maximize();
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		
		System.out.println(Links.size());
		
		for (int i=0; i<Links.size();i++)
			
		{
			
			String Title = Links.get(i).getText();
			
			System.out.println(i+"."+Title);
			
			String ExpectedURL = Links.get(i).getAttribute("href");
			
			System.out.println("ExpectedURL - "+ExpectedURL);		
			
			Links.get(i).click();
			
			Thread.sleep(5000);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			  FileUtils.copyFile(srcFile, new File("C:\\Users\\guru\\Desktop\\Selenium_scripts\\NewTours_Screenshots\\"+Title+".png"));
			
			String ActualURL = driver.getCurrentUrl();
			
			System.out.println("ActualURL:"+ActualURL);
			
			if(ActualURL.equals(ExpectedURL))
				System.out.println("Reached to the Expected WebPage -- Pass");
			else
				System.out.println("Reached to an unexpected WebPage -- Fail");
			
			
			System.out.println();
			
			driver.navigate().back();
			
			Thread.sleep(5000);
			
			Links = driver.findElements(By.tagName("a"));
					
 		}
		
		}

}
