package CucumberFramework.stepFiles;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Dev_Programs\\Drivers\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		this.driver.manage().deleteAllCookies();
		this.driver.quit();
		this.driver=null;
		
	}

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
		System.out.println("This is Mwethod for the valid user");

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
