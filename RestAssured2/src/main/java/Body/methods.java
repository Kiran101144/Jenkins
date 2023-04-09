package Body;

import io.restassured.path.json.JsonPath;

public class methods {

	public static JsonPath rawToJson(String response) {
		JsonPath p = new JsonPath(response);
		return p;
	}
}
