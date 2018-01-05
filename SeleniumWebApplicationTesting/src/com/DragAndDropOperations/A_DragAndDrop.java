package com.DragAndDropOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class A_DragAndDrop {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		Actions Act = new Actions(driver);
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement Source = driver.findElement(By.id("draggable"));
		
		WebElement Destination = driver.findElement(By.id("droppable"));
		
		Act.dragAndDrop(Source, Destination).perform();
		
		

		
		//draggable
		//droppable
	}

}
