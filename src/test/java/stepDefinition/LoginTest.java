package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest extends BaseClass {

	@Given("^I open chrome browser$")
	public void i_open_chrome_browser() {
		openBrowser();
	}

	@Given("^I go to salesforce home page$")
	public void i_go_to_salesforce_home_page() {
		driver.get("https://login.salesforce.com");

	}

	@Given("^I enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String username) {
		driver.findElement(By.id("username")).sendKeys(username);

	}

	@Given("^I enter password as \"([^\"]*)\"$")
	public void i_enter_password_as(String password) {
		driver.findElement(By.id("password")).sendKeys(password);

	}

	@When("^I click the login button$")
	public void i_click_the_login_button() {
		driver.findElement(By.id("Login")).click();

	}
	@Then("^I see the dashboard$")
	public void i_see_the_dashboard() {
	 
	}


}
