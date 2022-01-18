package useCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkout {
	WebDriver driver;
	 
	 // Constructor that will be automatically called as soon as the object of the class is created
	public Checkout (WebDriver driver) {
		 this.driver = driver;
	}
	 
	// Locators
	By Name = By.cssSelector("#app > div > div:nth-child(5) > section:nth-child(1) > div.flexboxgrid__row___1y_mg.flexboxgrid__center-xs___1JWon > div.theme__card___2nWQb.CustomerInfo__customer-info___3e5NH > form > div:nth-child(1) > input");
	By Email_Address = By.cssSelector("#app > div > div:nth-child(5) > section:nth-child(1) > div.flexboxgrid__row___1y_mg.flexboxgrid__center-xs___1JWon > div.theme__card___2nWQb.CustomerInfo__customer-info___3e5NH > form > div:nth-child(2) > input");
	By Social_Security_Number = By.cssSelector("#app > div > div:nth-child(5) > section:nth-child(1) > div.flexboxgrid__row___1y_mg.flexboxgrid__center-xs___1JWon > div.theme__card___2nWQb.CustomerInfo__customer-info___3e5NH > form > div:nth-child(3) > input");
	By Phone_Number = By.cssSelector("#app > div > div:nth-child(5) > section:nth-child(1) > div.flexboxgrid__row___1y_mg.flexboxgrid__center-xs___1JWon > div.theme__card___2nWQb.CustomerInfo__customer-info___3e5NH > form > div:nth-child(4) > input");
	By TermsAndConditionsCheckbox = By.cssSelector("#app > div > div:nth-child(5) > section:nth-child(1) > div.flexboxgrid__row___1y_mg.flexboxgrid__center-xs___1JWon > div.Box__box___2XzJ2.OrderSummary__order-summary___1kfwQ > div:nth-child(6) > div > label > div");
	By PayNowButton = By.cssSelector("#app > div > div:nth-child(5) > section:nth-child(1) > div.flexboxgrid__row___1y_mg.flexboxgrid__center-xs___1JWon > div.Box__box___2XzJ2.OrderSummary__order-summary___1kfwQ > div:nth-child(8) > div");
	
	// Methods
	public void completeDataInformation (String name, String emailAddress, String socialSecurityNumber, String phone) {
		
		Utils.sendKeys(Name, name, driver);
		Utils.sendKeys(Email_Address, emailAddress, driver);
		Utils.sendKeys(Social_Security_Number, socialSecurityNumber, driver);
		Utils.sendKeys(Phone_Number, phone, driver);
	}
	
	public void checkTermsAndConditions () {
		Utils.click(TermsAndConditionsCheckbox, driver);
	}
	
	public WebElement payNow () {
		return driver.findElement(PayNowButton);
	}
}
