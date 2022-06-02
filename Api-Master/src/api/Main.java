package api;

import io.restassured.response.Response;
import resources.Payload;
import resources.ReusableMethods;
import resources.Specifications;
import resources.Url;
import resources.ValidateResponse;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;



public class Main extends Specifications{
	ArrayList<String> null_Check_Cl_Address_Response = new ArrayList<String>();
	ArrayList<String> null_Check_view_Cart_Cms_Response = new ArrayList<String>();
	ArrayList<String> null_Check_Get_Coupons_Response = new ArrayList<String>();
	ArrayList<String> null_Check_Order_State_Response = new ArrayList<String>();
	ArrayList<String> null_Check_Get_City_From_Pincode_Response = new ArrayList<String>();
	ArrayList<String> null_Check_Checkout_Response = new ArrayList<String>();
	ArrayList<String> null_Check_Order_Details_Response = new ArrayList<String>();
	ArrayList<String> null_Check_Order_Details= new ArrayList<String>();
	ArrayList<String> response_Check_Set_One_Single_User_Id_Response = new ArrayList<String>();
	ArrayList<String> response_Check_Add_Impression_Response = new ArrayList<String>();
	ArrayList<String> response_Check_Checkout_Response = new ArrayList<String>();
	
	
	
	public static Response getSetup4(String endpoint) throws FileNotFoundException {
		Response res = given().spec(request())
				.when().get(endpoint);
		return res;

	}
	public static Response getOneSingleUserId(String endpoint) throws FileNotFoundException {
		Response res = given().spec(request()).body(Payload.set_One_Single_User_Id_Payload())
				.when().post(endpoint);
		return res;

	}
	public static Response getAddImpression(String endpoint) throws FileNotFoundException {
		Response res = given().spec(request()).body(Payload.add_Impression_Payload())
				.when().post(endpoint);
		return res;

	}

	
	public static  Response getClUserAddress(String endpoint) throws FileNotFoundException {
			Response res =	given().spec(request())
					.when().get(endpoint);
					return res;
	}
	public static Response getViewCartCms(String endpoint) throws FileNotFoundException {
		Response res = given().spec(request())
				.when().get(endpoint);
		return res;
	}
	public static Response getCoupons(String endpoint) throws FileNotFoundException {
		Response res = given().spec(request())
				.when().get(endpoint);
		return res;
	}
	
	public static Response getOrderState(String endpoint) throws FileNotFoundException {

		Response res = given().urlEncodingEnabled(false).spec(request()).queryParam("order_id","011165844")
				.when().get(endpoint);
		return res;
	}
	public static Response getCityFromPinCode(String endpoint) throws FileNotFoundException {
		Response res = given().spec(request())
				.when().get(endpoint);
		return res;
	}
	public static Response getCheckOut(String endpoint) throws FileNotFoundException {
		Response res = given().spec(request())
				.when().get(endpoint);
		return res;
	}
	public static Response getOrderDetails(String endpoint) throws FileNotFoundException {
		Response res = given().spec(request())
				.when().get(endpoint);
		return res;
	}


	@Test(priority = 0,dataProvider = "Setup4",dataProviderClass = Url.class)
	public  void authorization_Check(String endpoint,int expectedStatusCode) throws Exception {
		ValidateResponse.authanticationCheck(getSetup4(endpoint),expectedStatusCode);		
	 	
	}
	@Test(priority = 1,dataProvider = "Setup4",dataProviderClass = Url.class)
	public  void null_Check_Setup4(String endpoint,int expectedStatusCode) throws Exception {		
				ValidateResponse.nullCheckSetup4(getSetup4(endpoint),expectedStatusCode);
				
	}
	
	@Test(priority = 2,dataProvider = "address",dataProviderClass = Url.class)
	public void null_Check_Cl_Address(String endpoint,int expectedStatusCode) throws FileNotFoundException {
			null_Check_Cl_Address_Response.add( ValidateResponse.nullCheckClAddress(getClUserAddress(endpoint),expectedStatusCode));
		
	
	}
	@Test(priority = 3,dataProvider = "ViewCartCms",dataProviderClass = Url.class)
	public void null_Check_view_Cart_Cms(String endpoint,int expectedStatusCode) throws FileNotFoundException {
		null_Check_view_Cart_Cms_Response.add( ValidateResponse.nullCheckViewCartCms(getViewCartCms(endpoint),expectedStatusCode));
	}
	@Test(priority = 4,dataProvider = "Coupons",dataProviderClass = Url.class)
	public void null_Check_Get_Coupons(String endpoint,int expectedStatusCode) throws FileNotFoundException {
		null_Check_Get_Coupons_Response.add(ValidateResponse.nullCheckCoupons(getCoupons(endpoint),expectedStatusCode));
	}
	@Test(priority = 5,dataProvider = "OrderState",dataProviderClass = Url.class)
	public void null_Check_Order_State(String endpoint,int expectedStatusCode) throws FileNotFoundException {
		null_Check_Order_State_Response.add(ValidateResponse.nullCheckOrderState(getOrderState(endpoint),expectedStatusCode));
	}
	@Test(priority = 6,dataProvider = "CityFromPinCode",dataProviderClass = Url.class)
	public void null_Check_Get_City_From_Pincode(String endpoint,int expectedStatusCode) throws FileNotFoundException {
		null_Check_Get_City_From_Pincode_Response.add(ValidateResponse.nullCheckPincode(getCityFromPinCode(endpoint),expectedStatusCode));
	}
	
	@Test(priority = 7,dataProvider = "CheckOut",dataProviderClass = Url.class)
	public void null_Check_Checkout(String endpoint,int expectedStatusCode) throws FileNotFoundException {
		null_Check_Checkout_Response.add(ValidateResponse.nullCheckCheckout(getCheckOut(endpoint),expectedStatusCode));
	}
	@Test(priority = 8,dataProvider = "OrderDetails",dataProviderClass = Url.class)
	public void null_Check_Order_Details(String endpoint,int expectedStatusCode) throws FileNotFoundException {
		null_Check_Order_Details_Response.add(ValidateResponse.nullCheckOrderDetails(getOrderDetails(endpoint),expectedStatusCode));
		
	}
	@Test(priority = 9,dataProvider = "OneSingleUserId",dataProviderClass = Url.class)
	public void response_Check_Set_One_Single_User_Id(String endpoint,int expectedStatusCode) throws FileNotFoundException {
		response_Check_Set_One_Single_User_Id_Response.add(ValidateResponse.responseCheckSetOneSingleUserId(getOneSingleUserId(endpoint),expectedStatusCode));
	}
	@Test(priority = 10,dataProvider = "addImpression",dataProviderClass = Url.class)
	public void response_Check_Add_Impression(String endpoint,int expectedStatusCode) throws Exception {
		response_Check_Add_Impression_Response.add(ValidateResponse.responseCheckAddImpression(getAddImpression(endpoint),expectedStatusCode));
		

	}

	
	
	
	@Test(priority = 100)
	public void print() throws FileNotFoundException {	
		HashMap<String,ArrayList<String>> map=new HashMap<String,ArrayList<String>>(){{
			put("null_Check_Cl_Address_Response", null_Check_Cl_Address_Response);
			put("null_Check_view_Cart_Cms_Response",null_Check_view_Cart_Cms_Response);
			put("null_Check_Get_Coupons_Response",null_Check_Get_Coupons_Response);
			put("null_Check_Order_State_Response",null_Check_Order_State_Response);
			put("null_Check_Get_City_From_Pincode_Response",null_Check_Get_City_From_Pincode_Response);
			put("null_Check_Checkout_Response",null_Check_Checkout_Response);
			put("null_Check_Order_Details_Response",null_Check_Order_Details_Response);
			put("response_Check_Set_One_Single_User_Id_Response",response_Check_Set_One_Single_User_Id_Response);
			put("response_Check_Add_Impression_Response",response_Check_Add_Impression_Response);
						
		}}; 
		ReusableMethods.printResponse(map);
		
						
	}
	
	
	

	

	
	
}




