package day_29_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_SignInClick {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
		
		//driver.findElement(By.id("gb_70")).click();
		
	 //driver.findElement(By.linkText("Sign in")).click();
		
	 
	 WebElement signin = driver.findElement(By.partialLinkText("Sign"));
			 
			 signin.click();
	 
		//driver.close();

	}

}
