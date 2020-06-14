package APITesting.com.org.api;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;

public class json_server_api_request {
	
	public void test_01() {
		
		Response response = given().
		when().
		get("http://localhost:3000/posts");
		
		System.out.println("The server response is "+ response.toString() );
	}

}
