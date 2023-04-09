package JIRA;

public class Body {

	public static String task() {
		return "{\"username\":\"kiran10114444\",\"password\":\"Saikiran@800\"}";
	}
	
	public static String taskBody() {
		return "{\r\n"
				+ "    \"fields\": \r\n"
				+ "        {\r\n"
				+ "            \"project\": {\r\n"
				+ "                \"key\": \"TES\"\r\n"
				+ "            },\r\n"
				+ "            \"summary\": \"new issue\",\r\n"
				+ "            \"issuetype\": {\r\n"
				+ "                \"name\": \"Bug\"\r\n"
				+ "            },\r\n"
				+ "            \"assignee\": {\r\n"
				+ "                \"name\": \"Tester123\"\r\n"
				+ "            },\r\n"
				+ "            \"reporter\": {\r\n"
				+ "                \"name\": \"kiran10114444\"\r\n"
				+ "            },\r\n"
				+ "            \"description\": \"new issue\"\r\n"
				+ "        }\r\n"
				+ "}";
	}
	
}
