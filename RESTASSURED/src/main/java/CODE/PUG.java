package CODE;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import Body.Body;
import Body.methods;

public class PUG {
	public static void main(String[] args) {
		post();
	}

	public static String post() {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(Body.put())
				.when().post("/maps/api/place/add/json")
				.then().assertThat().statusCode(200)
				.body("scope", equalTo("APP")).header("Connection", "Keep-Alive").extract().response().asString();
		System.out.println(response);
		JsonPath p = methods.rawToJson(response);
		String place = p.getString("place_id");
		//System.out.println("Place id : " + place);
		update(place);
		return response;

	}
	public static String update(String s) {
		RestAssured.baseURI="https://rahulshettyacademy.com";
		//String body=Body.update(s);
		//System.out.println(body);
		String response=given().queryParam("key", "qaclick123").queryParam("place_id", s).header("Content-Type","application/json")
				.body(Body.update(s))
				.when().put("/maps/api/place/update/json")
				.then().assertThat().statusCode(200).body("msg",equalTo("Address successfully updated")).extract().response().asString();
		JsonPath p = methods.rawToJson(response);
				String place = p.getString("msg");
		//		System.out.println("Place id : " + place);
		System.out.println(response);
				get(s);
		return response;
	}
	public static String get(String place) {
		String response=given().queryParam("key", "qaclick123").queryParam("place_id", place).header("Content-Type","application/json")
				.when().get("maps/api/place/get/json")
				.then().assertThat().statusCode(200).body("phone_number",equalTo( "(+91) 111 222 3333"))
				.extract().response().asString();
		System.out.println(response);
		JsonPath p = methods.rawToJson(response);
		String name = p.getString("name");
		String address = p.getString("address");
		String types = p.getString("types");
		String website = p.getString("website");
		String language = p.getString("language");
		System.out.println("name : " + name+", address : "+address+", types : "+types+", website : "+website+", language : "+language);
		Delete(place);
		return response;
	}
	public static String Delete(String place) {
		String response = given().queryParam("key", "qaclick123").header("Content-Type","application/json")
				.body(Body.delete(place))
				.when().delete("/maps/api/place/delete/json")
				.then().assertThat().statusCode(200).body("status",equalTo("OK"))
				.extract().response().asString();
		System.out.println(response);
		JsonPath p = methods.rawToJson(response);
				String s=p.get("status");
				System.out.println(s);
				assertEquals("OK", "OK");
		return response;
	}
}
