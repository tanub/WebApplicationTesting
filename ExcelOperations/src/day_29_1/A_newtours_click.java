package day_29_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A_newtours_click {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
		WebElement Register = driver.findElement(By.linkText("REGISTER"));
		
		Register.click();
		
		WebElement Vacations = driver.findElement(By.linkText("Vacations"));
		
		Vacations.click();
		
	//driver.findElement(By.xpath("//img[@src='/images/forms/home.gif']")).click();
		
		driver.findElement(By.cssSelector("[src='/images/forms/home.gif']")).click();
		
		
	}

}
