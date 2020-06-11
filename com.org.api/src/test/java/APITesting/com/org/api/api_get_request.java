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
	
	@Test
	public void test_02() {
		
		Response response = when().
		get("https://api.openweathermap.org/data/2.5/weather?q=London&callback=test&appid=884cb1eca4f082d98b840b41466538b");
		System.out.println("The status code is "+response.getStatusCode());
		assertEquals(response.getStatusCode(), 401);
	}
}
