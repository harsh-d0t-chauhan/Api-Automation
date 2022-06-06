package resources;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.DataProvider;


import pojo.Add_Impressions_Payload;
import pojo.Impression;
import pojo.Single_User_Id_Payload;

public class Url {
	
	@DataProvider(name ="address")
	public static Object[][] getEndpointClUserAddress() {
				return new Object[][] {{"/api/cl-user/profile/address",200},
					{"/api/cl-user/profile/city",404}};
		
	}
	
	@DataProvider(name = "addImpression")
	public static Object[][] getEndpointAddImpresion(){
		List<Impression> im = Arrays.asList(new Impression("377ccb37-5d93-4e75-aebb-04d23e338450","App Launched Custom","App Launched Custom","cx","App Launched Custom",
									"App Launched Custom","App Launched Custom","App Launched Custom","pp Launched Custom",null,"1653451289281",
									"App Launched Custom","App Launched Custom","App Launched Custom",null,null,null,"App Launched Custom",
									"App Launched Custom","App Launched Custom","14312083","App Launched Custom"));
	
		Add_Impressions_Payload add_Impression_Payload = new Add_Impressions_Payload(im);
		return new Object[][] {{"/api/analytics/add-impression/14312083",add_Impression_Payload,200}};
		
	}
	@DataProvider(name = "Coupons")
	public static Object[][] getEndpointCoupons(){
		return new Object[][] {{"/api/cl-user/get-coupons",200}};
		
	}
	@DataProvider(name = "ViewCartCms")
	public static Object[][] getEndpointViewCartCms(){
		return new Object[][] {{"/api/cl-user/view-cart-cms",200}};
		
	}

	@DataProvider(name = "OrderState")
	public static Object[][] getEndpointOrderState(){
		return new Object[][] {{"/api/cl-user/v3/order-states","011165844",200},
			{"/api/cl-user/v3/order-states","jahsj",400},
			{"/api/cl-user/v3/order-states","01116584418",204}};
		
	}

	@DataProvider(name = "CityFromPinCode")
	public static Object[][] getEndpointCityFromPinCode(){
		return new Object[][] {{"/api/cl-user/get-city-from-pincode/122012",200},
			{"/api/cl-user/get-city-from-pincode/12201267",400},
		{"/api/cl-user/get-city-from-pincode/jhsdj",400}};
		
	}

	@DataProvider(name = "CheckOut")
	public static Object[][] getEndpointCheckOut(){
		return new Object[][] {{"/api/cl-user/v2/checkout",200}};
		
	}

	@DataProvider(name = "OrderDetails")
	public static Object[][] getEndpointOrderDetails(){
		return new Object[][] {{"/api/cl-user/order-details-2/11165844",200}};
		
	}

	@DataProvider(name = "Setup4")
	public static Object[][] getEndpointSetup4(){
		return new Object[][] {{"/api/cl-user/setup-4",200}};
		
	}
	
	@DataProvider(name = "OneSingleUserId")
	public static Object[][] getEndOneSingleUserId(){
		List<String> st= Arrays.asList("ct_ab_test_remote_config_test",
			    "ct_ab_show_voice_assistant_true",
			    "ct_ab_home_pdu_b",
			    "ct_ab_cat_screen_type_A",
			    "ct_ab_show_truecaller_false",
			    "ct_ab_cat_nav_list",
			    "ct_ab_cl_signup_test_true",
			    "ct_ab_cl_welcome_yes",
			    "ct_cx_old_ref_false",
			    "ct_ab_self_order_yes");
		Single_User_Id_Payload singleUserId = new Single_User_Id_Payload("v70","ecM6aqU3R228-jabY5TPgP:APA91bG22_JaNTM3fnMjtrHvUJB8XtdGkOv8zjf3clsDt2Ebs46Q6vvFNMfJXqhnR_s6Qv7Mvu7x4esfNCAkAJUK-3JCXKQfe8uhrfJF02jaMZMqjYF991KyA3khFFIJA-R9kMd8UqbQ",null,st);
		return new Object[][] {{"/api/cl-user/set-one-signal-user-id",singleUserId,200},
			{"/api/cl-user/set-one-signal-user-id",singleUserId,200}};
		
	}
	@DataProvider(name = "customerMainList")
	public static Object[][] getCustomerMainList(){
		return new Object[][] {{"/api/support/cx/config-new-v2",200}};
	}
	@DataProvider(name = "cxNew")
	public static Object[][] getCxNew(){
		return new Object[][] {{"/api/support/cx/new",200}};
	}
	@DataProvider(name = "ticket")
	public static Object[][] getTicket(){
		return new Object[][] {{"/api/support/cx/get-ticket",200}};
	}
	@DataProvider(name = "language")
	public static Object[][] getLanguage(){
		return new Object[][] {{"/api/cl-user/get-languages",200}};
	}
	@DataProvider(name = "image")
	public static Object[][] getImage(){
		return new Object[][] {{"/api/media/upload-image",200}};
	}






}
