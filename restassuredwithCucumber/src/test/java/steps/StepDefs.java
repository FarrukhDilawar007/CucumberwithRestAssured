package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;


public class StepDefs {

	LoginAPI login = new LoginAPI();
	
	Response responseBody;
	String sessionToken;
	String username;
	String password;
	@Given("I provide the Username and Password")
	public void i_provide_the_Username_and_Password() {
		username = "Aqsa";
		password = "Test123@";
		
	}

	@When("I send request to login")
	public void i_send_request_to_login() {
		System.out.println(username + password);
		responseBody = login.GetUserToken();
	}

	@Then("I received a token")
	public void i_received_a_token() {
		
		sessionToken = responseBody.body().jsonPath().get("token");
		System.out.println("Session Token: " + sessionToken );
	}
	
	@Then("I perform Get request to fetch the User Details")
	public void i_perform_Get_request_to_fetch_the_User_Details() {
	    responseBody =  login.GetUserDetails(sessionToken);
	}
	
	@Then("I will assert the User Details")
	public void i_will_assert_the_User_Details() {
		String firstname = responseBody.body().jsonPath().get("firstname");
		String lastname = responseBody.body().jsonPath().get("lastname");
		String language = responseBody.body().jsonPath().get("language");
		
		System.out.println("First Name: " + firstname +","+ lastname + language);
	}

}
