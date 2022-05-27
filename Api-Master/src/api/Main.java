package api;

import io.restassured.response.ValidatableResponse;
import resources.Payload;
import resources.Specifications;
import resources.ValidateResponse;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.io.FileNotFoundException;

public class Main extends Specifications{
	String null_Check_Cl_Address_Response;
	String null_Check_view_Cart_Cms_Response;
	String null_Check_Get_Coupons_Response;
	String null_Check_Order_State_Response;
	String null_Check_Get_City_From_Pincode_Response;
	String null_Check_Checkout_Response;
	String null_Check_Order_Details_Response;
	String null_Check_Order_Details;
	String response_Check_Set_One_Single_User_Id_Response;
	String response_Check_Add_Impression_Response;
	String response_Check_Checkout_Response;
	
	
	
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
	@Test(priority = 1)
	public void null_Check_view_Cart_Cms() throws FileNotFoundException {
		null_Check_view_Cart_Cms_Response = ValidateResponse.nullCheckViewCartCms(getViewCartCms());
	}
	@Test(priority = 2)
	public void null_Check_Get_Coupons() throws FileNotFoundException {
		null_Check_Get_Coupons_Response = ValidateResponse.nullCheckCoupons(getCoupons());
	}
	@Test(priority = 3)
	public void null_Check_Order_State() throws FileNotFoundException {
		null_Check_Order_State_Response = ValidateResponse.nullCheckOrderState(getOrderState());
	}
	@Test(priority = 4)
	public void null_Check_Get_City_From_Pincode() throws FileNotFoundException {
		null_Check_Get_City_From_Pincode_Response = ValidateResponse.nullCheckPincode(getCityFromPinCode());
	}
	
	
	@Test(priority = 5)
	public void null_Check_Checkout() throws FileNotFoundException {
		null_Check_Checkout_Response = ValidateResponse.nullCheckCheckout(getCheckOut());
	}
	@Test(priority = 6)
	public void null_Check_Order_Details() throws FileNotFoundException {
		null_Check_Order_Details_Response = ValidateResponse.nullCheckOrderDetails(getOrderDetails());
		
	}
	@Test(priority = 7)
	public void response_Check_Set_One_Single_User_Id() throws FileNotFoundException {
		response_Check_Set_One_Single_User_Id_Response =ValidateResponse.responseCheckSetOneSingleUserId(getSetOneSingleUserId());
	}
	@Test(priority = 8)
	public void response_Check_Add_Impression() throws Exception {
		response_Check_Add_Impression_Response = ValidateResponse.responseCheckAddImpression(getAddImpression());
		

	}
	@Test(priority = 9)
	public void response_Check_Checkout() throws FileNotFoundException {
		response_Check_Checkout_Response = ValidateResponse.responseCheckout(getCheckOut());
		
	}
	
	
	
	@Test(priority = 100)
	public void print() throws FileNotFoundException {
		
		System.out.println("null_Check_Cl_Address_Response:\n\n"+null_Check_Cl_Address_Response+
				"\n---------------------------------------------------------------------------------");
		System.out.println("null_Check_view_Cart_Cms_Response:\n\n"+null_Check_view_Cart_Cms_Response+
				"\n---------------------------------------------------------------------------------");
		System.out.println("null_Check_Get_Coupons_Response:\n\n"+null_Check_Get_Coupons_Response+
				"\n---------------------------------------------------------------------------------");
		System.out.println("null_Check_Order_State_Response:\n\n"+null_Check_Order_State_Response+
				"\n---------------------------------------------------------------------------------");
		System.out.println("null_Check_Get_City_From_Pincode_Response:\n\n"+null_Check_Get_City_From_Pincode_Response+
				"\n---------------------------------------------------------------------------------");
		System.out.println("null_Check_Checkout_Response:\n\n"+null_Check_Checkout_Response+
				"\n---------------------------------------------------------------------------------");
		System.out.println("null_Check_Order_Details_Response:\n\n"+null_Check_Order_Details_Response+
				"\n---------------------------------------------------------------------------------");
		System.out.println("response_Check_Set_One_Single_User_Id_Response:\n\n"+response_Check_Set_One_Single_User_Id_Response+
				"\n---------------------------------------------------------------------------------");
		System.out.println("response_Check_Add_Impression_Response:\n\n"+response_Check_Add_Impression_Response+
				"\n---------------------------------------------------------------------------------");
		System.out.println("response_Check_Checkout_Response:\n\n"+response_Check_Checkout_Response+
				"\n---------------------------------------------------------------------------------");
						
	}
	
	
	

	

	
	
}




