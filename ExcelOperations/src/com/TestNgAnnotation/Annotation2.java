package com.TestNgAnnotation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation2
{

	@BeforeTest
	public void BrowserLaunchAndLogIn()
	{
		System.out.println("Launching FireFox Browser and Testing LogIn");
	}
	
	
	@Test(priority=1)
	public void InBox()
	{
		System.out.println("Testing InBox Functionality");
	}
	
	@Test
	public void Compose()
	{
		System.out.println("Testing Compose mail Functionliaty");
	}
	
	
	@AfterTest
	public void ApplicationClose()
	{
		System.out.println("Closing Application");
	}
	
}
