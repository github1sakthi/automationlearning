package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.TestUtils;

public class GmailLogin {
	WebDriver gmailTestdriver;
	
	
	@Given("^Open browser and Gmail application is loaded$")
	public void open_browser_and_Gmail_application_is_loaded() throws Throwable {
		gmailTestdriver = TestUtils.loadDriver();
		gmailTestdriver.get("https://gmail.com");
	}

	// Hardcoded parameters
	@When("^User enters user id and clicks Next$")
	public void user_enters_user_id_and_clicks_Next() throws Throwable {
		gmailTestdriver.findElement(By.id("identifierId")).sendKeys("testcucumberSelinium");
		gmailTestdriver.findElement(By.id("identifierNext")).click();

	}

	@When("^User enters password and clicks Next$")
	public void user_enters_password_and_clicks_Next() throws Throwable {
		WebDriverWait wait = new WebDriverWait(gmailTestdriver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		gmailTestdriver.findElement(By.name("password")).sendKeys("2018test");
		gmailTestdriver.findElement(By.id("passwordNext")).click();

	}
	@Then("^Should take user to landing page$")
	public void should_take_user_to_landing_page() throws Throwable {
		WebDriverWait wait = new WebDriverWait(gmailTestdriver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(":3v")));
		gmailTestdriver.findElement(By.id(":3v")).isDisplayed();	}

}
