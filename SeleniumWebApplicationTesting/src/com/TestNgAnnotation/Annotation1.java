package com.TestNgAnnotation;

import org.testng.annotations.Test;

public class Annotation1 
{

	@Test(priority=1)
	public void BrowserLaunch()
	{
		System.out.println("This will launch the Browser");
	}
	
	@Test(priority=2)
	public void InBox()
	{
		System.out.println("Testing INBox Functionality");
	}
	
	@Test(priority=3)
	public void Compose()
	{
		System.out.println("Testing Compose Mail Fuctionality");
	}
	
}
