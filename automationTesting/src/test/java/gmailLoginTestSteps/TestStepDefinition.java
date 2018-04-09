package gmailLoginTestSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStepDefinition {
	WebDriver gmailTestdriver;
	WebDriver questTestdriver;
	WebDriver orbitzTestdriver;

	/**
	 * Following set of methods are to handle the steps defined in Scenario: User
	 * login with valid login credentials
	 */
	@Given("^Open browser and load gmail$")
	public void open_browser_and_load_gmail() throws Throwable {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\devis\\eclipse-workspace\\automationTesting\\drivers\\geckodriver.exe");
		gmailTestdriver = new FirefoxDriver();
		gmailTestdriver.manage().window().maximize();
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

	/**
	 * Following set of methods are to handle the steps defined in Scenario: User
	 * login with valid login credentials
	 * 
	 */

	@Given("^Open browser and load gmail for parameterized$")
	public void open_browser_and_load_gmail_for_parameterized() throws Throwable {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\devis\\eclipse-workspace\\automationTesting\\drivers\\geckodriver.exe");
		gmailTestdriver = new FirefoxDriver();
		gmailTestdriver.manage().window().maximize();
		gmailTestdriver.get("https://gmail.com");

	}

	@When("^User enters useridP \"([^\"]*)\" and clicks Next$")
	public void user_enters_useridP_and_clicks_Next(String emailId) throws Throwable {
		gmailTestdriver.findElement(By.id("identifierId")).sendKeys(emailId);
		gmailTestdriver.findElement(By.id("identifierNext")).click();
	}

	@When("^User enters passwordP \"([^\"]*)\" and clicks Next$")
	public void user_enters_passwordP_and_clicks_Next(String password) throws Throwable {
		WebDriverWait wait = new WebDriverWait(gmailTestdriver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		gmailTestdriver.findElement(By.name("password")).sendKeys(password);
		gmailTestdriver.findElement(By.id("passwordNext")).click();
	}

	@Then("^Should take user to landing page$")
	public void should_take_user_to_landing_page() throws Throwable {
		WebDriverWait wait = new WebDriverWait(gmailTestdriver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(":3v")));
		gmailTestdriver.findElement(By.id(":3v")).isDisplayed();
	}

	/**
	 * Scenario: User books an appointment for Diagnosis test
	 * 
	 */
	@Given("^Open browser and loaded quest diagnostics$")
	public void open_browser_and_loaded_quest_diagnostics() throws Throwable {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\devis\\eclipse-workspace\\automationTesting\\drivers\\geckodriver.exe");
		questTestdriver = new FirefoxDriver();
		questTestdriver.manage().window().maximize();
		questTestdriver.get("https://secure.questdiagnostics.com/hcp/psc/jsp/SearchLocation.do");
	}

	@When("^User enters location$")
	public void user_enters_location() throws Throwable {
		questTestdriver.findElement(By.id("city")).sendKeys("Topeka");
		questTestdriver.findElement(By.id("state")).click();
		Select state = new Select(questTestdriver.findElement(By.id("state")));
		state.selectByValue("KS");

	}

	@When("^User enters reason for testing$")
	public void user_enters_reason_for_testing() throws Throwable {
		questTestdriver.findElement(By.id("serviceTypeId")).click();
		WebDriverWait wait = new WebDriverWait(questTestdriver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("servicetype2")));
		questTestdriver.findElement(By.id("servicetype2")).click();
	}

	@When("^User enters date and time and clicks Continue$")
	public void user_enters_date_and_time_and_clicks_Continue() throws Throwable {
		// WebElement date = questTestdriver.findElement(By.id("date"));
		// date.sendKeys("04302018");
		// date.sendKeys(Keys.DOWN);

		questTestdriver.findElement(By.cssSelector("img.trigger.datepick-trigger")).click();

		WebDriverWait wait = new WebDriverWait(questTestdriver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.datepick-nav")));
		questTestdriver.findElement(By.partialLinkText("30")).click();
		Select timeSlot = new Select(questTestdriver.findElement(By.id("timeSlot")));
		timeSlot.selectByValue("11:00");

		questTestdriver.findElement(By.cssSelector("input.qdbutton.find")).click();

	}

	@Then("^Should reload the page with appointment details$")
	public void should_reload_the_page_with_appointment_details() throws Throwable {
		questTestdriver.findElement(By.partialLinkText("Quest Diagnostics - Topeka"));
		questTestdriver.findElement(By.partialLinkText("08:15")).click();
	}

	/**
	 * Scenario: User searches for ticket in orbitz
	 * 
	 */
	@Given("^Open browser and loaded orbitz portal$")
	public void open_browser_and_loaded_orbitz_portal() throws Throwable {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\devis\\eclipse-workspace\\automationTesting\\drivers\\geckodriver.exe");
		orbitzTestdriver = new FirefoxDriver();
		orbitzTestdriver.manage().window().maximize();
		orbitzTestdriver.get("https://www.orbitz.com/");

	}

	@When("^User clicks on flight tab$")
	public void user_clicks_on_flight_tab() throws Throwable {
		orbitzTestdriver.findElement(By.id("tab-flight-tab-hp")).click();
		waitForElementPresenceOrvisibilityById("flight-type-roundtrip-hp-flight", orbitzTestdriver);
	}

	@When("^Enters flying from and flying to airport codes$")
	public void enters_flying_from_and_flying_to_airport_codes() throws Throwable {
		orbitzTestdriver.findElement(By.id("flight-origin-hp-flight")).sendKeys("MCI");
		waitForElementPresenceOrvisibilityByCssSelector("div.autocomplete-dropdown", orbitzTestdriver);
		orbitzTestdriver.findElement(By.id("aria-option-0")).click();

		orbitzTestdriver.findElement(By.id("flight-destination-hp-flight")).sendKeys("MAA");
		waitForElementPresenceOrvisibilityById("aria-option-0", orbitzTestdriver);
		orbitzTestdriver.findElement(By.id("aria-option-0")).click();
	}

	@When("^Enters departing and returning dates$")
	public void enters_departing_and_returning_dates() throws Throwable {
		orbitzTestdriver.findElement(By.id("flight-departing-hp-flight")).click();
		orbitzTestdriver.findElement(By.cssSelector("button[data-year='2018'][data-month='3'][data-day='26']")).click();
		orbitzTestdriver.findElement(By.id("flight-returning-hp-flight")).click();
		orbitzTestdriver.findElement(By.cssSelector("button[data-year='2018'][data-month='4'][data-day='26']")).click();
	}

	@When("^Clicks advanced option link and choses nonStop checkbox$")
	public void clicks_advanced_option_link_and_choses_nonStop_checkbox() throws Throwable {
		orbitzTestdriver.findElement(By.id("flight-advanced-options-hp-flight")).click();
		waitForElementPresenceOrvisibilityById("advanced-flight-nonstop-hp-flight", orbitzTestdriver);
		orbitzTestdriver.findElement(By.id("advanced-flight-nonstop-hp-flight")).click();
	}

	@When("^Selects Emirates as the prefered airline$")
	public void selects_Emirates_as_the_prefered_airline() throws Throwable {
		Select prefAirline = new Select(
				orbitzTestdriver.findElement(By.id("flight-advanced-preferred-airline-hp-flight")));
		prefAirline.selectByValue("EY");
		Select prefClass = new Select(orbitzTestdriver.findElement(By.id("flight-advanced-preferred-class-hp-flight")));
		prefClass.selectByValue("premium");
	}

	@When("^clicks on Search button$")
	public void clicks_on_Search_button() throws Throwable {
		orbitzTestdriver.findElement(By.cssSelector("button[class=\"btn-primary btn-action gcw-submit \"]")).click();

	}

	@Then("^Should load results page with available flights$")
	public void should_load_results_page_with_available_flights() throws Throwable {
		orbitzTestdriver.findElement(By.cssSelector("div.title-date-rtv"));
	}

	/**
	 * This method is to wait for webElements to load. WebElements are identified by
	 * Name.
	 * 
	 * @param elementName
	 * @param driver
	 */
	public void waitForElementPresenceOrvisibilityByName(String elementName, WebDriver driver) {
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

	public void waitForElementPresenceOrvisibilityById(String elementId, WebDriver driver) {
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
	private void waitForElementPresenceOrvisibilityByCssSelector(String cssSelector, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(cssSelector)));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssSelector)));
	}

}
