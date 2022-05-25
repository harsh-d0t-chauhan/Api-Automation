package api;

import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import resources.ReusableMethods;
import resources.Specifications;
import resources.validateResponse;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Main {

	@Test
	public  void authorizationCheck() throws Exception {
		
		RequestSpecification req = given().spec(Specifications.request());
		ValidatableResponse res = req.when().get("/api/cl-user/setup-4")
				.then().spec(Specifications.response());
		
		validateResponse.authanticationCheck(res);
				
//		String response = res.extract().asString();
//		JsonPath js = ReusableMethods.rawToJson(response);
//		System.out.println(response);
//		System.out.println(ReusableMethods.getString(js, "feedStaleDelayMs"));
//		System.out.println(ReusableMethods.getArraySize(js,"ReturnReasons"));
		 	
	}
	
	@Test
	public  void nullCheck() throws Exception {		
		RequestSpecification req = given().spec(Specifications.request());
		ValidatableResponse res = req.when().get("/api/cl-user/setup-4")
				.then().spec(Specifications.response());
		
				validateResponse.nullCheck(res);

	
		
	}
	
}
