package usecases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Destinations {
	WebDriver driver;
	 
	 // Constructor that will be automatically called as soon as the object of the class is created
	public Destinations (WebDriver driver) {
		 this.driver = driver;
	}
	 
	// Locators
	By btnBook = By.cssSelector(".theme__button___1iKuo.theme__flat___2ui7t.BookButton__flat___1i5dr.theme__accent___3MS_k.BookButton__accent___Y-Paf");
	
	// Methods
	public void bookDestination (int destination) {
		driver.findElements(btnBook).get(destination - 1).click();
	}
	
}
