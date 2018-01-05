package com.linkstitles;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewToursLinksTesting {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		
		driver.get("http://newtours.demoaut.com");
		
		
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		for (int i=0;i<Links.size();i++)
		{
			System.out.println(Links.get(i).getText());
			String ExpectedURL = Links.get(i).getAttribute("href");
			System.out.println(ExpectedURL);
			Links.get(i).click();
			//Thread.sleep(5000);
			String ActualURL = driver.getCurrentUrl();
			System.out.println(ActualURL);
			String Title = driver.getTitle();
			System.out.println(Title);
			System.out.println(ActualURL);
			if (ActualURL.equals(ExpectedURL))
				{System.out.println("Reached to the Expected URL --Pass");}
			
			else
				{System.out.println("Reached to an unexpected URL -- FAIL");}
			driver.navigate().back();
			Links = driver.findElements(By.tagName("a"));
		
		

	}

		driver.close();
	}
}
