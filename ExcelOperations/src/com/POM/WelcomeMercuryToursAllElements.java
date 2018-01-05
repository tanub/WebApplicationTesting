package com.POM;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class WelcomeMercuryToursAllElements
{
	@FindBy(linkText="Home")
	WebElement home;
	
	@Test
	public void Home()
	{
		home.click();
	}
	
	@FindBy(linkText="Flights")
	WebElement flights;
	
	@Test
	public void Flights()
	{
		flights.click();
	}
	
	@FindBy(linkText="Hotels")
	WebElement hotels;
	
	@Test
	public void Hotels()
	{
		hotels.click();
	}
	
	@FindBy(linkText="Car Rentals")
	WebElement carrentals;
	
	@Test
	public void Carrentals()
	{
		carrentals.click();
	}
	
	@FindBy(linkText="Cruises") WebElement cruises;
	
	@Test
	public void Cruises()
	{
		cruises.click();
	}
	
	@FindBy(linkText="Destinations") WebElement destinations;
	
	@Test
	public void Destinations()
	{
		destinations.click();
	}
	
	@FindBy(linkText="Vacations") WebElement vacations;
	
	@Test
	public void Vacations()
	{
		vacations.click();
	}
	
	@FindBy(linkText="SIGN-ON") WebElement signon;
	
	@Test
	public void Signon()
	{
		signon.click();
	}
	
	@FindBy(linkText="REGISTER") WebElement register;
	
	@Test
	public void Register()
	{
		register.click();
	}
	
	@FindBy(linkText="SUPPORT") WebElement support;
	
	@Test
	public void Support()
	{
		support.click();
	}
	
	@FindBy(linkText="CONTACT") WebElement contact;
	
	@Test
	public void Contact()
	{
		contact.click();
	}
	
	@FindBy(name="userName") WebElement username;
	@FindBy(name="password") WebElement password;
	@FindBy(name="login") WebElement signin;
	
	@Test
	public void SignIn(String Uname,String Pwd)
	{
		username.sendKeys(Uname);
		password.sendKeys(Pwd);
		signin.click();
	}
	
	@FindBy(linkText="your destination") WebElement yourdestination;
	
	@Test
	public void Yourdestination()
	{
		yourdestination.click();
	}

	@FindBy(linkText="featured vacation destinations") WebElement featuredvacation;
	
	@Test
	public void Featuredvacation()
	{
		featuredvacation.click();
	}
	
	@FindBy(linkText="Register here") WebElement registerhere;
	
	@Test
	public void Registerhere()
	{
		registerhere.click();
	}
	
	@FindBy(linkText="Business Travel @ About.com") WebElement businesstravel;
	@Test
	public void Business()
	{
		businesstravel.click();
	}
	
	@FindBy(linkText="Salon Travel") WebElement salon;
	@Test
	public void Salon()
	{
		salon.click();
	}
	

}
