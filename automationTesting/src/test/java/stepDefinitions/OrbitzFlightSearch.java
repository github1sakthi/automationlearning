package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.TestUtils;

public class OrbitzFlightSearch {
	WebDriver orbitzTestdriver;

	@Given("^Open browser and loaded orbitz portal$")
	public void open_browser_and_loaded_orbitz_portal() throws Throwable {
		orbitzTestdriver = TestUtils.loadDriver();;
		orbitzTestdriver.get("https://www.orbitz.com/");

	}

	@When("^User clicks on flight tab$")
	public void user_clicks_on_flight_tab() throws Throwable {
		orbitzTestdriver.findElement(By.id("tab-flight-tab-hp")).click();
		TestUtils.waitForElementPresenceOrvisibilityById("flight-type-roundtrip-hp-flight", orbitzTestdriver);
	}

	@When("^Enters flying from and flying to airport codes$")
	public void enters_flying_from_and_flying_to_airport_codes() throws Throwable {
		orbitzTestdriver.findElement(By.id("flight-origin-hp-flight")).sendKeys("MCI");
		TestUtils.waitForElementPresenceOrvisibilityByCssSelector("div.autocomplete-dropdown", orbitzTestdriver);
		orbitzTestdriver.findElement(By.id("aria-option-0")).click();

		orbitzTestdriver.findElement(By.id("flight-destination-hp-flight")).sendKeys("MAA");
		TestUtils.waitForElementPresenceOrvisibilityById("aria-option-0", orbitzTestdriver);
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
		TestUtils.waitForElementPresenceOrvisibilityById("advanced-flight-nonstop-hp-flight", orbitzTestdriver);
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

	
}

