package CODE;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import Body.Body;

public class Demo {
	public static void main(String[] args) {

		RestAssured.baseURI = "https://rahulshettyacademy.com";
		// given all the input required.
		given().log().all().queryParam("key", "qaclick123")
				.header("Content-Type", "application/json")
				.body(Body.put())
		.when().post("/maps/api/place/add/json")
		//The Data what we give after then that as output values
		.then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP"))
		.header("Connection", "Keep-Alive");

//		JsonPath p = new JsonPath(response);
//		String place = p.getString("place_id");
//		System.out.println(place);

	}

}
