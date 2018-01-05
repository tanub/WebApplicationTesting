package com.TestNGAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations3 
{
	@BeforeTest
	public void BrowserLauchAndLogin()
	{
		System.out.println("This is to test Browser Launch");
	}
	
	@Test(priority=2)
	public void ComposeMail()
	{
		System.out.println("This is to test compose mail");
	}
	
	@Test(priority=1)
	public void Inbox()
	{
		System.out.println("This is to test Inbox");
	}
	
	@AfterTest
	public void ApplicationClose()
	{
		System.out.println("This is to test Application close");
	}
	
}
