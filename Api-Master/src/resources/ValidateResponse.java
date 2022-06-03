package resources;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ValidateResponse extends ReusableMethods {

	public static void nullCheckSetup4(Response res,int expectedStatusCode ) {
		
		res.then().body("appSettings", not(equalTo(null)),
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
	public static String nullCheckClAddress(Response res,int expectedStatusCode) {
			if(res.getStatusCode()==200 && expectedStatusCode==200) {
				res.then().body("city", not(equalTo(null)),
				"state",not(equalTo(null)),
				"pincode", not(equalTo(null)),
				 "is_serviceable",not(equalTo(null)));
				String [] str = {"city","state","pincode","is_serviceable"};
				return getStatus(res)+genrateResponse(res,str);
			} 
			return getStatus(res)+res.then().assertThat().statusCode(expectedStatusCode).extract().asString();
		 
	}
	public static String nullCheckViewCartCms(Response res,int expectedStatusCode) {
		if(res.getStatusCode()==200 && expectedStatusCode==200) {
		res.then().body("cartPage", not(equalTo(null)),
				"oosPage",not(equalTo(null))).time(lessThan(3000L));
		String [] str = {"cartPage","oosPage"};
		return getStatus(res)+genrateResponse(res,str);
		}
		return getStatus(res)+res.then().assertThat().statusCode(expectedStatusCode).extract().asString();
	}
	public static String nullCheckCoupons(Response res,int expectedStatusCode) {
		res.then().body("coupons", not(equalTo(null))).statusCode(expectedStatusCode);
				
		String [] str = {"coupons"};
		return getStatus(res)+genrateResponse(res, str);
	}
	public static String nullCheckOrderState(Response res,int expectedStatusCode) {
		res.then().body("total_amount", not(equalTo(null)),
				"quantity",not(equalTo(null)),
				"parent_order",not(equalTo(null)),
				"order_id",not(equalTo(null)),
				"status_seq",not(equalTo(null)),
				"status",equalTo(200)).statusCode(expectedStatusCode);
		String [] str = {"quantity","parent_order","order_id","status_seq","status" };
		return getStatus(res)+genrateResponse(res, str)+getArrayValues(res, "order_state_details","status" );

	}
	public static String nullCheckPincode(Response res,int expectedStatusCode) {
		res.then().body("city", not(equalTo(null))).statusCode(expectedStatusCode);
		String [] str = {"city"};
		return getStatus(res)+genrateResponse(res, str);
	}
	public static String nullCheckCheckout(Response res,int expectedStatusCode) {
		res.then().assertThat().body("checkoutPage",not(equalTo(null))).statusCode(expectedStatusCode);
		String [] str = {"checkoutPage"};
		return getStatus(res)+genrateResponse(res, str);
	}
	public static String nullCheckOrderDetails(Response res,int expectedStatusCode) {
		res.then().body("order_id",not(equalTo(null))).statusCode(expectedStatusCode);
		String [] str = {"order_id"};
		return getStatus(res)+genrateResponse(res, str);

	}
	public static String responseCheckSetOneSingleUserId(Response res,int expectedStatusCode) {
		res.then().body("message",equalTo("CONFIGS_SET_SUCCESSFULLY")).statusCode(expectedStatusCode);
		String [] str = {"message"};
		return getStatus(res)+genrateResponse(res, str);

	}
	public static String responseCheckAddImpression(Response res,int expectedStatusCode) throws Exception {
		String str = res.then().contentType(ContentType.TEXT).statusCode(expectedStatusCode).extract().response().body().asString();
		if(str.equals("success")==false)
			throw new Exception("not getting success in response"); 
		return	getStatus(res)+str;
	}

	public static void authanticationCheck(Response res,int expectedStatusCode) throws Exception {
		
		JsonPath js = new JsonPath(res.then().statusCode(expectedStatusCode).extract().response().body().asString());
		if((js.getString("homePage")) == null) {
			throw new Exception("Authorization Fail");   
			
		}
	}
	
	//Support API
	public static String responseCheckCustomerMainList(Response res, int expectedStatusCode) {
		res.then().assertThat().statusCode(expectedStatusCode).time(lessThan(3000L)).extract().asString();
			return getStatus(res);
		
	}
	public static String responseCheckCxNew(Response res, int expectedStatusCode) {
		res.then().assertThat().statusCode(expectedStatusCode).time(lessThan(3000L)).extract().asString();
		return getStatus(res);
	}
	public static String responseCheckTicket(Response res, int expectedStatusCode) {
		res.then().assertThat().statusCode(expectedStatusCode).time(lessThan(3000L)).extract().asString();
		return getStatus(res);
	}
	public static String responseCheckLanguage(Response res, int expectedStatusCode) {
		res.then().assertThat().statusCode(expectedStatusCode).time(lessThan(3000L)).extract().asString();
		return getStatus(res);
	}
	public static String responseCheckImage(Response res, int expectedStatusCode) {
		String str = res.then().assertThat().statusCode(expectedStatusCode).time(lessThan(3000L)).extract().response().asString();
		return getStatus(res)+str;
	}



		
	
	
	
}
