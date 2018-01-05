package com.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsBasic_HoverMouse {

	public static void main(String[] args) {
		
		
		FirefoxDriver driver =  new FirefoxDriver();
		                           
		driver.get("https://www.amazon.com/");
		
		Actions SignIn = new Actions(driver);
		
		SignIn.moveToElement(driver.findElement(By.cssSelector("[class='nav-line-1']"))).build().perform();

	}

}
