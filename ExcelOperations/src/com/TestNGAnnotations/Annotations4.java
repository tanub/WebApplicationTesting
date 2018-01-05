package com.TestNGAnnotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations4
{
	@BeforeMethod
	public void BrowserLaunchAndLogIn()
	{
		System.out.println("This is to test browser launch");
	}
	
	@Test(priority=2)
	public void ComposeMail()
	{
		System.out.println("This is to test Compose mail functionality");
	}
	
	@Test(priority=1)
	public void InboxFunctionality()
	{
		System.out.println("This is to test Inbox functionality");
	}
	
	@AfterMethod()
	public void ApplicationClose()
	{
		System.out.println("This is to test Application close");
	}
}
