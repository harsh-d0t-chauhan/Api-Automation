package pojo;

import java.util.List;

public class Cx_New_Payload {
	private List<Response> response;
	
	public Cx_New_Payload(List<Response> response) {
		this.response=response;
		
	}

	public List<Response> getResponse() {
		return response;
	}

	public void setResponse(List<Response> response) {
		this.response = response;
	}

}
