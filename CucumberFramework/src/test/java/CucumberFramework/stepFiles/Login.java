package CucumberFramework.stepFiles;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

	@Given("^User navigates to NewTour website$")
	public void user_navigates_to_NewTour_website() throws Throwable {

		System.out.println("This is Mwethod 1");

	}

	@And("^User clicks on the SignOn button on the homepage$")
	public void user_clicks_on_the_SignOn_button_on_the_homepage() throws Throwable {
		System.out.println("This is Mwethod 2");

	}

	@And("^User enter the valid username$")
	public void user_enter_the_valid_username() throws Throwable {
		System.out.println("This is Mwethod 3");

	}

	@And("^User enter the valid password$")
	public void user_enter_the_valid_password() throws Throwable {
		System.out.println("This is Mwethod 4");

	}

	@When("^User clicks on the SignOn button$")
	public void user_clicks_on_the_SignOn_button() throws Throwable {
		System.out.println("This is Mwethod 5");

	}

	@Then("^User should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		System.out.println("This is Mwethod 6");

	}

}
