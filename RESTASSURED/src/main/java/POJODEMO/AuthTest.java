package POJODEMO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import POJO.Api;
import POJO.GetCourse;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;

public class AuthTest {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String[] courseTitles = { "Selenium Webdriver Java", "Cypress", "Protractor" };
//		System.setProperty("webdriver.gecko.driver",
//				"E://JAVA Files Dont delete//Drivers//geckodriver-v0.30.0-win64//geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get(
//				"https://accounts.google.com/o/oauth2/v2/auth?scope=https://www.googleapis.com/auth/userinfo.email&auth_url=https://accounts.google.com/o/oauth2/v2/auth&client_id=692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com&response_type=code&redirect_uri=https://rahulshettyacademy.com/getCourse.php&state=verifyfjdss");
//		driver.findElement(By.cssSelector("[type='email']")).sendKeys("javaselenium095@gmail.com");
//		driver.findElement(By.cssSelector("[type='email']")).sendKeys(Keys.ENTER);
//		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("[type='password']")).sendKeys("Dee@9963");
//		driver.findElement(By.cssSelector("[type='password']")).sendKeys(Keys.ENTER);
//		Thread.sleep(5000);
//		String url = driver.getCurrentUrl();
//		String partialcode = url.split("code=")[1];
//		String code = partialcode.split("&scope")[0];
//		System.out.println(code);

		// tagname[attribute='value']

		String accessTokenResponse = given().urlEncodingEnabled(false).queryParams("code", "4%2F0AWtgzh4GazH9kxe6tnmU-sdD1lIyd4NmG2bQnM_5ne3AqL32z1HxrD-5hCzP_fRHQm2yOA")
				.queryParams("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
				.queryParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
				.queryParams("redirect_uri", "https://rahulshettyacademy.com/getCourse.php")
				.queryParams("grant_type", "authorization_code").when().log().all()
				.post("https://www.googleapis.com/oauth2/v4/token").asString();
		JsonPath js = new JsonPath(accessTokenResponse);
		String accessToken = js.getString("access_token");
//		System.out.println(accessToken);
		GetCourse gc = given().queryParam("access_token", accessToken).expect().defaultParser(Parser.JSON).when()
				.get("https://rahulshettyacademy.com/getCourse.php").as(GetCourse.class);

//		System.out.println(gc.getLinkedIn());
//		System.out.println(gc.getInstructor());
		System.out.println(gc.getCourses().getApi().get(1).getCourseTitle());

//		List<Api> apiCourses = gc.getCourses().getApi();
//		for (int i = 0; i < apiCourses.size(); i++) {
//			if (apiCourses.get(i).getCourseTitle().equalsIgnoreCase("SoapUI Webservices testing")) {
//				System.out.println(apiCourses.get(i).getPrice());
//			}
//		}
//
		// Get the course names of WebAutomation
		ArrayList<String> a = new ArrayList<String>();

		List<POJO.WebAutomation> w = gc.getCourses().getWebAutomation();

		for (int j = 0; j < w.size(); j++) {
			a.add(w.get(j).getCourseTitle());
		}

		List<String> expectedList = Arrays.asList(courseTitles);

		Assert.assertTrue(a.equals(expectedList));

		// System.out.println(response);

	}
}
