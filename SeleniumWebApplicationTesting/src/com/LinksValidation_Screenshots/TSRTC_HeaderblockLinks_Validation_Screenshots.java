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

public class TSRTC_HeaderblockLinks_Validation_Screenshots {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		FirefoxDriver driver =  new FirefoxDriver();
		
		driver.get("http://www.tsrtconline.in/oprs-web/");
		//menu-wrap
		
		WebElement HeaderBlock = driver.findElement(By.className("menu-wrap"));
		List<WebElement> Links = HeaderBlock.findElements(By.tagName("a"));
		System.out.println(Links.size());
		
		for (int i=0;i<Links.size();i++)
		{
			String LinkName = Links.get(i).getText();
			System.out.println(LinkName);
			
			String ExpectedLink = Links.get(i).getAttribute("href");
			
			System.out.println("ExpectedLink:"+ExpectedLink);
			
			Links.get(i).click();
			
			Thread.sleep(5000);
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(srcFile, new File("C:\\Users\\guru\\Desktop\\Selenium_scripts\\TSRTC_Links_Screenshots\\HeaderLinks\\"+LinkName+".png"));
			
			String ActualLink = driver.getCurrentUrl();
			
			System.out.println(ActualLink);
			
			if (ActualLink.equals(ExpectedLink))
				System.out.println("Reached to the Expected webpage -- Pass");
			else
				System.out.println("Reached to an unexpected webpage -- Fail");
			
			System.out.println();
			
			
			HeaderBlock = driver.findElement(By.className("menu-wrap"));
			 Links = HeaderBlock.findElements(By.tagName("a"));
			
			
			
			
		}
			
			
			
		
	}

}
