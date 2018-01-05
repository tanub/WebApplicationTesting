package com.LinksValidation_Screenshots;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GettingAttributeValue_RegisterLink {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		
		String ExpectedURL =  driver.findElement(By.linkText("REGISTER")).getAttribute("href");
		System.out.println(ExpectedURL);
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		String ActualURL = driver.getCurrentUrl();
		System.out.println(ActualURL);
		
		if (ActualURL.equals(ExpectedURL))
			System.out.println("Reached to the Expected page -- Pass ");
		else
			System.out.println("Reached to an unexpected page -- Fail");
		

	}

}
