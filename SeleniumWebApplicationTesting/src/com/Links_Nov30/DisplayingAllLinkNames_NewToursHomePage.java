package com.Links_Nov30;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DisplayingAllLinkNames_NewToursHomePage {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
		List<WebElement>Links = driver.findElements(By.tagName("a"));
		
		System.out.println(Links.size());
		
		for (int i=0; i < Links.size(); i++)
		{
			System.out.println(Links.get(i).getText());}

	}

}
