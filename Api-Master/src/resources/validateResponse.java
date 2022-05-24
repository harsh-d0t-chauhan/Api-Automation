package resources;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

import io.restassured.response.ValidatableResponse;

public class validateResponse {
	
	public static void nullCheck(ValidatableResponse res) {
		res.body("appSettings", equalTo(null))
		.body("cancellationReasons", not(equalTo(null)))
		.body("ReturnReasons", not(equalTo(null)))
		.body("ReplaceReasons", not(equalTo(null)))
		.body("feedStaleDelayMs", not(equalTo(null)))
		.body("juspayPrefetchData", not(equalTo(null)))
		.body("movData", not(equalTo(null)))
		.body("homePage", not(equalTo(null)))
		.body("supportPhoneNumber", not(equalTo(null)))
		.body("categoryList", not(equalTo(null)))
		.body("viewCartLight", not(equalTo(null)))
		.body("oosSkus", not(equalTo(null)))
		.body("version", not(equalTo(null)))
		.body("whatsAppMsg", not(equalTo(null)))
		.body("juspayInitiateData", not(equalTo(null)))
		.body("impressionsEnabled", not(equalTo(null)))
		.body("impressionsConfig", not(equalTo(null)))
		.body("meResponse", not(equalTo(null)))
		.body("searchSuggestionEnable", not(equalTo(null)))
		.body("cxWalkthroughUI", not(equalTo(null)))
		.body("currentSystemTime", not(equalTo(null)))
		.body("newProductsByCategoryEnabled", not(equalTo(null)));
				
	}

}
