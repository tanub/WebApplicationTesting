package com.HomePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ClickNavigationForwardBackward {

	public static void main(String[] args) 
	{

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com");
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println(Links.size());//642
		
		driver.findElement(By.xpath("//label[@for='switch__input_3']")).click();
		driver.findElement(By.cssSelector("input[id='hp-widget__sfrom']")).click();
		//String Opt = "New Delhi, India ";
		
		//driver.findElement(By.id("hp-widget__sfrom")).clear();
	//	WebElement From = driver.findElement(By.className("locationFilter autocomplete_from"));
	/*	WebElement From = driver.findElement(By.cssSelector("div[class='locationFilter autocomplete_from']"));
		
		List<WebElement> Values =From.findElements(By.tagName("li"));
		for(WebElement Option : Values)
		{
			if(Option.getText().equals(Opt))
			{
				Option.click();
				break;
			}
		}*/
		WebElement From = driver.findElement(By.id("hp-widget__sfrom"));
		
		From.click();
		
		/*WebElement FromList = From.findElement(By.cssSelector("ul[id='ui-id-1']"));
		
		Select ab= new Select(FromList);
		
		ab.selectByIndex(3);*/
		
		driver.findElement(By.cssSelector("li[aria-label=['Top Cities : New Delhi, India']")).click();
		
	
		

	}

}
