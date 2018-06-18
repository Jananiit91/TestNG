/*package services;

import org.json.JSONException;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import requestpojo.Login;
import requestpojo.LoginPojo;

public class Test {

	public static RequestSpecification requestSpecification = RestAssured.given().relaxedHTTPSValidation().when();
	// Login for Dashboard App
		// @Test(priority=1)
		public void login(String username, String password) {

			LoginPojo loginpojo = new LoginPojo();
			Login login = new Login();
			login.setUsername(username);
			login.setPassword(password);

			loginpojo.setLogin(login);

			requestSpecification.header("content-type", "application/json");
			requestSpecification.body(login).toString();

			Response response = requestSpecification
					.post("https://1-8-dot-urloop-dev-185004.appspot.com/services/admin/login");

			System.out.println("Status code is: " + response.statusCode());
			System.out.println("Response is: " + response.asString());
		}

		// Retrieve event details
		//@Test(priority = 2)
		public void retrieveEventDetails() throws JSONException {

			Response response = requestSpecification
					.get("https://1-8-dot-urloop-dev-185004.appspot.com/services/event/listofusers/13/36?adminid=42");
			System.out.println("GET Status code is: " + response.statusCode());
			System.out.println("GET Response is: " + response.asString());
		}

		// Retrieve Service details
		//@Test(priority = 1)
		public void retrieveServiceDetails() throws JSONException {

			Response response = requestSpecification.get(
					"https://1-8-dot-urloop-dev-185004.appspot.com/services/dashboard/view/retrieveservicedetails/13/36");
			System.out.println("GET Status code is: " + response.statusCode());
			System.out.println("GET Response is: " + response.asString());
			System.out.println("Content Type is: "+response.contentType());
			System.out.println("Cookie: "+response.cookie(""));
			System.out.println("Session ID: "+response.sessionId());
			System.out.println("Header: " +response.getHeader("abc"));
			System.out.println("Resp Date" + response.getStatusLine());
			
		}

		// Retrieve Residents details
		//@Test(priority = 3)
		public void retrieveResidentDetails() throws JSONException {

			Response response = requestSpecification.get(
					"https://1-8-dot-urloop-dev-185004.appspot.com/services/resident/retrieve/13/36?with_quote=false&pagenumber=1");
			System.out.println("Resident: Status code is: " + response.statusCode());
			System.out.println("Resident Response is: " + response.asString());
		}

		// Retrieve Unassigned services
		//@Test(priority = 4)
		public void retrieveUnassignedServices() throws JSONException {

			Response response = requestSpecification.get(
					"https://1-8-dot-urloop-dev-185004.appspot.com/services/executionteam/retrievelist/13/36?isservice=true");
			System.out.println("Unassigned Services: Status code is: " + response.statusCode());
			System.out.println("Unassigned Services is: " + response.asString());
		}

		// Retrieve Staff Details
		//@Test(priority = 5)
		/*public void retrieveStaffDetails() throws JSONException {

			Response response = requestSpecification.get(
					"https://1-8-dot-urloop-dev-185004.appspot.com/services/staffs/retrievelist/13/36?isserviceteam=false");
			System.out.println("Staff Details: Status code is: " + response.statusCode());
			System.out.println("Staff Details is: " + response.asString());
		}*/

		// Retrieve loc Details
		//@Test(priority = 7)
		/*public void retrievelocDetails_Settings() throws JSONException {

			Response response = requestSpecification
					.get("https://1-8-dot-urloop-dev-185004.appspot.com/services/loc/retrieve/13/36?withDisabled=true");
			System.out.println("Loc Details: Status code is: " + response.statusCode());
			System.out.println("Loc Details is: " + response.asString());
		}

		// Retrieve Staff Details
		//@Test(priority = 6)
		public void retrieveZoneDetails_Settings() throws JSONException {

			Response response = requestSpecification
					.get("https://1-8-dot-urloop-dev-185004.appspot.com/services/zone/retrieve/13/36");
			System.out.println("Zone Details: Status code is: " + response.statusCode());
			System.out.println("Zone Details is: " + response.asString());
		}

		//@Test(priority = 8)
		public void login1() throws JSONException {

			// Login login = new Login();

			String S = "{\"username\":\"admin@gt.com\",\"password\":\"26a6c3cfabfe1c337c5951dfd6fd493895c3d2de\"}";
			requestSpecification.header("content-type", "application/json");
			requestSpecification.body(S).toString();

			Response response = requestSpecification
					.post("https://1-8-dot-urloop-dev-185004.appspot.com/services/admin/login");

			System.out.println("Status code is: " + response.statusCode());
			System.out.println("Response is: " + response.asString());

		}


		/*public static void main(String[] args) throws JSONException {
			Service obj = new Service();
			//obj.login("admin@gt.com", "26a6c3cfabfe1c337c5951dfd6fd493895c3d2de");
			//obj.retrieveEventDetails();
			obj.retrieveServiceDetails();
			//obj.retrieveResidentDetails();
			//obj.retrieveUnassignedServices();
			//obj.retrieveStaffDetails();
			//obj.retrievelocDetails_Settings();
			//obj.retrieveZoneDetails_Settings();
			//obj.login1();
		}
	
	
	
}
*/