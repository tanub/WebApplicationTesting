package com.WebTable_Dec4;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//import com.sun.jna.platform.win32.OaIdl.VARKIND;

public class A_NewTours_Register_Country {

	
	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		WebElement Country = driver.findElement(By.xpath("//select[@name='country']"));
		
		//Country.click();
		
		List<WebElement> Value1= Country.findElements(By.tagName("option"));
		
		System.out.println(Value1.size());
		
		for (int i=0;i<Value1.size();i++)
		
			
			System.out.println(i+"."+Value1.get(i).getText());
			
	}

}
