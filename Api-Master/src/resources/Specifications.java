package resources;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;

public class Specifications {
	static RequestSpecification req;
	static RequestSpecification supportReq;
	
	public static RequestSpecification request() throws FileNotFoundException {
		if(req == null) {
		PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));
		 req = new RequestSpecBuilder().addFilter(RequestLoggingFilter.logRequestTo(log))
			//	 .addFilter(ResponseLoggingFilter.logResponseTo(log))
				.setBaseUri("https://citymall.live")
				.addHeader("Authorization", "caea8ff5-97e1-4a44-a3d6-aa1078180014")
				.build();
		return req;
	}
	return req;
	}
	
	public static RequestSpecification supportRequest() throws FileNotFoundException {
		if(supportReq == null) {
			PrintStream log = new PrintStream(new FileOutputStream("Support_logging.txt"));
			supportReq = new RequestSpecBuilder().addFilter(RequestLoggingFilter.logRequestTo(log))
					 .addFilter(ResponseLoggingFilter.logResponseTo(log))
					.setBaseUri("https://citymall.live")
					.addHeader("Authorization", "caea8ff5-97e1-4a44-a3d6-aa1078180014")
					.build();
			return supportReq;
		}
		return supportReq;
	}
	
}
