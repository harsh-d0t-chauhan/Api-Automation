package api;

import io.restassured.response.ValidatableResponse;
import resources.Payload;
import resources.ReusableMethods;
import resources.Specifications;
import resources.ValidateResponse;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.io.FileNotFoundException;

public class Main extends Specifications{
	String null_Check_Cl_Address_Response;
	
	public static ValidatableResponse getSetup4() throws FileNotFoundException {
		ValidatableResponse res = given().spec(request())
				.when().get("/api/cl-user/setup-4")
				.then().spec(response());
		return res;

	}
	public static ValidatableResponse getSetOneSingleUserId() throws FileNotFoundException {
		ValidatableResponse res = given().spec(request()).body(Payload.set_One_Single_User_Id_Payload())
				.when().post("/api/cl-user/set-one-signal-user-id")
				.then().spec(response());
		return res;

	}
	public static ValidatableResponse getAddImpression() throws FileNotFoundException {
		ValidatableResponse res = given().spec(request()).body(Payload.add_Impression_Payload())
				.when().post("/api/analytics/add-impression/14312083")
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
		//String order_id = "%2011165844";
		ValidatableResponse res = given().urlEncodingEnabled(false).spec(request()).queryParam("order_id","011165844")
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
	
	@Test(priority = 0)
	public void null_Check_Cl_Address() throws FileNotFoundException {
		null_Check_Cl_Address_Response = ValidateResponse.nullCheckClAddress(getClUserAddress());
		
	
	}
	@Test
	public void null_Check_view_Cart_Cms() throws FileNotFoundException {
		ValidateResponse.nullCheckViewCartCms(getViewCartCms());
	}
	@Test 
	public void null_Check_Get_Coupons() throws FileNotFoundException {
		ValidateResponse.nullCheckCoupons(getCoupons());
	}
	@Test
	public void null_Check_Order_State() throws FileNotFoundException {
		ValidateResponse.nullCheckOrderState(getOrderState());
	}
	@Test
	public void null_Check_Get_City_From_Pincode() throws FileNotFoundException {
		ValidateResponse.nullCheckPincode(getCityFromPinCode());
	}
	
	
	@Test
	public void null_Check_Checkout() throws FileNotFoundException {
		ValidateResponse.nullCheckCheckout(getCheckOut());
	}
	@Test
	public void null_Check_Order_Details() throws FileNotFoundException {
		ValidateResponse.nullCheckOrderDetails(getOrderDetails());
		
	}
	@Test
	public void response_Check_Set_One_Single_User_Id() throws FileNotFoundException {
		ValidateResponse.responseCheckSetOneSingleUserId(getSetOneSingleUserId());
	}
	@Test(priority = 2)
	public void response_Check_Add_Impression() throws FileNotFoundException {
		ValidateResponse.responseCheckAddImpression(getAddImpression());
		

	}
	@Test
	public void response_Check_Checkout() throws FileNotFoundException {
		ValidateResponse.responseCheckout(getCheckOut());
		
	}
	
	
	public void print() throws FileNotFoundException {
		
		String response = getSetup4().extract().asString();
		System.out.println(response);
		System.out.println(ReusableMethods.getString(getSetup4(), "feedStaleDelayMs"));
		System.out.println(ReusableMethods.getArraySize(getSetup4(),"ReturnReasons"));
	}
	
	
	

	

	
	
}




