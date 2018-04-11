package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestUtils {
	public static WebDriver loadDriver() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\devis\\eclipse-workspace\\automationTesting\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;

	}

	/**
	 * This method is to wait for webElements to load. WebElements are identified by
	 * Name.
	 * 
	 * @param elementName
	 * @param driver
	 */
	public static void waitForElementPresenceOrvisibilityByName(String elementName, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name(elementName)));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(elementName)));
	}

	/**
	 * This method is to wait for webElements to load. WebElements are identified by
	 * Id.
	 * 
	 * @param elementId
	 * @param driver
	 */

	public static void waitForElementPresenceOrvisibilityById(String elementId, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elementId)));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementId)));
	}

	/**
	 * This method is to wait for webElements to load. WebElements are identified by
	 * cssSelector.
	 * 
	 * @param cssSelector
	 * @param driver
	 */
	public static void waitForElementPresenceOrvisibilityByCssSelector(String cssSelector, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(cssSelector)));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssSelector)));
	}

}
