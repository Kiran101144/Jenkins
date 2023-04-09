package stepDefinatios;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class AStepDefination {
	RequestSpecification res;
	Response req;
	String result;

	@Given("verify {string}")
	public void verify(String string) {
		RestAssured.baseURI=string; 
		 res=given().spec(res).queryParam("key", "qaclick123").header("Content-Type", "application/json")
				 .body("{\r\n"
			+ "  \"location\": {\r\n"
			+ "    \"lat\": -38.383494,\r\n"
			+ "    \"lng\": 33.427362\r\n"
			+ "  },\r\n"
			+ "  \"accuracy\": 50,\r\n"
			+ "  \"name\": \"Frontline house2 India\",\r\n"
			+ "  \"phone_number\": \"(+91) 111 222 3333\",\r\n"
			+ "  \"address\": \"29, side Yooo, cohen 09\",\r\n"
			+ "  \"types\": [\r\n"
			+ "    \"shoe park\",\r\n"
			+ "    \"shop\"\r\n"
			+ "  ],\r\n"
			+ "  \"website\": \"http://google.com\",\r\n"
			+ "  \"language\": \"French-IN\"\r\n"
			+ "}");
	}

	@When("Add place")
	public void add_place() {
		req=res.when().post("/maps/api/place/add/json");
	}

	@Then("Verify Status Code {int}")
	public void verify_status_code(Integer int1) {
		 result=req.then().assertThat().statusCode(200)
		.body("scope", equalTo("APP")).header("Connection", "Keep-Alive").extract().response().asString();

	}

	@Then("Status Response Body {string}")
	public void status_response_body(String string) {
		System.out.println(result);
	}
}
