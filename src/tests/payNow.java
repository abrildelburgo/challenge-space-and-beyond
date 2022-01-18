package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import useCases.*;

public class payNow {

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.testim.io/");

		Customization customization = new Customization(driver);
		Destinations destinations = new Destinations(driver);
		Checkout checkout = new Checkout(driver);
		
		customization.selectDeparting();
		
		int adults = 3;
		int children = 1;
		customization.addPax(adults, children);
		
		customization.confirmCustomization();
		
		int destination = 2;
		destinations.bookDestination(destination);
		
		String name = "Abril del Burgo";
		String emailAddress = "mdelburgo@frba.utn.edu.ar";
		String socialSecurityNumber = "123-45-6789";
		String phone = "667777777"; 
		checkout.completeDataInformation(name, emailAddress, socialSecurityNumber, phone);
		checkout.checkTermsAndConditions();
		
		WebElement payNowButton = checkout.payNow();
		assertTrue(payNowButton.isEnabled());
	}

}
