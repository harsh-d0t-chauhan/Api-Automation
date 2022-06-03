package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Payload {
	static String getProperty(String str) throws IOException{
		 Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("src\\resources\\config.properties");
		prop.load(ip);
		return prop.getProperty(str);
	}
	public static String set_One_Single_User_Id_Payload() throws IOException{
		return "{\r\n"
				+ "    \"codepushVersion\": \"v70\",\r\n"
				+ "    \"fcm_token\": \"ecM6aqU3R228-jabY5TPgP:APA91bG22_JaNTM3fnMjtrHvUJB8XtdGkOv8zjf3clsDt2Ebs46Q6vvFNMfJXqhnR_s6Qv7Mvu7x4esfNCAkAJUK-3JCXKQfe8uhrfJF02jaMZMqjYF991KyA3khFFIJA-R9kMd8UqbQ\",\r\n"
				+ "    \"oneSignalUserId\": null,\r\n"
				+ "    \"remoteConfigTags\": [\"ct_ab_test_remote_config_test\",\r\n"
				+ "    \"ct_ab_show_voice_assistant_true\",\r\n"
				+ "    \"ct_ab_home_pdu_b\",\r\n"
				+ "    \"ct_ab_cat_screen_type_A\",\r\n"
				+ "    \"ct_ab_show_truecaller_false\",\r\n"
				+ "    \"ct_ab_cat_nav_list\",\r\n"
				+ "    \"ct_ab_cl_signup_test_true\",\r\n"
				+ "    \"ct_ab_cl_welcome_yes\",\r\n"
				+ "    \"ct_cx_old_ref_false\",\r\n"
				+ "    \"ct_ab_self_order_yes\"]\r\n"
				+ "}\r\n"
				+ "";
		}
	public static String add_Impression_Payload() throws IOException {
		return "{\r\n"
				+ "  \"impressions\": [{\r\n"
				+ "  \"session_id\": \"377ccb37-5d93-4e75-aebb-04d23e338450\",\r\n"
				+ "   \"source\": \"App Launched Custom\",\r\n"
				+ "    \"action\": \"App Launched Custom\",\r\n"
				+ "    \"app_type\": \"cx\",\r\n"
				+ "    \"asset_id\": \"App Launched Custom\",\r\n"
				+ "    \"asset_parent_id\": \"App Launched Custom\",\r\n"
				+ "    \"asset_type\": \"App Launched Custom\",\r\n"
				+ "    \"catalogue_name\": \"App Launched Custom\",\r\n"
				+ "    \"cms_page_id\": \"pp Launched Custom\",\r\n"
				+ "    \"ct_profile_id\": null,\r\n"
				+ "    \"date\": 1653451289281,\r\n"
				+ "    \"entity_type\": \"App Launched Custom\",\r\n"
				+ "    \"horizontal_rank\": \"App Launched Custom\",\r\n"
				+ "    \"is_product_oos\": \"App Launched Custom\",\r\n"
				+ "    \"linked_cat\": null,\r\n"
				+ "    \"linked_cms\": null,\r\n"
				+ "    \"linked_subcat\": null,\r\n"
				+ "    \"mrp\": \"App Launched Custom\",\r\n"
				+ "    \"price\": \"App Launched Custom\",\r\n"
				+ "    \"screen_name\": \"App Launched Custom\",\r\n"
				+ "    \"session_id\": \"377ccb37-5d93-4e75-aebb-04d23e338450\",\r\n"
				+ "    \"source\": \"App Launched Custom\",\r\n"
				+ "    \"user_id\": \"14312083\",\r\n"
				+ "    \"vertical_rank\": \"App Launched Custom\"\r\n"
				+ "    \r\n"
				+ "  }]\r\n"
				+ "}";
	}
	public static String cancle_Payload() throws IOException {
		return getProperty("cancle_Payload");
		}
	public static String cx_New_Payload() throws IOException {
		return "{\r\n"
				+ "  \"response\": [\r\n"
				+ "    {\r\n"
				+ "      \"dataKey\": \"CUSTOMER_MAIN_LIST\",\r\n"
				+ "      \"render\": \"LINK\",\r\n"
				+ "      \"value\": \"LEADER_BEHAVIOUR\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"dataKey\": \"LEADER_BEHAVIOUR\",\r\n"
				+ "      \"render\": \"LINK\",\r\n"
				+ "      \"value\": \"UNABLE_TO_CONNECT_WITH_MY_LEADER\"\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "      \"dataKey\": \"EXPLAIN_IN_DETAIL\",\r\n"
				+ "      \"render\": \"FORM\",\r\n"
				+ "      \"value\": {\r\n"
				+ "        \"issueDescription\": \"Mxnxnx\"\r\n"
				+ "      }\r\n"
				+ "    }\r\n"
				+ "  ]\r\n"
				+ "}";
		}

}
