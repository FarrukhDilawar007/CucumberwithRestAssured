package steps;


import static io.restassured.RestAssured.*;

import io.restassured.response.Response;


public class LoginAPI {
	
	public Response GetUserToken() {
		Response response = given()
			.header("Content-Type","application/json")
			.body("{\n\t\"username\" : \"aqsa786\",\n\t\"password\" : \"12345qwertT\"\n}")
			.post("https://apis.cramfrenzy.com/user/api-token-auth/");
		return response;
	}
	
	public Response GetUserDetails(String _token) {
		Response response = given()
		.header("Authorization", "JWT "+ _token)
		.header("Content-Type","application/json")
		.get("https://apis.cramfrenzy.com/user/userdetails/");
		
		return response;
	}

}
