package usecases;

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
	By dtpDeparting = By.xpath("//*[@id=\"app\"]/div/section[1]/div[3]/div/div[1]/div/div/input");
	By dgdMonthDays = By.className("theme__day___3cb3g");
	By btnOk = By.xpath("/html/body/div[2]/div/div[2]/nav/button[2]");
	By ddlAdults = By.cssSelector("#app > div > section.Hero__hero___1FDXn > div:nth-child(3) > div > div:nth-child(3) > div > input");
	By ddlChildren = By.cssSelector("#app > div > section.Hero__hero___1FDXn > div:nth-child(3) > div > div:nth-child(4) > div > input");
	By dblPax = By.cssSelector(".theme__values___1jS4g.WhiteDropDown__values___3lOeL");	
	By btnSelectDestination = By.cssSelector("#app > div > section.Hero__hero___1FDXn > div:nth-child(4) > button");
	
	// Methods
	public void setDeparting () {
		
		Utils.click(dtpDeparting, driver);
		
		List<WebElement> month = driver.findElements(dgdMonthDays);
		month.get(month.size() - 1).click();
		
		Utils.wait(btnOk, 10, driver);
		Utils.click(btnOk, driver);	
	}
	
	public void setPax (int adults, int children) {
		
		Utils.selectLi(ddlAdults, dblPax, adults, 0, driver);
		Utils.selectLi(ddlChildren, dblPax, children, 1, driver);
	}
	
	public void confirmCustomization () {
		
		Utils.click(btnSelectDestination, driver);
	}
	
}
