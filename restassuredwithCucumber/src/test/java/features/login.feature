Feature: Login ( Token Authentication )

  Scenario: Login with valid credentials
    Given I provide the Username and Password
    When I send request to login
    Then I received a token
		And I perform Get request to fetch the User Details
		And I will assert the User Details
		
		
	Scenario: Login with invalid credentials
	 Given Username as "Farrukh" and password as "Test123@"
	 When I perform the POST request to login
	 Then I got the response with invalid credential message
	 
	 	