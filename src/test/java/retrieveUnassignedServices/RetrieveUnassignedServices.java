package retrieveUnassignedServices;

import org.json.JSONException;

import io.restassured.response.Response;

public class RetrieveUnassignedServices {

	public static void retrieveUnassignedServices() throws JSONException {

				Response response = services.Service.requestSpecification.get(
						"https://1-8-dot-urloop-dev-185004.appspot.com/services/executionteam/retrievelist/13/36?isservice=true");
				System.out.println("Unassigned Services: Status code is: " + response.statusCode());
				System.out.println("Unassigned Services is: " + response.asString());
			}
	
}
