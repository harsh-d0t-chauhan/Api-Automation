package api;

import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;
import resources.ReusableMethods;
import resources.Specifications;
import resources.ValidateResponse;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.io.FileNotFoundException;

public class Main extends Specifications{
	String cl_Address_Response;
	
	public static ValidatableResponse getSetup4() throws FileNotFoundException {
		ValidatableResponse res = given().spec(request())
				.when().get("/api/cl-user/setup-4")
				.then().spec(response());
		return res;

	}
	public static ValidatableResponse getClUserAddress() throws FileNotFoundException {
		ValidatableResponse res = given().spec(request())
				.when().get("/api/cl-user/profile/address")
				.then().spec(response());
		return res;

	}
	public static ValidatableResponse getViewCartCms() throws FileNotFoundException {
		ValidatableResponse res = given().spec(request())
				.when().get("/api/cl-user/view-cart-cms")
				.then().spec(response());
		return res;
	}
	public static ValidatableResponse getCoupons() throws FileNotFoundException {
		ValidatableResponse res = given().spec(request())
				.when().get("/api/cl-user/get-coupons")
				.then().spec(response());
		return res;
	}
	
	public static ValidatableResponse getOrderState() throws FileNotFoundException {
		ValidatableResponse res = given().spec(request()).queryParam("order_id","%2011165844")
				.when().get("/api/cl-user/v3/order-states")
				.then().spec(response());
		return res;
	}
	public static ValidatableResponse getCityFromPinCode() throws FileNotFoundException {
		ValidatableResponse res = given().spec(request())
				.when().get("/api/cl-user/get-city-from-pincode/122012")
				.then().spec(response());
		return res;
	}
	public static ValidatableResponse getCheckOut() throws FileNotFoundException {
		ValidatableResponse res = given().spec(request())
				.when().get("/api/cl-user/v2/checkout")
				.then().spec(response());
		return res;
	}
	public static ValidatableResponse getOrderDetails() throws FileNotFoundException {
		ValidatableResponse res = given().spec(request())
				.when().get("/api/cl-user/order-details-2/11165844")
				.then().spec(response());
		return res;
	}


	@Test
	public  void authorization_Check() throws Exception {
		ValidateResponse.authanticationCheck(getSetup4());		
	 	
	}
	@Test
	public  void null_Check_Setup4() throws Exception {		
				ValidateResponse.nullCheckSetup4(getSetup4());
	}
	
	@Test
	public void null_Check_Cl_Address() throws FileNotFoundException {
		cl_Address_Response = ValidateResponse.nullCheckClAddress(getClUserAddress());
		//System.out.println(cl_Address_Response);
	
	}
	@Test
	public void null_Check_view_Cart_Cms() throws FileNotFoundException {
		ValidateResponse.nullCheckViewCartCms(getViewCartCms());
	}
	
	
	
	
	public void test() throws FileNotFoundException {
		ValidatableResponse res = Main.getSetup4();
		String response = res.extract().asString();
		JsonPath js = ReusableMethods.rawToJson(response);
		System.out.println(response);
		System.out.println(ReusableMethods.getString(js, "feedStaleDelayMs"));
		System.out.println(ReusableMethods.getArraySize(js,"ReturnReasons"));
	}
	
	
	

	

	
	
}




