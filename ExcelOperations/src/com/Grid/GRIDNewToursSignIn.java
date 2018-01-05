package com.Grid;


import java.net.MalformedURLException;
//import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GRIDNewToursSignIn {
	
	@Parameters("Browser")
	@Test
	public void NewToursSignIn(String b) throws MalformedURLException 
	{
		System.out.println(b);
		
		DesiredCapabilities cap = null;
		if(b.equals("firefox"))
		{
			cap =DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
			
		}
		
		else if(b.equals("edge"))
		{
		//	cap=DesiredCapabilities.edge();
			cap.setBrowserName("edge");
			cap.setPlatform(Platform.WINDOWS);
		}
	
	
	RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.112:4444/wd/hub"), cap);
	driver.get("http://newtours.demoaut.com");
	driver.findElement(By.name("userName")).sendKeys("tutorial");
	driver.findElement(By.name("password")).sendKeys("tutorial");
	driver.findElement(By.name("login")).click();
	driver.close();
	
	}

}
