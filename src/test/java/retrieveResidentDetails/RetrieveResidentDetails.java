package retrieveResidentDetails;

import org.json.JSONException;
import io.restassured.response.Response;

public class RetrieveResidentDetails {

	public static void retrieveResidentDetails() throws JSONException {

		Response response = services.Service.requestSpecification.get(
				"https://1-8-dot-urloop-dev-185004.appspot.com/services/resident/retrieve/13/36?with_quote=false&pagenumber=1");
		System.out.println("Resident: Status code is: " + response.statusCode());
		System.out.println("Resident Response is: " + response.asString());
	}

	
}
