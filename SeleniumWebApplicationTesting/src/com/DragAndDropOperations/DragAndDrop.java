package com.DragAndDropOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		Actions act = new Actions(driver);
		
		// driver.switchTo().frame(0);
		  
		  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));	
		
				
		WebElement Source = driver.findElement(By.id("draggable"));
		
		WebElement Destination = driver.findElement(By.id("droppable"));
		
		Thread.sleep(5000);
		
		act.dragAndDrop(Source, Destination).perform();
		
		driver.close();
		
		

	}

}
