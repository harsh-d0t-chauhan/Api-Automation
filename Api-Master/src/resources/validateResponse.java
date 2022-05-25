package resources;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;

public class validateResponse {
	
	public static void nullCheck(ValidatableResponse res) {
		
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
	public static void authanticationCheck(ValidatableResponse res) throws Exception {
		
		JsonPath js = new JsonPath(res.extract().response().body().asString());
		if((js.getString("homePage")) == null) {
			throw new Exception("Authorization Fail");   
			
		}
	}
	
	
	
	

}
