package APITesting.com.org.api;
import org.testng.annotations.Test;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import APITesting.Classes.Object.postobject;
import static com.jayway.restassured.RestAssured.*;
public class jsonserverapirequest {

	//Json server get request
	//@Test
	public void test_01() {

		Response response = given().
				when().
				get("http://localhost:3000/posts");

		System.out.println("The server response is "+ response.asString() );
	}

	//Json server Post request
	//@Test
	public void test_02() {

		Response response = given().
				body("{ \"id\":\"10\","+ "\"title\":\"json-server_post_test\", "+ "\"author\":\"Ataure\" }").
				when().
				contentType(ContentType.JSON).
				post("http://localhost:3000/posts");

		System.out.println("The server response is "+ response.asString() );
	}

	//Json server request with class object body data
	@Test
	public void test_03() {

		postobject jsonobjectdata = new postobject();

		jsonobjectdata.setID("05");
		jsonobjectdata.settitle("Mr");
		jsonobjectdata.setfirst_name("Rahaman");
		jsonobjectdata.setauthor("Ata");

		Response response = given().
				body(jsonobjectdata).
				when().
				contentType(ContentType.JSON).
				post("http://localhost:3000/posts");

		System.out.println("The post data response "+response.asString() );

	}

}
