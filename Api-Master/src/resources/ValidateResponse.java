package resources;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;

public class ValidateResponse extends ReusableMethods {

	public static void nullCheckSetup4(ValidatableResponse res) {
		
		res.body("appSettings", not(equalTo(null)),
		"cancellationReasons", not(equalTo(null)),
		"ReturnReasons", not(equalTo(null)),
		"ReplaceReasons", not(equalTo(null)),
		"feedStaleDelayMs", not(equalTo(null)),
		"juspayPrefetchData", not(equalTo(null)),
		"movData", not(equalTo(null)),
		"homePage", not(equalTo(null)),
		"supportPhoneNumber", not(equalTo(null)),
		"categoryList", not(equalTo(null)),
		"viewCartLight", not(equalTo(null)),
		"oosSkus", not(equalTo(null)),
		"version", not(equalTo(null)),
		"whatsAppMsg", not(equalTo(null)),
		"juspayInitiateData", not(equalTo(null)),
		"impressionsEnabled", not(equalTo(null)),
		"impressionsConfig", not(equalTo(null)),
		"meResponse", not(equalTo(null)),
		"searchSuggestionEnable", not(equalTo(null)),
		"cxWalkthroughUI", not(equalTo(null)),
		"currentSystemTime", not(equalTo(null)),
		"newProductsByCategoryEnabled", not(equalTo(null)));				
				
	}
	public static String nullCheckClAddress(ValidatableResponse res) {
	
				res.assertThat().body("city", not(equalTo(null)),
				"state",not(equalTo(null)),
				"pincode", not(equalTo(null)),
				 "is_serviceable",not(equalTo(null)));
				String [] str = {"city","state","pincode","is_serviceable"};
		return genrateResponse(res,str);
		 
	}
	public static String nullCheckViewCartCms(ValidatableResponse res) {
		res.assertThat().body("cartPage", not(equalTo(null)),
				"oosPage",not(equalTo(null)));
		String [] str = {"cartPage","oosPage"};
		return genrateResponse(res,str);
	}
	public static String nullCheckCoupons(ValidatableResponse res) {
		res.body("coupons", not(equalTo(null)));
		String [] str = {"coupons"};
		return genrateResponse(res, str);
	}
	public static String nullCheckOrderState(ValidatableResponse res) {
		res.body("order_state_details", not(equalTo(null)));
		String [] str = {"order_state_details"};
		return genrateResponse(res, str);

	}
	public static String nullCheckPincode(ValidatableResponse res) {
		res.body("city", not(equalTo(null)));
		String [] str = {"city"};
		return genrateResponse(res, str);
	}
	public static String nullCheckCheckout(ValidatableResponse res) {
		res.assertThat().body("checkoutPage",not(equalTo(null)));
		String [] str = {"checkoutPage"};
		return genrateResponse(res, str);
	}
	public static String nullCheckOrderDetails(ValidatableResponse res) {
		res.assertThat().body("order_id",not(equalTo(null)));
		String [] str = {"order_id"};
		return genrateResponse(res, str);

	}
	public static String responseCheckSetOneSingleUserId(ValidatableResponse res) {
		res.body("message",equalTo("CONFIGS_SET_SUCCESSFULLY"));
		String [] str = {"message"};
		return genrateResponse(res, str);

	}
	public static String responseCheckAddImpression(ValidatableResponse res) throws Exception {
		String str = res.assertThat().contentType(ContentType.TEXT).extract().response().body().asString();
		if(str.equals("success")==false)
			throw new Exception("not getting success in response"); 
		return	str;
	}
	public static String responseCheckout(ValidatableResponse res) {
		res.assertThat().body("oosPage",not(equalTo(null)));
		String [] str = {"oosPage"};
		return genrateResponse(res,str);
	}
	public static void authanticationCheck(ValidatableResponse res) throws Exception {
		
		JsonPath js = new JsonPath(res.extract().response().body().asString());
		if((js.getString("homePage")) == null) {
			throw new Exception("Authorization Fail");   
			
		}
	}
	
	
	
	

}
