Feature: Login into account 
	Existing NewTour user should be able to login into account using correct credential


Scenario: Login into account with correct details 

	Given User navigates to NewTour website
	And User clicks on the SignOn button on the homepage 
	And User enter the valid username
	And User enter the valid password
	When User clicks on the SignOn button  
	Then User should be able to login successfully
	