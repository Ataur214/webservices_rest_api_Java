package APITesting.com.org.api;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import APITesting.Classes.Object.postobject;

import static com.jayway.restassured.RestAssured.*;

public class putdeletepatchrequest {
	
	// update the data with put request
	//@Test
	public void test_01() {
		postobject jsonobjectdata = new postobject();
		
		jsonobjectdata.setID("5");
		jsonobjectdata.settitle("updated Mr");
		jsonobjectdata.setfirst_name("updated Rahaman");
		jsonobjectdata.setauthor("updated Ata");
		
		Response reponse = given().
		body(jsonobjectdata).
		when().
		contentType(ContentType.JSON).
		put("http://localhost:3000/posts/05");
		
		System.out.println("updated response data "+ reponse.asString());			
	}
	
	
	
	// update the data with PATCH request
	//@Test
	public void test_02() {

		Response reponse = given().
		body("{\"first_name\": \"updated by PATCH Rahaman\"}").
		when().
		contentType(ContentType.JSON).
		patch("http://localhost:3000/posts/05");
		
		System.out.println("updated response data "+ reponse.asString());			
	}
	
	// DELETE the data with delete request
	@Test
	public void test_03() {

		Response reponse = given().
		when().
		delete("http://localhost:3000/posts/_3cYk0W");
		
		System.out.println("updated response data "+ reponse.asString());			
	}

}
