package resources;

import static org.hamcrest.Matchers.lessThan;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Specifications {
	static RequestSpecification req;
	
	public static RequestSpecification request() throws FileNotFoundException {
		if(req == null) {
		PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));
		 req = new RequestSpecBuilder().addFilter(RequestLoggingFilter.logRequestTo(log))
				 .addFilter(ResponseLoggingFilter.logResponseTo(log))
				.setBaseUri("https://citymall.live")
				.addHeader("Authorization", "caea8ff5-97e1-4a44-a3d6-aa1078180014")
				.build();
		return req;
	}
	return req;
	}
	public static ResponseSpecification response(int expectedStatusCode) {
		ResponseSpecification res = new ResponseSpecBuilder()
				.expectStatusCode(expectedStatusCode)
				.expectResponseTime(lessThan(3000L))
				.build();
		return res;
	}

}
