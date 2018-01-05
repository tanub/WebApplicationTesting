package day_Nov27;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Object_Class_basicmethods {

	public static void main(String[] args) {
		
		FirefoxDriver abc = new FirefoxDriver();
		
		abc.get("http://www.facebook.com");
		
		abc.get("www.google.com");
		
		abc.close();
		
		

	}

}
