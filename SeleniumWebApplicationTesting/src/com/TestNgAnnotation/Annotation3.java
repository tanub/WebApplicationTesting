package com.TestNgAnnotation;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class Annotation3 
{

	@BeforeMethod
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
	
	
	@AfterMethod
	public void ApplicationClose()
	{
		System.out.println("Closing Application");
	}
}
