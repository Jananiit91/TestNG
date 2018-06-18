package retrieveZoneDetails;

import org.json.JSONException;

import io.restassured.response.Response;

public class RetrieveZoneDetails {

	// Retrieve Staff Details

	public static void retrieveZoneDetails_Settings() throws JSONException {

		Response response = services.Service.requestSpecification
				.get("https://1-8-dot-urloop-dev-185004.appspot.com/services/zone/retrieve/13/36");
		System.out.println("Zone Details: Status code is: " + response.statusCode());
		System.out.println("Zone Details is: " + response.asString());

	}

}
