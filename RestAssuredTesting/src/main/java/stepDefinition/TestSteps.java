package stepDefinition;


import java.util.Map;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	GetTest getTests;
	PostTest postTests;
	@Before
	public void setup() {

		getTests = new GetTest("http://services.groupkt.com/country/get/iso2code/");
		postTests = new PostTest("https://api.twitter.com/1.1/lists/create.json");

	}

	@Given("^the api is up and running for \"([^\"]*)\"$")
	public void the_api_is_up_and_running_for(String URI) throws Throwable {
		getTests.apiTest(URI);
	}

	@When("^the user performs get request to \"([^\"]*)\"$")
	public void the_user_performs_get_request_to(String countryCd) throws Throwable {
		getTests.getCountryName(countryCd);
	}

	@Then("^the Status Code is (\\d+)$")
	public void the_Status_Code_is(int statusCode) throws Throwable {
		getTests.validateResponseStatusCode(statusCode);
	}
	@Then("^ressponse includes the following$")
	public void ressponse_includes_the_following(Map<String,String> responseFields) throws Throwable {
		getTests.responseBodyCheckSingleFields(responseFields);
	}
	@When("^the user performs get search to \"([^\"]*)\"$")
	public void the_user_performs_get_search_to(String searchTxt) throws Throwable {
		getTests.performTextSearch(searchTxt);
	}

	@Then("^ressponse includes the following in any order$")
	public void ressponse_includes_the_following_in_any_order(Map<String, String> responseFields) throws Throwable {
		getTests.responseBodyCheckArrayFields(responseFields);
	}
	@When("^the user performs posts request with \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void the_user_performs_posts_request_with(String userId, String id, String title, String body) throws Throwable {
		postTests.submitPostRequest( userId,  id,  title,body);
	}

	@Then("^the Code Returned is \"([^\"]*)\"$")
	public void the_Code_Returned_is(String statusCode) throws Throwable {
	postTests.validateResponseStatusCode(Integer.valueOf(statusCode));
	}

	@Then("^the body includes the following$")
	public void the_body_includes_the_following(Map<String, String> responseFields) throws Throwable {
	postTests.responseBodyCheckArrayFields(responseFields);
	}


}
