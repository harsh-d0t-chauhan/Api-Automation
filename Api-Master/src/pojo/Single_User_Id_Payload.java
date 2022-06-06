package pojo;

import java.util.List;

public class Single_User_Id_Payload {
	private String codepushVersion;
	private String fcm_token;
	private String oneSignalUserId;
	private List<String> remoteConfigTags;
	
	public Single_User_Id_Payload(String codepushVersion,String fcm_token,String oneSignalUserId, List<String> remoteConfigTags ) {
		this.codepushVersion = codepushVersion;
		this.fcm_token = fcm_token;
		this.oneSignalUserId = oneSignalUserId;
		this.remoteConfigTags = remoteConfigTags;
	}

	public List<String> getRemoteConfigTags() {
		return remoteConfigTags;
	}
	public void setRemoteConfigTags(List<String> remoteConfigTags) {
		this.remoteConfigTags = remoteConfigTags;
	}
	
	public String getCodepushVersion() {
		return codepushVersion;
	}
	public void setCodepushVersion(String codepushVersion) {
		this.codepushVersion = codepushVersion;
	}
	public String getFcm_token() {
		return fcm_token;
	}
	public void setFcm_token(String fcm_token) {
		this.fcm_token = fcm_token;
	}
	public String getOneSignalUserId() {
		return oneSignalUserId;
	}
	public void setOneSignalUserId(String oneSignalUserId) {
		this.oneSignalUserId = oneSignalUserId;
	}
	
	

}
