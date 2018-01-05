//To display text of each link, click, display title, URL of NewToursHomePage

package com.LinksValidation_Screenshots;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksValidation_NewToursHomePage {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		
		System.out.println(Links.size());
		
		for (int i=0; i < Links.size(); i++)
			
		{
			
			
			System.out.println(Links.get(i).getText());
			
			Links.get(i).click();
			 
			 		 
			 System.out.println(driver.getTitle());
			 
			 System.out.println(driver.getCurrentUrl());
			 
			 System.out.println();
			 
			 driver.navigate().back();
			 
			 Links = driver.findElements(By.tagName("a"));
			 		 
			
		}	
		
		

	}

}
