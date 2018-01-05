package com.HandlingAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class A_TSRTCAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://www.tsrtconline.in/oprs-web");
		
		driver.findElement(By.id("searchBtn")).click();
		
		Alert alt = driver.switchTo().alert();
		
		Thread.sleep(5000);
		
		System.out.println(alt.getText());
		
		alt.accept();
		
				
		
		driver.close();

	}

}
