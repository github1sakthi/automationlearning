package stepDefinition;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetTest {
	String baseURI;
	RequestSpecification request;
	ValidatableResponse response;
	public GetTest(String base) {
		baseURI = base;
	}
	
	public void apiTest(String url) {
		response = given().when().get(url).then();
		response.assertThat().statusCode(200);
	}
	
	public void getCountryName(String countryCode) {
		System.out.println(countryCode);
		response= given().when().get("http://services.groupkt.com/country/get/iso2code/"+countryCode).then();
	}
	
	public void performTextSearch(String textInput) {
		response= given().when().param("text", textInput).get("http://services.groupkt.com/country/search").then();
	}
	public void validateResponseStatusCode(int statusCode) {
		response.assertThat().statusCode(statusCode);
	}
	
	public void responseBodyCheckSingleFields(Map<String, String> responseFields) {
		
		for (Map.Entry<String, String> field : responseFields.entrySet()) {
			if(StringUtils.isNumeric(field.getValue())){
				response.body(field.getKey(), equalTo(Integer.parseInt(field.getValue())));
			}
			else{
				response.body(field.getKey(), equalTo(field.getValue()));
			}
		}
		
	}
	public void responseBodyCheckArrayFields(Map<String, String> responseFields) {
		for (Map.Entry<String, String> field : responseFields.entrySet()) {
				response.body(field.getKey(), equalTo(field.getValue()));
		}
		
	}
}
