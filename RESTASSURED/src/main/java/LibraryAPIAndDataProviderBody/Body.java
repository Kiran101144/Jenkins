package LibraryAPIAndDataProviderBody;

public class Body {
public static String post(String isbn, String aisle) {
	String save="{\r\n"
			+ "\"name\":\"Learn Appium Automation with Java\",\r\n"
			+ "\"isbn\":\""+isbn+"\",\r\n"
			+ "\"aisle\":\""+aisle+"\",\r\n"
			+ "\"author\":\"John foer\"\r\n"
			+ "}";
	return save;
}
public static String delete(String id) {
	String ID="{\r\n"
			+ "    \"ID\": \""+id+"\"\r\n"
			+ "}";
	return ID;
}
}
