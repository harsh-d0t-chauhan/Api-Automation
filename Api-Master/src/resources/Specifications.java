package resources;

import static org.hamcrest.Matchers.lessThan;
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
	public static ResponseSpecification response() {
		ResponseSpecification res = new ResponseSpecBuilder()
				.expectStatusCode(200)
				.expectResponseTime(lessThan(3000L))
				.build();
		return res;
	}

}
