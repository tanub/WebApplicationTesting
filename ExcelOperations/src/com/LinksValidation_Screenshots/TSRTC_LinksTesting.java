package com.LinksValidation_Screenshots;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TSRTC_LinksTesting {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		
		WebElement Headerblock= driver.findElement(By.className("menu-wrap"));
		
		List<WebElement> HeaderBlockLinks = Headerblock.findElements(By.tagName("a"));
		
		for (int i=0; i<HeaderBlockLinks.size(); i++)
		{
			String HeaderBlockLinkName = HeaderBlockLinks.get(i).getText();
			
			System.out.println(HeaderBlockLinkName);
			
			HeaderBlockLinks.get(i).click();
			
			System.out.println(driver.getTitle());
			
			System.out.println(driver.getCurrentUrl());
			
			System.out.println();
			
			driver.navigate().back();
			
			Thread.sleep(5000);
			
			 Headerblock= driver.findElement(By.className("menu-wrap"));
			
			 HeaderBlockLinks = Headerblock.findElements(By.tagName("a"));
			
			
			
			
			
			
		}
		
		
		
		
		
		

	}

}
