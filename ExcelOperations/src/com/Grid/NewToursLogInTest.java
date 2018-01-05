package com.Grid;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewToursLogInTest
{

	@Parameters("Browser")
	
	@Test
	public void LogInTest(String b) throws IOException
	{
		System.out.println(b);
		
		DesiredCapabilities cap=null;
		
		if(b.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else
			if(b.equals("chrome"))
			{
				cap=DesiredCapabilities.chrome();
				cap.setBrowserName("chrome");
				cap.setPlatform(Platform.WINDOWS);
			}
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.112:4444/wd/hub"), cap);
		
		/*driver.get("http://newtours.demoaut.com");
		
		FileInputStream file = new FileInputStream("C:\\Users\\guru\\Eclipse_Tanuja_workspace\\ExcelOperations\\NewToursSignInProperties");
		
		Properties Pr = new Properties();
		Pr.load(file);
		
		driver.findElement(By.name(Pr.getProperty("Username"))).sendKeys("tutorial");
		driver.findElement(By.name(Pr.getProperty("Password"))).sendKeys("tutorial");
		driver.findElement(By.name(Pr.getProperty("SignIn"))).click();
		
		driver.close();*/
		
		driver.get("http://facebook.com");
		driver.close();
		
		
		
	}
	
	
}
