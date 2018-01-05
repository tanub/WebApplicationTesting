package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeMercuryTours
{

	//WebElement register=driver.findElement(By.linkText("REGISTER"));
	
	@FindBy(linkText="REGISTER")
	WebElement register;
	
	public void Register()
	{
		register.click();
	}
	
	
	@FindBy(linkText="SUPPORT")
	WebElement support;
	
	public void Support()
	{
		support.click();
	}
	
	@FindBy(name="userName")
	WebElement UserName;

	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="login")
	WebElement login;
	
	public void SignIn(String Uname,String Pwd)
	{
		UserName.sendKeys(Uname);
		Password.sendKeys(Pwd);
		login.click();
	}
}
