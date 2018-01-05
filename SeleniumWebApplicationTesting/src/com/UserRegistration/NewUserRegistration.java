package com.UserRegistration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewUserRegistration {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Tanuj");
		
		driver.findElement(By.name("lastName")).sendKeys("hi");
		
		driver.findElement(By.name("phone")).sendKeys("2343");
		
		driver.findElement(By.name("userName")).sendKeys("sdfs@gmail.com");

		driver.findElement(By.name("address1")).sendKeys("Flat no:234, Arvind colony");
	
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		
		driver.findElement(By.name("state")).sendKeys("Telangana");
		
		
		driver.findElement(By.name("postalCode")).sendKeys("3232");
		
		driver.findElement(By.name("country")).sendKeys("TONGA");
		
		driver.findElement(By.name("email")).sendKeys("Tanu");
		
		driver.findElement(By.name("password")).sendKeys("asfdf@3434");
		
		driver.findElement(By.name("confirmPassword")).sendKeys("asfdf@3434");
		
		driver.findElement(By.name("register")).click();
		
		
		
		
	
	}
	

}
