package com.POM;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewToursHomePageTesting
{

	@Test
	public void NewToursTesting()
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		WelcomeMercuryTours WMT = PageFactory.initElements(driver, WelcomeMercuryTours.class);
		
		WMT.Register();
		driver.navigate().back();
		
		WMT.Support();
		
		driver.navigate().back();
		
		WMT.SignIn("tutorial", "tutorial");
		
		driver.close();
	}
	
	
}
