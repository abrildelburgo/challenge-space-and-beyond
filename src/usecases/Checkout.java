package usecases;

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
	By txtName = By.cssSelector("#app > div > div:nth-child(5) > section:nth-child(1) > div.flexboxgrid__row___1y_mg.flexboxgrid__center-xs___1JWon > div.theme__card___2nWQb.CustomerInfo__customer-info___3e5NH > form > div:nth-child(1) > input");
	By txtEmailAddress = By.cssSelector("#app > div > div:nth-child(5) > section:nth-child(1) > div.flexboxgrid__row___1y_mg.flexboxgrid__center-xs___1JWon > div.theme__card___2nWQb.CustomerInfo__customer-info___3e5NH > form > div:nth-child(2) > input");
	By txtSocialSecurityNumber = By.cssSelector("#app > div > div:nth-child(5) > section:nth-child(1) > div.flexboxgrid__row___1y_mg.flexboxgrid__center-xs___1JWon > div.theme__card___2nWQb.CustomerInfo__customer-info___3e5NH > form > div:nth-child(3) > input");
	By txtPhoneNumber = By.cssSelector("#app > div > div:nth-child(5) > section:nth-child(1) > div.flexboxgrid__row___1y_mg.flexboxgrid__center-xs___1JWon > div.theme__card___2nWQb.CustomerInfo__customer-info___3e5NH > form > div:nth-child(4) > input");
	By chkTermsAndConditions = By.cssSelector("#app > div > div:nth-child(5) > section:nth-child(1) > div.flexboxgrid__row___1y_mg.flexboxgrid__center-xs___1JWon > div.Box__box___2XzJ2.OrderSummary__order-summary___1kfwQ > div:nth-child(6) > div > label > div");
	By btnPayNow = By.cssSelector("#app > div > div:nth-child(5) > section:nth-child(1) > div.flexboxgrid__row___1y_mg.flexboxgrid__center-xs___1JWon > div.Box__box___2XzJ2.OrderSummary__order-summary___1kfwQ > div:nth-child(8) > div");
	
	// Methods
	public void fillPersonalData (String name, String emailAddress, String socialSecurityNumber, String phone) {
		
		Utils.sendKeys(txtName, name, driver);
		Utils.sendKeys(txtEmailAddress, emailAddress, driver);
		Utils.sendKeys(txtSocialSecurityNumber, socialSecurityNumber, driver);
		Utils.sendKeys(txtPhoneNumber, phone, driver);
	}
	
	public void clickTermsAndConditions () {
		Utils.click(chkTermsAndConditions, driver);
	}
	
	public WebElement findPayButton () {
		return driver.findElement(btnPayNow);
	}
}
