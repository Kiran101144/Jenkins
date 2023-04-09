package E2ETesting;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class E2E {
	@Test
	public static void GetToken() {
		RequestSpecification res = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.setContentType(ContentType.JSON).build();
		getTokenSer tok = new getTokenSer();
		tok.setuserEmail("javaselenium095@gmail.com");
		tok.setUserPassword("Saikiran@800");

		RequestSpecification getToken = given().spec(res).body(tok);
		getTokenDser gettoken = getToken.when().post("/api/ecom/auth/login").then().extract().response()
				.as(getTokenDser.class);
		String ID = gettoken.getUserId();
		String token = gettoken.getToken();
		System.out.println(ID);
		System.out.println(token);

		// create account

		RequestSpecification addACCRes = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.addHeader("Authorization", token).build();
		RequestSpecification add = given().spec(addACCRes).param("productName", "qwerty").param("productAddedBy", ID)
				.param("productCategory", "fashion").param("productSubCategory", "shirts")
				.param("productPrice", "12345").param("productDescription", "Addias Originals")
				.param("productFor", "women").multiPart("productImage", new File("E://java-collection-hierarchy.png"));
		String account = add.when().post("/api/ecom/product/add-product").then().statusCode(201).extract().response()
				.asString();

		JsonPath acc = new JsonPath(account);
		String id = acc.get("productId");
		String msg = acc.get("message");
		System.out.println("Product ID " + id);
		System.out.println(msg);

		// create order

		OrderCountry cou = new OrderCountry();
		cou.setProductOrderedId(id);
		cou.setCountry("country");
		List<OrderCountry> ordercountry = new ArrayList<OrderCountry>();
		ordercountry.add(cou);

		OrderAccountser OA = new OrderAccountser();
		OA.setOrders(ordercountry);

		RequestSpecification ress = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.setContentType(ContentType.JSON).addHeader("Authorization", token).build();

		RequestSpecification order = given().spec(ress).body(OA);
		String details = order.when().post("/api/ecom/order/create-order").then().extract().response().asString();
		// JsonPath jp=new JsonPath(details);
		System.out.println(details);
		// System.out.println(jp.get("country"));

		// Delete Product
		RequestSpecification del = given().spec(ress).pathParam("product_ID", id);
		String Del = del.when().delete("/api/ecom/product/delete-product/{product_ID}").then().extract().response()
				.asString();
		System.out.println(Del);
	}
}
