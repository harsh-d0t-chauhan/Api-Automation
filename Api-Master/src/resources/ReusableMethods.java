package resources;

import io.restassured.path.json.JsonPath;

public class ReusableMethods {
	
	public static JsonPath rawToJson(String str) {
		JsonPath js = new JsonPath(str);
		return js;
	}
	
	
	public static String get(JsonPath js , String str) {
		
		String s = js.getString(str);
		if(s == null) {
			return "Please enter valid key";
		}
		else
			return s;
		}
	
	public static int getArraySize(JsonPath js,String str) {
		return js.getInt(str+".size");
	}

}
