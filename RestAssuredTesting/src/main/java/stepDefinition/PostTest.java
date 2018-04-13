package stepDefinition;

import static org.hamcrest.Matchers.equalTo;

import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostTest {
	JSONObject requestParams;
	ValidatableResponse json;
	Response response;
	RequestSpecification request;

	public PostTest(String base) {
		
	
		RestAssured.baseURI = base;
		
	}

	public void submitPostRequest(String userId, String id, String title,String body) throws JSONException {
		requestParams = new JSONObject();
		request = RestAssured.given();
		request.header("Content-Type","application/json");
		requestParams.put("userId", userId);
		requestParams.put("id", id);
		requestParams.put("title", title);
		requestParams.put("body", body);
		
		request.body(requestParams.toString());
		response = request.post(" https://jsonplaceholder.typicode.com/posts/");
	
		
	}
	public void validateResponseStatusCode(int statusCode) {
		response.then().assertThat().statusCode(statusCode);
	}

	public void ValidateStatusCode(int status_code) {
		
		response.then().assertThat().statusCode(status_code);
	}

	public void responseBodyCheckArrayFields(Map<String, String> responseFields) {
		for (Map.Entry<String, String> field : responseFields.entrySet()) {
			response.then().body(field.getKey(), equalTo(field.getValue()));
	}
		
	}

}
