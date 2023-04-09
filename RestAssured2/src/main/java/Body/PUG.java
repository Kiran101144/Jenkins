package Body;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

public class PUG {
	public static void main(String[] args) {
		post();
	}

	public static String post() {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(Body.put()).when().post("/maps/api/place/add/json").then().assertThat().statusCode(200)
				.body("scope", equalTo("APP")).header("Connection", "Keep-Alive").extract().response().asString();
		// System.out.println(response);
		JsonPath p = methods.rawToJson(response);
		String place = p.getString("place_id");
		// System.out.println("Place id : " + place);
		Get(place);
		return response;

	}

	public static String Get(String id) {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().queryParam("place_id", id).queryParam("key", "qaclick123").when()
				.get("/maps/api/place/get/json").then().assertThat().statusCode(200).body("accuracy", equalTo("50"))
				.header("Connection", "Keep-Alive").extract().response().asString();
		JsonPath p = methods.rawToJson(response);
		System.out.println(p.getString("address"));
		Updates(id);
		return response;

	}

	public static String Updates(String id) {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().queryParam("key", "qaclick123").queryParam("place_id", id)
				.header("Content-Type", "application/json")
				.body("{\r\n"
						+ "    \"place_id\": \""+id+"\",\r\n"
						+ "    \"address\": \"70 Deepak winter walk, USA\",\r\n"
						+ "    \"key\": \"qaclick123\"\r\n"
						+ "}")
				.when()
				.put("/maps/api/place/update/json").then().assertThat().statusCode(200).extract().response().asString();
		JsonPath p = methods.rawToJson(response);
		String ma = p.getString("msg");
		System.out.println(ma);
		return response;
		
		
	}

}
