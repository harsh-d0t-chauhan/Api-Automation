package api;

import io.restassured.path.json.JsonPath;
import resources.ReusableMethods;
import resources.Specifications;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Main {
	@Test
	public static void test() {
		
		
		String response = given().spec(Specifications.request())
		.when().get("/api/cl-user/setup-4")
		.then().spec(Specifications.nullResponseCheck())
		.extract().response().asString();
		
		
		
		//JsonPath js = ReusableMethods.rawToJson(response);
		System.out.println(response);
		
		
		
		

	}
	
	
}
