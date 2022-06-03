package resources;



import java.util.ArrayList;
import java.util.HashMap;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ReusableMethods {
	
	public static JsonPath rawToJson(String str) {
		JsonPath js = new JsonPath(str);
		return js;
	}
	
	
	public static String getString(Response res , String str) {
		JsonPath js = new JsonPath(res.then().extract().response().asString());
		String s = js.getString(str);
		if(s == null) {
			return "Please enter valid key";
		}
		else
			return s;
		}
	
	public static int getArraySize(Response res,String str) {
		JsonPath js = new JsonPath(res.then().extract().response().asString());
		return js.getInt(str+".size");
	}
	public static String getArrayValues(Response res,String arr, String key) {
		int size = getArraySize(res, arr);
		String [] arrayKey = new String[size];
		for(int i=0;i<size;i++) {
			arrayKey[i] =  arr+"["+i+"]."+key;
			}
		return genrateResponse(res, arrayKey);
	}
		
	public static String genrateResponse(Response res,String[] str) {
		
		String string = "";
		for(String s : str) {
			string = string +s+" : "+getString(res,s)+"\n";
		}
	return string;
	}
	public static String getStatus(Response res) {
		return "Status Line : "
				+res.getStatusLine()+"\n"+"Response Time : "+res.getTime()+"ms\n";
	}
	public static void printResponse(HashMap<String,ArrayList<String>> map) {
		for ( String key : map.keySet() ) {
			for(String str : map.get(key)) {
				System.out.println(key+" : \n\n"+str+
				"\n---------------------------------------------------------------------------------");
			}
		}
	}


}
