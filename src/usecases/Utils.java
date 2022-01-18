package usecases;

import java.time.Duration;
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
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOutInSeconds));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public static void selectLi (By dropdownLocator, By dataListLocator, int quantity, int index, WebDriver driver) {
		driver.findElements(dropdownLocator).get(0).click();
		WebElement list = driver.findElements(dataListLocator).get(index);
		List<WebElement> numbers = list.findElements(By.tagName("li"));
		numbers.get(quantity).click();
	}
	
}
