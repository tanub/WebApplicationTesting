package com.Links_Nov30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DisplayingVisibleLinkNames_HeaderBlock_Bing {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://bing.com");
		
		WebElement HeaderBlock = driver.findElement(By.id("sc_hdu"));
		
		
		
		

	}

}
