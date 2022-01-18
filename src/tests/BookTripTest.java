package tests;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import usecases.*;

public class BookTripTest {
	
	Customization customization;
	Destinations destinations;
	Checkout checkout;
	static WebDriver driver;
	int adults;
	int children;
	int destination;
	String name;
	String emailAddress;
	String socialSecurityNumber;
	String phone; 
	WebElement payNowButton;

	@BeforeClass
    public static void setupOnce() {

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\WebDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.testim.io/");
    }
	
	@Before
	public void setUp() {
	  
		customization = new Customization(driver);
		destinations = new Destinations(driver);
		checkout = new Checkout(driver);
		
		adults = 3;
		children = 1;
		destination = 2;
		
		name = "Abril del Burgo";
		emailAddress = "mdelburgo@frba.utn.edu.ar";
		socialSecurityNumber = "123-45-6789";
		phone = "667777777"; 
		
		customization.setDeparting();
		customization.setPax(adults, children);
		customization.confirmCustomization();
	
		destinations.bookDestination(destination);
		
		checkout.fillPersonalData(name, emailAddress, socialSecurityNumber, phone);
		checkout.clickTermsAndConditions();
		payNowButton = checkout.findPayButton();

	}
	
	@Test
	public void testCanBookATripSuccessfully() {
		assertTrue(payNowButton.isEnabled());
	}
	
	@AfterClass
    public static void tearDownOnce() {
		driver.close();
    }

}
