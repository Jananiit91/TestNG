package login;

import org.json.JSONException;

import io.restassured.response.Response;


public class Login {

	public static void login() throws JSONException {

		// Login login = new Login();

	/*	String S = "{\"username\":\"admin@gt.com\",\"password\":\"26a6c3cfabfe1c337c5951dfd6fd493895c3d2de\"}";
		services.Service.requestSpecification.header("content-type", "application/json");
		services.Service.requestSpecification.body(S).toString();

		Response response = services.Service.requestSpecification
				.post("https://1-8-dot-urloop-dev-185004.appspot.com/services/admin/login");

		System.out.println("Status code is: " + response.statusCode());
		System.out.println("Response is: " + response.asString());

	
*/
		String S = "{\"emailId\":\"syed.r@tringapps.com\",\"phoneNumber\":\"+919629224442\"}";
		services.Service.requestSpecification.header("content-type", "application/json");
		services.Service.requestSpecification.body(S).toString();

		Response response = services.Service.requestSpecification
				.post("https://1-8-dot-urloop-dev-185004.appspot.com/services/user/conformotp");

		System.out.println("Status code is: " + response.statusCode());
		System.out.println("Response is: " + response.asString());
		
		
	}
	
}
