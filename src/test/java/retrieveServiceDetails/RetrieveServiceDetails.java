package retrieveServiceDetails;

import org.json.JSONException;
import io.restassured.response.Response;

public class RetrieveServiceDetails {

	// Retrieve Service details
		
			public static void retrieveServiceDetails() throws JSONException {

				Response response = services.Service.requestSpecification.get(
						"https://1-8-dot-urloop-dev-185004.appspot.com/services/dashboard/view/retrieveservicedetails/13/36");
				System.out.println("Service Status code is: " + response.statusCode());
				System.out.println("Service Response is: " + response.asString());
				System.out.println("Service Content Type is: "+response.contentType());
				//System.out.println("Cookie: "+response.cookie(""));
				//System.out.println("Session ID: "+response.sessionId());
				//System.out.println("Header: " +response.getHeader("abc"));
				//System.out.println("Resp Date" + response.getStatusLine());
				
			}

	
}
