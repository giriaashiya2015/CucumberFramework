package CucumberFramework.stepFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
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

		driver.get("http://demo.guru99.com/test/newtours/");

	}

	@And("^User clicks on the SignOn button on the homepage$")
	public void user_clicks_on_the_SignOn_button_on_the_homepage() throws Throwable {
		driver.findElement(By.xpath("//a[normalize-space()='SIGN-ON']")).click();
	}

	@And("^User enter the valid username$")
	public void user_enter_the_valid_username() throws Throwable {
		 driver.findElement(By.name("userName")).sendKeys("mercury");

	}

	@And("^User enter the valid password$")
	public void user_enter_the_valid_password() throws Throwable {
		driver.findElement(By.name("password")).sendKeys("mercury");

		
	}

	@When("^User clicks on the SignOn button$")
	public void user_clicks_on_the_SignOn_button() throws Throwable {
		driver.findElement(By.xpath("//input[@name='submit']")).click();
System.out.println("This is testing");
	}

	@SuppressWarnings("deprecation")
	@Then("^User should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		Thread.sleep(3000);
		WebElement Login_Successfully= driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));
		Assert.assertEquals(true, Login_Successfully.isDisplayed());
		
	}

}
