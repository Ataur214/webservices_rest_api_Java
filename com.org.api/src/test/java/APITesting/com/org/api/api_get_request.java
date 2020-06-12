package APITesting.com.org.api;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;


public class api_get_request {

	@Test
	public void test_01() {

		Response response = when().
				get("https://api.openweathermap.org/data/2.5/weather?q=London&callback=test&appid=884cb1eca4f082d98b840b41466538bc");
		System.out.println("The status code is "+response.getStatusCode());
		assertEquals(response.getStatusCode(), 200);
	}

	//Test the api with negative test
	@Test
	public void test_02() {

		Response response = when().
				get("https://api.openweathermap.org/data/2.5/weather?q=London&callback=test&appid=884cb1eca4f082d98b840b41466538b");
		System.out.println("The status code is "+response.getStatusCode());
		assertEquals(response.getStatusCode(), 401);
	}

	//Use the param with rest assured
	@Test
	public void test_03() {

		Response response = given().
				param("q", "London").
				param("appid", "884cb1eca4f082d98b840b41466538bc").
				when().
				get("https://api.openweathermap.org/data/2.5/weather");
		System.out.println("The status code is "+response.getStatusCode());
		assertEquals(response.getStatusCode(), 200);

		if(response.getStatusCode()==200) {
			System.out.println("The Api is Working fine");
		}else {
			System.out.println("Api is failed");
		}
	}

	//Assert Testcse is rest assured API
	@Test
	public void test_04() {

		given().
		param("q", "London").
		param("appid", "884cb1eca4f082d98b840b41466538bc").
		when().
		get("https://api.openweathermap.org/data/2.5/weather").
		then().assertThat().statusCode(200);

	}
	
	//Check the response data as json
	@Test
	public void test_05() {

		Response response = when().
				get("https://api.openweathermap.org/data/2.5/weather?q=London&callback=test&appid=884cb1eca4f082d98b840b41466538bc");
		
		System.out.println("The response data as json "+response.asString());
		
	}


}





