package pojo;

public class Impression {
	private String session_id;
	private String source;
	private String action;
	private String app_type;
	private String asset_id;
	private String asset_parent_id;
	private String asset_type;
	private String catalogue_name;
	private String cms_page_id;
	private String ct_profile_id;
	private String date;
	private String entity_type;
	private String horizontal_rank;
	private String is_product_oos;
	private String linked_cat;
	private String linked_cms;
	private String linked_subcat;
	private String mrp;
	private String price;
	private String screen_name;
	private String user_id;
	private String vertical_rank;
	public Impression(){
		
	}
	public Impression(String session_id,String source,String action,String app_type,String asset_id,
			String asset_parent_id,String asset_type,String catalogue_name,String cms_page_id,
			String ct_profile_id,String date,String entity_type,String horizontal_rank,String is_product_oos,
			String linked_cat,String linked_cms,String linked_subcat,String mrp,String price,
			String screen_name,String user_id,String vertical_rank){
		this.session_id= session_id;
		this.source=source;
		this.action=action;
		this.app_type=app_type;
		this.asset_id=asset_id;
		this.asset_parent_id=asset_parent_id;
		this.asset_type=asset_type;
		this.catalogue_name=catalogue_name;
		this.cms_page_id=cms_page_id;
		this.ct_profile_id=ct_profile_id;
		this.date=date;
		this.entity_type=entity_type;
		this.horizontal_rank=horizontal_rank;
		this.is_product_oos=is_product_oos;
		this.linked_cat=linked_cat;
		this.linked_cms=linked_cms;
		this.linked_subcat=linked_subcat;
		this.mrp=mrp;
		this.price=price;
		this.screen_name=screen_name;
		this.user_id=user_id;
		this.vertical_rank= vertical_rank;
		
		
	}

	public String getSession_id() {
		return session_id;
	}
	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getApp_type() {
		return app_type;
	}
	public void setApp_type(String app_type) {
		this.app_type = app_type;
	}
	public String getAsset_id() {
		return asset_id;
	}
	public void setAsset_id(String asset_id) {
		this.asset_id = asset_id;
	}
	public String getAsset_parent_id() {
		return asset_parent_id;
	}
	public void setAsset_parent_id(String asset_parent_id) {
		this.asset_parent_id = asset_parent_id;
	}
	public String getAsset_type() {
		return asset_type;
	}
	public void setAsset_type(String asset_type) {
		this.asset_type = asset_type;
	}
	public String getCatalogue_name() {
		return catalogue_name;
	}
	public void setCatalogue_name(String catalogue_name) {
		this.catalogue_name = catalogue_name;
	}
	public String getCms_page_id() {
		return cms_page_id;
	}
	public void setCms_page_id(String cms_page_id) {
		this.cms_page_id = cms_page_id;
	}
	public String getCt_profile_id() {
		return ct_profile_id;
	}
	public void setCt_profile_id(String ct_profile_id) {
		this.ct_profile_id = ct_profile_id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getEntity_type() {
		return entity_type;
	}
	public void setEntity_type(String entity_type) {
		this.entity_type = entity_type;
	}
	public String getHorizontal_rank() {
		return horizontal_rank;
	}
	public void setHorizontal_rank(String horizontal_rank) {
		this.horizontal_rank = horizontal_rank;
	}
	public String getIs_product_oos() {
		return is_product_oos;
	}
	public void setIs_product_oos(String is_product_oos) {
		this.is_product_oos = is_product_oos;
	}
	public String getLinked_cat() {
		return linked_cat;
	}
	public void setLinked_cat(String linked_cat) {
		this.linked_cat = linked_cat;
	}
	public String getLinked_cms() {
		return linked_cms;
	}
	public void setLinked_cms(String linked_cms) {
		this.linked_cms = linked_cms;
	}
	public String getLinked_subcat() {
		return linked_subcat;
	}
	public void setLinked_subcat(String linked_subcat) {
		this.linked_subcat = linked_subcat;
	}
	public String getMrp() {
		return mrp;
	}
	public void setMrp(String mrp) {
		this.mrp = mrp;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getScreen_name() {
		return screen_name;
	}
	public void setScreen_name(String screen_name) {
		this.screen_name = screen_name;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getVertical_rank() {
		return vertical_rank;
	}
	public void setVertical_rank(String vertical_rank) {
		this.vertical_rank = vertical_rank;
	}
	


}
