package useCases;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {

	public static void sendKeys (By locator, String key, WebDriver driver ) {
		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(key);	
	}
	
	public static void click (By locator, WebDriver driver) {
		driver.findElement(locator).click();
	}
	
	public static void wait (By locator, long timeOutInSeconds, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public static void selectLi (By locator, By locator_2, int quantity, int index, WebDriver driver) {
		driver.findElements(locator).get(0).click();
		WebElement adult_list = driver.findElements(locator_2).get(index);
		List<WebElement> adult_numbers = adult_list.findElements(By.tagName("li"));
		adult_numbers.get(quantity).click();
	}
	
}
