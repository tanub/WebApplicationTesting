package day_27_1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Capturing_TitleURL {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://facebook.com");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		String Expectedtitle = "Facebook – log in or sign up";
		
		String Actualtitle = driver.getTitle();
	
		if (Actualtitle.equals(Expectedtitle))
			
		
			System.out.println("Title Matched -- PASS");
			
		
		else
			System.out.println("Title not matched -- FAIL");
		
		String ExpectedURL = "facebook.com";
		
		String ActualURL = driver.getCurrentUrl();
		
		if (ActualURL.contains(ExpectedURL))
			System.out.println("URL matched -- PASS");
		
		else
			System.out.println("URL not matched -- FAIL");
		

	}

}
