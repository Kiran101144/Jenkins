package LibraryAPIAndDataProvider;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class CodeDataFormLocalSystem {
	@Test()
	public static void test() throws IOException {
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String resource = given().header("Content-Type","application/json").body(new String(Files.readAllBytes(Paths.get("E://jenkins//JSONBody//PostDataDriven.json"))))
						.when().post("/Library/Addbook.php")
						.then().statusCode(200).extract().response().asString();
		System.out.println(resource);

	}
	

}
