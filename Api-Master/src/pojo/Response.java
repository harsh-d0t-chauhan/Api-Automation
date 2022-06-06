package pojo;

public class Response {
	private String dataKey;
	private String render;
	private String value;
	
	public Response(String dataKey,String render,String value){
		this.dataKey=dataKey;
		this.render= render;
		this.value=value;
		
	}

	public String getDataKey() {
		return dataKey;
	}
	public void setDataKey(String dataKey) {
		this.dataKey = dataKey;
	}
	public String getRender() {
		return render;
	}
	public void setRender(String render) {
		this.render = render;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
