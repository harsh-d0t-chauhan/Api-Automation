package api;

import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import resources.Specifications;
import resources.validateResponse;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Main {
	@Test
	public static void test() {
		
		
		RequestSpecification req = given().spec(Specifications.request());
		ValidatableResponse res = req.when().get("/api/cl-user/setup-4")
				.then().spec(Specifications.response());
		validateResponse.nullCheck(res);
		
				
				
		
		

	}
	
	
}
