package com.MouseHoverOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_Samsung {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://livetech.in");
		
		Actions act = new Actions(driver);
		
		WebElement AboutUs = driver.findElement(By.linkText("About Us"));
		
		act.moveToElement(AboutUs).perform();
		
		driver.findElement(By.linkText("Company")).click();
		
		driver.close();

	}

}
