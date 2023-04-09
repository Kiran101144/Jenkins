package Body;

public class Body {
public static String put(){
	return "{\r\n"
			+ "  \"location\": {\r\n"
			+ "    \"lat\": -38.383494,\r\n"
			+ "    \"lng\": 33.427362\r\n"
			+ "  },\r\n"
			+ "  \"accuracy\": 50,\r\n"
			+ "  \"name\": \"Frontline house2 India\",\r\n"
			+ "  \"phone_number\": \"(+91) 111 222 3333\",\r\n"
			+ "  \"address\": \"29, side Yooo, cohen 09\",\r\n"
			+ "  \"types\": [\r\n"
			+ "    \"shoe park\",\r\n"
			+ "    \"shop\"\r\n"
			+ "  ],\r\n"
			+ "  \"website\": \"http://google.com\",\r\n"
			+ "  \"language\": \"French-IN\"\r\n"
			+ "}";
}

public static String update(String str) {
	String s=str;
	String json="{\r\n"
			+ "\"place_id\":\""+s+"\",\r\n"
			+ "\"address\":\"70 Kiran walk, USA\",\r\n"
			+ "\"key\":\"qaclick123\"\r\n"
			+ "}";
	//System.out.println(json);
	return json;
}
public static String delete(String str) {
	String del="{\r\n"
			+ "    \"place_id\":\""+str+"\"\r\n"
			+ "}";
	return del;
	
}
}
