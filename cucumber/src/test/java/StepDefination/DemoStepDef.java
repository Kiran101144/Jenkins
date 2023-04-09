package StepDefination;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import Pojo.getTokenDser;
import ResourceFiles.APIResources;
import ResourceFiles.TestDataBuild;
import ResourceFiles.Utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class DemoStepDef extends Utils {
	Pojo.getTokenSer tok;
	getTokenDser tokden;
	RequestSpecification res;
	ResponseSpecification req;
	TestDataBuild TD = new TestDataBuild();
	Response respose;

	@Given("given input url and required body")
	public void given_input_url_and_required_body() {
		
		System.out.println("Given");

	}

	@When("Send the request with {string} and {string}")
	public void send_the_request_with_and(String userID, String Pass) throws IOException {
		APIResources log = APIResources.valueOf("Login");
		// System.out.println(log.getResource());
		res = given().spec(requestSpecification()).body(TD.login(userID, Pass));
		req = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		respose = res.when().log().all().post(log.getResource());
		System.out.println(respose.getStatusCode());
		assertEquals(respose.getStatusCode(), 200);

		// gettoken =
		// getToken.when().post(log.).then().extract().response().as(getTokenDser.class);

	}

	@Then("After sending request it should display status {int}")
	public void after_sending_request_it_should_display_status(Integer int1) {
		// tokden = new getTokenDser();
		tokden = respose.then().extract().response().as(getTokenDser.class);
		String ID = tokden.getUserId();
		String token = tokden.getToken();
		System.out.println(ID);
		System.out.println(token);
	}
}
