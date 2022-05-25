package api;

import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;
import resources.ReusableMethods;
import resources.Specifications;
import resources.validateResponse;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Main extends Specifications {
	
	public static ValidatableResponse getValidtableResponse() {
		ValidatableResponse res = given().spec(request())
				.when().get("/api/cl-user/setup-4")
				.then().spec(response());
		return res;

	}
	@Test
	public  void authorizationCheck() throws Exception {
		validateResponse.authanticationCheck(getValidtableResponse());		
	 	
	}
	@Test
	public  void nullCheck() throws Exception {		
				validateResponse.nullCheck(getValidtableResponse());
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




