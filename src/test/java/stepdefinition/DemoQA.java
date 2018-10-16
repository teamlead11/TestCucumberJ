package stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mypack.BaseClass;

public class DemoQA {

	@Given("^The user is in demoQA home page$")
	public void the_user_is_in_demoQA_home_page() {

		BaseClass.driver.get("http://demoqa.com/registration/");
	}

	// @When("^The user enters fname and last name$")
	// public void the_user_enters_fname_and_last_name() {
	// BaseClass.driver.findElement(By.id("name_3_firstname")).sendKeys("Selvam");
	// BaseClass.driver.findElement(By.id("name_3_lastname")).sendKeys("mani");
	// }

	@When("^The user enters fname and last name$")
	public void the_user_enters_fname_and_last_name(DataTable names) {

		List<Map<String, String>> nameMap = names.asMaps(String.class, String.class);
		System.out.println(nameMap);

		BaseClass.driver.findElement(By.id("name_3_firstname")).sendKeys(nameMap.get(2).get("fname"));
		BaseClass.driver.findElement(By.id("name_3_lastname")).sendKeys(nameMap.get(2).get("lname"));
		// System.out.println(namelist);
		// BaseClass.driver.findElement(By.id("name_3_firstname")).sendKeys(namelist.get(3).get(0));
		// BaseClass.driver.findElement(By.id("name_3_lastname")).sendKeys(namelist.get(3).get(1));

	}

	@Then("^The user verifies the entered text in fname and lname field$")
	public void the_user_verifies_the_entered_text_in_fname_and_lname_field() {
		Assert.assertEquals("sathish", BaseClass.driver.findElement(By.id("name_3_firstname")).getAttribute("value"));
		Assert.assertEquals("gnanavel", BaseClass.driver.findElement(By.id("name_3_lastname")).getAttribute("value"));

	}

	@When("^The user enters text in about yourself \"([^\"]*)\"$")
	public void the_user_enters_text_in_about_yourself(String AboutYourself) {
		BaseClass.driver.findElement(By.id("description")).sendKeys(AboutYourself);
	}

	@Then("^The user verifies the entered text \"([^\"]*)\"$")
	public void the_user_verifies_the_entered_text(String AboutYourself) {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(AboutYourself, BaseClass.driver.findElement(By.id("description")).getAttribute("value"));
	}

}