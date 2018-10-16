package mypack;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GuruLogin {

	@Given("^The user is in guru login page$")
	public void the_user_is_in_guru_login() {
		// Write code here that turns the phrase above into concrete actions

		BaseClass.driver.get("http://demo.guru99.com/v4/");
		System.out.println("calling backround");
	}

	// @When("^The user login with valid username and password$")
	public void the_user_login_with_valid() {
		// Write code here that turns the phrase above into concrete actions
		BaseClass.driver.findElement(By.name("uid")).sendKeys("mngr154050");
		BaseClass.driver.findElement(By.name("password")).sendKeys("zamynEs");
		BaseClass.driver.findElement(By.name("btnLogin")).click();
	}

	@When("^The user login with valid username and password$")
	public void the_user_login_with_valid_username_and_password(DataTable credentials) {
		// List<String> credentialList = credentials.asList(String.class);
		// BaseClass.driver.findElement(By.name("uid")).sendKeys(credentialList.get(0));
		// BaseClass.driver.findElement(By.name("password")).sendKeys(credentialList.get(1));
		// BaseClass.driver.findElement(By.name("btnLogin")).click();
		// Map<String, String> credentialMap = credentials.asMap(String.class,
		// String.class);
		// BaseClass.driver.findElement(By.name("uid")).sendKeys(credentialMap.get("username"));
		// BaseClass.driver.findElement(By.name("password")).sendKeys(credentialMap.get("password"));
		// BaseClass.driver.findElement(By.name("btnLogin")).click();
		// List<List<String>> credentialList =
		// credentials.asLists(String.class);
		// System.out.println(credentialList);
		// BaseClass.driver.findElement(By.name("uid")).sendKeys(credentialList.get(1).get(0));
		// BaseClass.driver.findElement(By.name("password")).sendKeys(credentialList.get(1).get(1));
		// BaseClass.driver.findElement(By.name("btnLogin")).click();
		//
		List<Map<String, String>> credentialMap = credentials.asMaps(String.class, String.class);
		System.out.println(credentialMap);
		BaseClass.driver.findElement(By.name("uid")).sendKeys(credentialMap.get(2).get("username"));
		BaseClass.driver.findElement(By.name("password")).sendKeys(credentialMap.get(2).get("password"));
		BaseClass.driver.findElement(By.name("btnLogin")).click();
	}

	@Then("^The user should be logged in$")
	public void the_user_should_be_logged_in() {
		Assert.assertEquals("Welcome To Manager's Page of Guru99 Bank",
				BaseClass.driver.findElement(By.tagName("marquee")).getText());
	}

	@When("^The user enters username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void the_user_enters_username_and_password(String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		BaseClass.driver.findElement(By.name("uid")).sendKeys(username);
		BaseClass.driver.findElement(By.name("password")).sendKeys(password);
	}

	
	@Then("^The fields should be empty$")
	public void the_fields_should_be_empty() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(BaseClass.driver.findElement(By.name("uid")).getAttribute("value"), "");
		Assert.assertEquals(BaseClass.driver.findElement(By.name("password")).getAttribute("value"), "");
	}

	

	

	@When("^The user clicks reset button$")
	public void the_user_clicks_reset_button() {
		BaseClass.driver.findElement(By.name("res")).click();
	}

	

}
