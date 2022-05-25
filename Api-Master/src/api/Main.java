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
	
	public static ValidatableResponse getValidtableResponse() {
		RequestSpecification req = given().spec(Specifications.request());
		ValidatableResponse res = req.when().get("/api/cl-user/setup-4")
				.then().spec(Specifications.response());
		return res;

	}
	@Test
	public  void authorizationCheck() throws Exception {
		validateResponse.authanticationCheck(Main.getValidtableResponse());		
	 	
	}
	@Test
	public  void nullCheck() throws Exception {		
				validateResponse.nullCheck(Main.getValidtableResponse());
	}
	
	
	
	public void test() {
		ValidatableResponse res = Main.getValidtableResponse();
		String response = res.extract().asString();
		JsonPath js = ReusableMethods.rawToJson(response);
		System.out.println(response);
		System.out.println(ReusableMethods.getString(js, "feedStaleDelayMs"));
		System.out.println(ReusableMethods.getArraySize(js,"ReturnReasons"));
	}
	
}




