package com.TestNGDragAndDrop;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDrop
{
	FirefoxDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
	}
	
	@Test
	public void iframe() throws InterruptedException
	{
		Actions act = new Actions(driver);
		//act.moveToElement(driver.findElement(By.className("demo-frame")));
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement Source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		act.dragAndDrop(Source, destination).perform();
		Thread.sleep(5000);
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
