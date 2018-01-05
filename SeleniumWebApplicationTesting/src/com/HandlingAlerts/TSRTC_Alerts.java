package com.HandlingAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TSRTC_Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver =  new FirefoxDriver();
		
		driver.get("http://www.tsrtconline.in/oprs-web");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("searchBtn")).click();
		
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		
		Thread.sleep(5000);
		
		alt.accept();
		
		//alt.dismiss();
		
		//alt.sendKeys("jhlkhg");
		
		
		driver.close();
				
				//searchBtn
	}

}
