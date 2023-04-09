package JIRA;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
public class TestClass {
	
	@Test
	public static void AddTask() {
		RestAssured.baseURI="http://localhost:8080";
		String res=given().headers("Content-Type","application/json").body(Body.task()).when().post("/rest/auth/1/session")
		.then().assertThat().statusCode(200).extract().response().asString();
		
		//System.out.println(res);
		JsonPath js=new JsonPath(res);
		String value=js.getString("session.value");
		System.out.println(value);

	// create a Story
		String res1=given().headers("Content-Type","application/json").header("cookie","JSESSIONID="+value)
				.body(Body.taskBody())
				.when().post("/rest/api/2/issue")
				.then().assertThat().statusCode(201).extract().response().asString();
		System.out.println(res1);
		JsonPath js1=new JsonPath(res1);
		String id=js1.getString("id");
		System.out.println(id);
		
	// Get the story Details
		
		String res2=given().headers("Content-Type","application/json").header("cookie","JSESSIONID="+value)
				.when().get("/rest/api/2/issue/"+id+"")
				.then().log().all().assertThat().statusCode(200).extract().response().asString();
		System.out.println(res2);
		
	}
	
	
}
