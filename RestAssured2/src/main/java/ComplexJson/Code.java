package ComplexJson;

import static io.restassured.RestAssured.*;

import java.util.List;

import io.restassured.path.json.JsonPath;

public class Code {
	public static void main(String[] args) {
		one();
		two();
	}

	public static void one() {
		JsonPath js = new JsonPath(JsonFile.Jsons());

		int a = js.getInt("courses.size()");
		System.out.println(a);

		for (int i = 0; i < a; i++) {
			String s = js.getString("courses[" + i + "].title");
			if (s.equalsIgnoreCase("rpa")) {
				int count = js.getInt("courses[" + i + "].copies");
				System.out.println(count);
			}
			// System.out.println(s);
		}
	}

	public static void two() {

		String res = given().when().get("https://api.coincap.io/v2/assets").then().assertThat().statusCode(200)
				.extract().response().asString();
		JsonPath js = new JsonPath(res);
		// String s=js.getString("localName");
		int s1 = js.getInt("data.size()");
		for (int i = 0; i < s1; i++) {
			String s = js.getString("data[" + i + "].id");
			if (s.equalsIgnoreCase("dogecoin")) {
				String rank = js.getString("data[" + i + "].rank");
				System.out.println(" Rank of dogecoin = " + rank);
			}
			// System.out.println("All IDS ="+ s);
		}

	}
}
