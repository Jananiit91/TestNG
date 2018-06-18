package retrieveLocDetails;

import org.json.JSONException;

import io.restassured.response.Response;

public class RetrieveLocDetails {

	public static void retrievelocDetails_Settings() throws JSONException {

		Response response = services.Service.requestSpecification.get("https://1-8-dot-urloop-dev-185004.appspot.com/services/loc/retrieve/13/36?withDisabled=true");
		System.out.println("Loc Details: Status code is: " + response.statusCode());
		System.out.println("Loc Details is: " + response.asString());
	}
	
}
