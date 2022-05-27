package resources;



import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;

public class ReusableMethods {
	
	public static JsonPath rawToJson(String str) {
		JsonPath js = new JsonPath(str);
		return js;
	}
	
	
	public static String getString(ValidatableResponse res , String str) {
		JsonPath js = new JsonPath(res.extract().response().asString());
		String s = js.getString(str);
		if(s == null) {
			return "Please enter valid key";
		}
		else
			return s;
		}
	
	public static int getArraySize(ValidatableResponse res,String str) {
		JsonPath js = new JsonPath(res.extract().response().asString());
		return js.getInt(str+".size");
	}
	
	public static String genrateResponse(ValidatableResponse res,String[] str) {
		String response = res.extract().response().asString();
		JsonPath js = new JsonPath(response);
		String string = "";
		for(String s : str) {
			string = string +s+" : "+js.getString(s)+"\n";
		}
	return string;
	}

}
