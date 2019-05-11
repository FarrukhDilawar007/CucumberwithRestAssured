package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginwithInvalidDetails {
	

@Given("Username as {string} and password as {string}")
public void username_as_and_password_as(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@When("I perform the POST request to login")
public void i_perform_the_POST_request_to_login() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("I got the response with invalid credential message")
public void i_got_the_response_with_invalid_credential_message() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

}
