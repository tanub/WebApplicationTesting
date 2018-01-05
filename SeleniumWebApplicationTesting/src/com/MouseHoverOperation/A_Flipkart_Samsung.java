package com.MouseHoverOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;

public class A_Flipkart_Samsung {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver =  new FirefoxDriver();
		
		driver.get("http://livetech.in");
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.linkText("Placements"))).perform();
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Corporates")).click();
		
		driver.close();
		
		

	}

}
