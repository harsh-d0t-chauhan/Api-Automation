package resources;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.not;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Specifications {
	public static RequestSpecification request() {
		RequestSpecification req = new RequestSpecBuilder()
				.setBaseUri("https://citymall.live")
				.addHeader("Authorization", "8a451e73-40ef-452a-b8bf-652af9bf010c")
				.build();
		return req;
	}
	public static ResponseSpecification nullResponseCheck() {
		ResponseSpecification res = new ResponseSpecBuilder()
				.expectStatusCode(200)
				.expectResponseTime(lessThan(3000L))
				.expectBody("appSettings", not(equalTo(null)))
				.expectBody("cancellationReasons",not(equalTo(null)))
				.expectBody("ReturnReasons",not(equalTo(null)))
				.expectBody("ReplaceReasons",not(equalTo(null)))
				.expectBody("juspayPrefetchData", not(equalTo(null)))
				.expectBody("movData", not(equalTo(null)))
				.build();
		return res;
	}

}
