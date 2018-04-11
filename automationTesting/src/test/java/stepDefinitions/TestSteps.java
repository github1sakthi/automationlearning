package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.TestUtils;

public class TestSteps {
	WebDriver webDriver;
	GmailLogin GmailLoginTest;
	OrbitzFlightSearch OrbitzFlightSearchTest;
	
	@Given("^Open browser and Gmail application is loaded$")
	public void open_browser_and_Gmail_application_is_loaded() throws Throwable {
		webDriver = TestUtils.loadDriver();
		GmailLoginTest  = new GmailLogin(webDriver);
		webDriver.get("https://gmail.com");
	}

	@When("^User enters user id and clicks Next$")
	public void user_enters_user_id_and_clicks_Next() throws Throwable {
		GmailLoginTest.enterLoginId("testcucumberSelinium");
	}

	@When("^User enters password and clicks Next$")
	public void user_enters_password_and_clicks_Next() throws Throwable {
		TestUtils.waitForElementPresenceOrvisibilityByName("password", webDriver);
		GmailLoginTest.enterLoginPassword("2018test");
	
	}

	@Then("^Should take user to landing page$")
	public void should_take_user_to_landing_page() throws Throwable {
		GmailLoginTest.validateSuccess();
	}

	@When("^User enters test user id and clicks Next$")
	public void user_enters_test_user_id_and_clicks_Next(DataTable userIDs) {
		List<List<String>> data = userIDs.raw();
		GmailLoginTest.enterLoginId(data.get(0).get(0));
		
	}
	@And("^User enters test password and clicks Next$")
	public void user_enters_test_password_and_clicks_Next(DataTable userPasswords) {
		List<List<String>> data = userPasswords.raw();
		TestUtils.waitForElementPresenceOrvisibilityByName("password", webDriver);
		GmailLoginTest.enterLoginPassword(data.get(0).get(0));
	
	}


	@Given("^Open browser and loaded orbitz portal$")
	public void open_browser_and_loaded_orbitz_portal() throws Throwable {
		webDriver = TestUtils.loadDriver();
		OrbitzFlightSearchTest = new OrbitzFlightSearch(webDriver);
		webDriver.get("https://www.orbitz.com/");

	}

	@When("^User clicks on flight tab$")
	public void user_clicks_on_flight_tab() throws Throwable {
		OrbitzFlightSearchTest.clickFlightTab();
		TestUtils.waitForElementPresenceOrvisibilityById("flight-type-roundtrip-hp-flight", webDriver);
	}

	@When("^Enters flying from and flying to airport codes$")
	public void enters_flying_from_and_flying_to_airport_codes() throws Throwable {
		OrbitzFlightSearchTest.selectOrginAndDestination("MCI", "MAA");
		}

	@When("^Enters departing and returning dates$")
	public void enters_departing_and_returning_dates() throws Throwable {
		OrbitzFlightSearchTest.selectStartAndEndDate();
		}

	@When("^Clicks advanced option link and choses nonStop checkbox$")
	public void clicks_advanced_option_link_and_choses_nonStop_checkbox() throws Throwable {
		OrbitzFlightSearchTest.selectAdvancedOptions();
		}

	@When("^Selects Emirates as the prefered airline$")
	public void selects_Emirates_as_the_prefered_airline() throws Throwable {
		OrbitzFlightSearchTest.selectPreference("EY","premium");	
	}

	@When("^clicks on Search button$")
	public void clicks_on_Search_button() throws Throwable {
		OrbitzFlightSearchTest.submit();
	}

	@Then("^Should load results page with available flights$")
	public void should_load_results_page_with_available_flights() throws Throwable {
		OrbitzFlightSearchTest.validateSuccess();
	}

}
