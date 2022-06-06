package pojo;

import java.util.List;

public class Add_Impressions_Payload {
	private List<Impression> impressions;
	
	public List<Impression> getImpressions() {
		return impressions;
	}

	public void setImpressions(List<Impression> impressions) {
		this.impressions = impressions;
	}

	public Add_Impressions_Payload(List<Impression> impressions){
		this.impressions = impressions;
		
	}

}
