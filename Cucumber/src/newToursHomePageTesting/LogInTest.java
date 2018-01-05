package newToursHomePageTesting;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInTest
{
	FirefoxDriver driver;

	@Given("^Open Firefox Browser and Navigate to NewTours Applicaiton$")
	public void Open_Firefox_Browser_and_Navigate_to_NewTours_Applicaiton() throws Throwable 
	{
	   driver = new FirefoxDriver();
	   driver.get("http://newtours.demoaut.com");
	}

	@When("^User enters valid UserName and Password and click on SingIN Button$")
	public void User_enters_valid_UserName_and_Password_and_click_on_SingIN_Button() throws Throwable
	{
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
	}

	@Then("^user should be LogIn into the Applicaiton Successfully and Perform SignOFf$")
	public void user_should_be_LogIn_into_the_Applicaiton_Successfully_and_Perform_SignOFf() throws Throwable
	{
		String ExpectedTitle = "Find a Flight:";
		String ActualTitle = driver.getTitle();
		
		if(ActualTitle.contains(ExpectedTitle))
			System.out.println("Titles matched -- Pass");
		else
		{
			System.out.println("Titles mismatched -- Fail");
		}
			
		driver.findElement(By.linkText("SIGN-OFF")).click();
	}

	@Then("^User should close the Browser$")
	public void User_should_close_the_Browser() throws Throwable
	{
	 driver.close();
	}

}
