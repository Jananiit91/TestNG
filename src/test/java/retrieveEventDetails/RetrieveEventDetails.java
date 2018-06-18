package retrieveEventDetails;

import java.net.URI;

import org.json.JSONException;
import org.testng.Assert;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSenderOptions;

public class RetrieveEventDetails {

	public static void retrieveEventDetails() throws JSONException {

		Response response = services.Service.requestSpecification
				.get("https://1-8-dot-urloop-dev-185004.appspot.com/services/event/listofusers/13/36?adminid=42");
		System.out.println("Event details Status code is: " + response.statusCode());
		System.out.println("Event details Response is: " + response.asString());

		// int statusCode = response.getStatusCode();
		// Assert.assertEquals(statusCode, 400,"[Error--> ]");

		// Validating Status Code
		int returnCode = response.getStatusCode();
		if (returnCode == 200) {
			System.out.println("This is the valid status code--> Success");
		} 
		else if (returnCode >= 400 && returnCode < 500) {
			System.out.println("Page Not Found");
		}
		else if(returnCode >=500 && returnCode < 600) {
			System.out.println("Internal Server error");
			
		}
		else{
			System.out.println("Invalid Status code");
		};

		String body = response.body().asString();
		System.out.println(body);
		if (body.contentEquals("{\"users\":{\"Resident\":[{\"userId\":1693,\"staffId\":0,\"userName\":\"Gary Kirstem\",\"imageUrl\":null,\"userType\":\"Resident\",\"phonenumber\":null,\"eventRequestStatus\":0,\"requestId\":0,\"selected\":false},{\"userId\":1694,\"staffId\":0,\"userName\":\"prabhu raj\",\"imageUrl\":null,\"userType\":\"Resident\",\"phonenumber\":null,\"eventRequestStatus\":0,\"requestId\":0,\"selected\":false},{\"userId\":1695,\"staffId\":0,\"userName\":\"Syed Abdhageer\",\"imageUrl\":null,\"userType\":\"Resident\",\"phonenumber\":null,\"eventRequestStatus\":0,\"requestId\":0,\"selected\":false},{\"userId\":1696,\"staffId\":0,\"userName\":\"Vajaharh Ali\",\"imageUrl\":null,\"userType\":\"Resident\",\"phonenumber\":null,\"eventRequestStatus\":0,\"requestId\":0,\"selected\":false},{\"userId\":1697,\"staffId\":0,\"userName\":\"Milano Gill\",\"imageUrl\":null,\"userType\":\"Resident\",\"phonenumber\":null,\"eventRequestStatus\":0,\"requestId\":0,\"selected\":false},{\"userId\":1699,\"staffId\":0,\"userName\":\"chris garry\",\"imageUrl\":null,\"userType\":\"Resident\",\"phonenumber\":null,\"eventRequestStatus\":0,\"requestId\":0,\"selected\":false},{\"userId\":1700,\"staffId\":0,\"userName\":\"Group Testresident\",\"imageUrl\":null,\"userType\":\"Resident\",\"phonenumber\":null,\"eventRequestStatus\":0,\"requestId\":0,\"selected\":false},{\"userId\":1702,\"staffId\":0,\"userName\":\"RK Reddy\",\"imageUrl\":null,\"userType\":\"Resident\",\"phonenumber\":null,\"eventRequestStatus\":0,\"requestId\":0,\"selected\":false}],\"Staff\":[{\"userId\":0,\"staffId\":214,\"userName\":\"Dan Roxy\",\"imageUrl\":null,\"userType\":\"Staff\",\"phonenumber\":null,\"eventRequestStatus\":0,\"requestId\":0,\"selected\":false},{\"userId\":0,\"staffId\":215,\"userName\":\"Vihan J\",\"imageUrl\":null,\"userType\":\"Staff\",\"phonenumber\":null,\"eventRequestStatus\":0,\"requestId\":0,\"selected\":false},{\"userId\":0,\"staffId\":216,\"userName\":\"Mike kenny\",\"imageUrl\":null,\"userType\":\"Staff\",\"phonenumber\":null,\"eventRequestStatus\":0,\"requestId\":0,\"selected\":false}]}}"))
		{

			System.out.println("Success");
		} else {
			System.out.println("Error");

		};
		
	}

	public static void main(String[] args) throws JSONException {
		retrieveEventDetails();

	}

}
