package CucumberFramework.stepFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class Register {
	WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Dev_Programs\\Drivers\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

	}


	  @After public void tearDown() throws InterruptedException {
	        Thread.sleep(3000); this.driver.manage().deleteAllCookies();
	       this.driver.quit(); this.driver=null;
	 
	       
	 }
	
	@Given("^User navigate to NewTour Demo$")
	public void user_navigate_to_NewTour_Demo() throws Throwable {
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.findElement(By.xpath("//a[normalize-space()='REGISTER']")).click();
	}

	@And("^User enter the contact Info$")
	public void user_enter_the_contact_Info() throws Throwable {
		driver.findElement(By.name("firstName")).sendKeys("James");
		driver.findElement(By.name("lastName")).sendKeys("Taylor");
		driver.findElement(By.name("phone")).sendKeys("222-22-2222");
		driver.findElement(By.name("userName")).sendKeys("staylor@gmail.com");
	}

	@And("^User enters the Mailing info$")
	public void user_enters_the_Mailing_info() throws Throwable {
		driver.findElement(By.name("address1")).sendKeys("123 Main Street");
		driver.findElement(By.name("city")).sendKeys("NewBase");
		driver.findElement(By.name("state")).sendKeys("Maryland");
		driver.findElement(By.name("postalCode")).sendKeys("12345");

		Select country = new Select(driver.findElement(By.name("country")));
		country.selectByIndex(246);

	}

	@And("^User enters the User Info$")
	public void user_enters_the_User_Info() throws Throwable {
		driver.findElement(By.name("email")).sendKeys("Mandee");
		driver.findElement(By.name("password")).sendKeys("Aaravi");
		driver.findElement(By.name("confirmPassword")).sendKeys("Aaravi");	
		
	}

	@SuppressWarnings("deprecation")
	@Then("^User clicks on submit button$")
	public void user_clicks_on_submit_button() throws Throwable {
		driver.findElement(By.name("submit")).click();
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTite);
		String ExpectedTitle= "Register: Mercury Tours";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	        
			
		
	
	}

	
}
