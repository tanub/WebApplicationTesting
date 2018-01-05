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


public class A1_TSRTC_LinksValidation_Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://www.tsrtconline.in/oprs-web/");
		
		driver.manage().window().maximize();
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		
		System.out.println("Total no of links:"+Links.size());
		
		WebElement PopularRoutes = 	driver.findElement(By.className("home-bot-wrap"));
		
		List<WebElement> PopularRoutesLinks = PopularRoutes.findElements(By.tagName("a"));
			
			for (int i=0; i<PopularRoutesLinks.size();i++)
			{
				String Title = PopularRoutesLinks.get(i).getText();
				
			System.out.println(i+"."+Title);		
		
			String ExpectedURL = PopularRoutesLinks.get(i).getAttribute("href");
				
				System.out.println("ExpectedURL - "+ExpectedURL);		
				
				PopularRoutesLinks.get(i).click();
				
				Thread.sleep(5000);
				
				File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
				  FileUtils.copyFile(srcFile, new File("C:\\Users\\guru\\Desktop\\Selenium_scripts\\TSRTC_Links_Screenshots\\PopularLinks\\"+Title+".png"));
				
				String ActualURL = driver.getCurrentUrl();
				
				System.out.println("ActualURL:"+ActualURL);
				
				if(ActualURL.equals(ExpectedURL))
					System.out.println("Reached to the Expected WebPage -- Pass");
				else
					System.out.println("Reached to an unexpected WebPage -- Fail");
							
				System.out.println();
				
				driver.findElement(By.id("booking")).click();
				
				Thread.sleep(5000);
		
								
	 		}
			
		for(int j=2; j<Links.size(); j++)
			
		{
			
			String LinkName = Links.get(j).getText();
			System.out.println(j-2+"."+LinkName);
			
			String ExpectedLink= Links.get(j).getAttribute("href");
			
			System.out.println("ExpectedLink -"+ExpectedLink);
			
			Links.get(j).click();
			
			Thread.sleep(5000);
			
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			  FileUtils.copyFile(srcFile, new File("C:\\Users\\guru\\Desktop\\Selenium_scripts\\TSRTC_Links_Screenshots\\PopularLinks\\"+LinkName+".png"));
			
			String ActualLink = driver.getCurrentUrl();
			
			System.out.println("ActualLink - "+ActualLink);
			
			if(ActualLink.equals(ExpectedLink))
			System.out.println("Reached to the Expected Webpage -- Pass");
			else
				System.out.println("Reached to an unexpected Webpage -- Fail");
			
			System.out.println();
			Thread.sleep(5000);
			
			Links = driver.findElements(By.tagName("a"));
					
			
		}
		
		
				
		}
}
