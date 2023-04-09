package LibraryAPIAndDataProvider;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import LibraryAPIAndDataProviderBody.Body;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class Code {

	@Test(dataProvider="BooksData")
	public static void test(String isbn, String aisel) {
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String resource = given().header("Content-Type","application/json").body(Body.post(isbn, aisel))
						.when().post("/Library/Addbook.php")
						.then().statusCode(200).extract().response().asString();
		System.out.println(resource);
		JsonPath p= new JsonPath(resource);
		String id=p.getString("ID");
		delete(id);
	}
	
	public static void delete(String id) {
		RestAssured.baseURI="https://rahulshettyacademy.com";
		String resource=given().header("Content-Type","application/json").body(Body.delete(id)).
				when().post("/Library/DeleteBook.php").
				then().statusCode(200).extract().response().asString();
		System.out.println(resource);
	}
	
	@DataProvider(name = "BooksData")
	public Object[][] getData() {
		
		return new Object[][] {{"def","123"},
								{"muf","456"},
								{"cough","789"},
								{"jav","098"},
								{"mav","675"}};
	}
}
