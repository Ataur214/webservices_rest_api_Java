package APITesting.com.org.api;
import org.testng.annotations.Test;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;
import APITesting.Array.classes.object.arrayobjectclass;
import APITesting.Array.classes.object.firstnodedata;


public class postarraydata {

	//Post array data using class object
	//@Test
	public void test_01() {

		arrayobjectclass arraydata1 = new arrayobjectclass();
		arrayobjectclass arraydata2 = new arrayobjectclass();
		firstnodedata nodedata = new firstnodedata();

		arraydata1.setEmail("arraymail@arraymail.com1");
		arraydata1.setPhone("11111111");
		arraydata1.setAddress("array address1");

		arraydata2.setEmail("arraymail@arraymail.com2");
		arraydata2.setPhone("2222222222");
		arraydata2.setAddress("array address2");

		nodedata.setId("5");
		nodedata.setTitle("This is array title");
		nodedata.setAuthor("test array author");
		nodedata.setarrayobject(new arrayobjectclass[] {arraydata1,arraydata2} );

		Response response = given().
				when().
				contentType(ContentType.JSON).
				body(nodedata).
				post("http://localhost:3000/posts");

		System.out.println("The array response"+response.asString());

	}

	//Get API response time
	@Test
	public void test_02() {

		Response response = given().
				when().
				get("http://localhost:3000/posts");

		long time = response.
				then().
				extract().
				time();
		
		System.out.println("The response time is "+time);

	}

}
