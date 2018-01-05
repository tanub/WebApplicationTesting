package com.TestNGAnnotations;

import org.testng.annotations.Test;

public class Annotations1 {

	@Test(priority=3)
	public void FirefoxLogin()
	{
		System.out.println("This is to test script");
	}
	@Test(priority=1)
	public void Inbox()
	{
		System.out.println("This is to test Inbox Functionality");
	}
	@Test(priority=2)
	public void ComposeMail()
	{
		System.out.println("This is to test Compose mail functionality");
	}
}
