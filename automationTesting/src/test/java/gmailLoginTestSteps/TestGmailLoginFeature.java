package gmailLoginTestSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestGmailLoginFeature {
	WebDriver driver;

	@Given("^Open browser and application loaded$")
	public void open_browser_and_application_loaded() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\devis\\eclipse-workspace\\automationTesting\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
	}

	@When("^User enters user id and clicks Next$")
	public void user_enters_user_id_and_clicks_Next() throws Throwable {
		driver.findElement(By.id("identifierId")).sendKeys("testcucumberSelinium");
		driver.findElement(By.id("identifierNext")).click();
	
	}
	@When("^User enters password and clicks Next$")
	public void user_enters_password_and_clicks_Next() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		driver.findElement(By.name("password")).sendKeys("2018test");
		driver.findElement(By.id("passwordNext")).click();
	
	}

	@Then("^Should take user to landing page$")
	public void should_take_user_to_landing_page() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(":3v")));
		driver.findElement(By.id(":3v")).isDisplayed();
	}
}
