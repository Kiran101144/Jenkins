package POJOADEMO;

import org.testng.Assert;
import org.testng.annotations.Test;

import POJO.Api;
import POJO.WebAutomation;
import POJOA.GetCourse;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPojo {

	@Test
	public void pokoClass() {
		String[] courseTitles = { "Selenium Webdriver Java", "Cypress", "Protractor" };
		String res = given().urlEncodingEnabled(false)
				.queryParam("code", "4%2F0AWtgzh6iLSmxogEVWxyZI7vVmaDF5dc5fxceD-XWds90FAbIszcTunA7vtVWR5WsfHFNhQ")
				.queryParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
				.queryParam("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
				.queryParam("redirect_uri", "https://rahulshettyacademy.com/getCourse.php")
				.queryParam("grant_type", "authorization_code").post("https://www.googleapis.com/oauth2/v4/token")
				.asString();
		// System.out.println(res);
		JsonPath js = new JsonPath(res);
		String accessToken = js.getString("access_token");
		System.out.println(accessToken);
		GetCourse course = given().queryParam("access_token", accessToken).expect().defaultParser(Parser.JSON).when()
				.get("https://rahulshettyacademy.com/getCourse.php").as(GetCourse.class);
		// .then().assertThat().statusCode(200).extract().response().asString();
//		System.out.println(course.getInstructor());
//		System.out.println(course.getExpertise());
//		System.out.println(course.getLinkedIn());
//		System.out.println(course.getServices());
//		System.out.println(course.getUrl());	
		
//		System.out.println(course.getCourses().getApi());
//		System.out.println(course.getCourses().getAPI().getCourseTitle());
		System.out.println(course.getCourses().getApi().get(1).getCourseTitle());
		
		List<Api> apis = course.getCourses().getApi();
		
		for(int i=0;i<apis.size();i++) {
			System.out.println(course.getCourses().getApi().get(i).getCourseTitle());			
		}
		
		ArrayList<String>	a=new ArrayList<String>();
		
		List<WebAutomation> web=course.getCourses().getWebAutomation();
		for(int i=0;i<web.size();i++) {
			a.add(course.getCourses().getWebAutomation().get(i).getCourseTitle());
		}
		List<String> expectedList = Arrays.asList(courseTitles);
		System.out.println(expectedList);
		Assert.assertTrue(a.equals(expectedList));

	}
}
