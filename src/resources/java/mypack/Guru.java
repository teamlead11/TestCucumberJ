package mypack;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Guru {

	@Given("^The user is in guru home page$")
	public void the_user() {
		BaseClass.driver.get("http://demo.guru99.com/v4/index.php");
	}

	// @When("^The user enters userID and password$")
	public void the_user_enters_userID_and_password() {
		BaseClass.driver.findElement(By.name("uid")).sendKeys("test");
		BaseClass.driver.findElement(By.name("password")).sendKeys("pass");
	}

	@When("^The user enters userID and password$")
	public void the_user_enters_userID_and_password(DataTable credentials) {
		// List<String> credentialList = credentials.asList(String.class);
		// BaseClass.driver.findElement(By.name("uid")).sendKeys(credentialList.get(0));
		// BaseClass.driver.findElement(By.name("password")).sendKeys(credentialList.get(1));
		// Map<String, String> credentialMap = credentials.asMap(String.class,
		// String.class);
		// BaseClass.driver.findElement(By.name("uid")).sendKeys(credentialMap.get("username"));
		// BaseClass.driver.findElement(By.name("password")).sendKeys(credentialMap.get("password"));
		// List<List<String>> credentialLists =
		// credentials.asLists(String.class);
		// BaseClass.driver.findElement(By.name("uid")).sendKeys(credentialLists.get(2).get(0));
		// BaseClass.driver.findElement(By.name("password")).sendKeys(credentialLists.get(2).get(1));
		List<Map<String, String>> credentialMaps = credentials.asMaps(String.class, String.class);
		System.out.println(credentialMaps);
		BaseClass.driver.findElement(By.name("uid")).sendKeys(credentialMaps.get(0).get("username"));
		BaseClass.driver.findElement(By.name("password")).sendKeys(credentialMaps.get(0).get("password"));
	}

//	@When("^The user click reset button$")
	public void the_user_click_reset_button() {
		BaseClass.driver.findElement(By.name("btnReset")).click();
	}

	@Then("^The user should see the fields empty$")
	public void the_user_should_see_the_fields_empty() {
		Assert.assertEquals("", BaseClass.driver.findElement(By.name("uid")).getAttribute("value"));
		Assert.assertEquals("", BaseClass.driver.findElement(By.name("password")).getAttribute("value"));

	}

}
