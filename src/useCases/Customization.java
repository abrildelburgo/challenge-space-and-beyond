package useCases;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Customization {
	WebDriver driver;
	 
	 // Constructor that will be automatically called as soon as the object of the class is created
	public Customization (WebDriver driver) {
		 this.driver = driver;
	}
	 
	// Locators
	By Departing = By.xpath("//*[@id=\"app\"]/div/section[1]/div[3]/div/div[1]/div/div/input");
	By Month_Days = By.className("theme__day___3cb3g");
	By Ok_Button = By.xpath("/html/body/div[2]/div/div[2]/nav/button[2]");
	By Adults = By.cssSelector("#app > div > section.Hero__hero___1FDXn > div:nth-child(3) > div > div:nth-child(3) > div > input");
	By Children = By.cssSelector("#app > div > section.Hero__hero___1FDXn > div:nth-child(3) > div > div:nth-child(4) > div > input");
	By Pax_List = By.cssSelector(".theme__values___1jS4g.WhiteDropDown__values___3lOeL");	
	By Select_Destination_Button = By.cssSelector("#app > div > section.Hero__hero___1FDXn > div:nth-child(4) > button");
	
	
	// Methods
	public void selectDeparting () {
		
		Utils.click(Departing, driver);
		
		List<WebElement> month = driver.findElements(Month_Days);
		month.get(month.size() - 1).click();
		
		Utils.wait(Ok_Button, 10, driver);
		Utils.click(Ok_Button, driver);	
	}
	
	public void addPax (int adults, int children) {
		
		Utils.selectLi(Adults, Pax_List, adults, 0, driver);
		Utils.selectLi(Children, Pax_List, children, 1, driver);
	}
	
	public void confirmCustomization () {
		
		Utils.click(Select_Destination_Button, driver);
	}
	
}
