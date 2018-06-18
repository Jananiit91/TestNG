package services;

import org.json.JSONException;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class Service {

	public static RequestSpecification requestSpecification = RestAssured.given().relaxedHTTPSValidation().when();

	// Login
	//@Test(priority = 7)
	public void login() throws JSONException {
System.out.println("Prioirity 7");
		login.Login.login();
	}

	//@Test(priority = 0)
	public void RetrieveZoneDetails() throws JSONException {
		System.out.println("Prioirity 0");
		retrieveZoneDetails.RetrieveZoneDetails.retrieveZoneDetails_Settings();

	}

	//@Test(priority = 6)
	public void RetrieveEventDetails() throws JSONException {
		System.out.println("Prioirity 6");
		retrieveEventDetails.RetrieveEventDetails.retrieveEventDetails();

	}

	//@Test(priority = 4)
	public void RetrieveServiceDetails() throws JSONException {
		System.out.println("Prioirity 4");
		retrieveServiceDetails.RetrieveServiceDetails.retrieveServiceDetails();

	}
	
	//@Test(priority = 5)
	public void retrieveResidentDetails() throws JSONException {
		System.out.println("Prioirity 5");
		retrieveResidentDetails.RetrieveResidentDetails.retrieveResidentDetails();
		
	}
	
	//@Test(priority = 3)
	public void retrieveUnassignedServices() throws JSONException {
		System.out.println("Prioirity 3");
		retrieveUnassignedServices.RetrieveUnassignedServices.retrieveUnassignedServices();
		
	}
	
	//@Test(priority = 2)
	public void retrieveStaffDetails() throws JSONException {
		System.out.println("Prioirity 2");
		retrieveStaffDetails.RetrieveStaffDetails.retrieveStaffDetails();
		
	}
	
	@Test(priority = 1)
	public void retrievelocDetails_Settings() throws JSONException {
		System.out.println("Prioirity 1");
		retrieveLocDetails.RetrieveLocDetails.retrievelocDetails_Settings();
		
	}
}
