package com.Links_Nov30;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderBlockLinks_BingApplication {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://bing.com");
		
		WebElement HeaderBlock = driver.findElement(By.id("sc_hdu"));
		
		List<WebElement>HeaderLinks = 	HeaderBlock.findElements(By.tagName("a"));
		
		System.out.println(HeaderLinks.size());
		
		driver.close();
		

	}

}
