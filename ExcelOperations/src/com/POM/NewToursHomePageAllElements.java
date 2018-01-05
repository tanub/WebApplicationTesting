package com.POM;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewToursHomePageAllElements
{

		@Test
		public void NewToursAllElements()
		{
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("http://newtours.demoaut.com");
			
			WelcomeMercuryToursAllElements wmt = PageFactory.initElements(driver, WelcomeMercuryToursAllElements.class);
			
			wmt.Home();
			driver.navigate().back();
			
			wmt.Flights();
			driver.navigate().back();
			
			wmt.Hotels();
			driver.navigate().back();
			
			wmt.Carrentals();
			driver.navigate().back();
			
			wmt.Cruises();
			driver.navigate().back();
			
			wmt.Destinations();
			driver.navigate().back();
			
			wmt.Vacations();
			driver.navigate().back();
			
			wmt.Signon();
			driver.navigate().back();
			
			wmt.Register();
			driver.navigate().back();
			
			wmt.Support();
			driver.navigate().back();
			
			wmt.Contact();
			driver.navigate().back();
			
			wmt.SignIn("tutorial", "tutorial");
			driver.navigate().back();
			
			wmt.Yourdestination();
			driver.navigate().back();
			
			wmt.Yourdestination();
			driver.navigate().back();
			
			wmt.Registerhere();
			driver.navigate().back();
			
			wmt.Business();
			driver.navigate().back();
			
			wmt.Salon();
			driver.navigate().back();
			
			
		}
		
		
		
}
