package retrieveStaffDetails;

import org.json.JSONException;

import io.restassured.response.Response;

public class RetrieveStaffDetails {

	public static void retrieveStaffDetails() throws JSONException {

		Response response = services.Service.requestSpecification.get(
				"https://1-8-dot-urloop-dev-185004.appspot.com/services/staffs/retrievelist/13/36?isserviceteam=false");
		System.out.println("Staff Details: Status code is: " + response.statusCode());
		System.out.println("Staff Details is: " + response.asString());
	}
	
	
}
