package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GuruInsurance {

	@Given("^The user is guru telecom home page$")
	public void the_user_is_guru_telecom_home_page() {
		// Write code here that turns the phrase above into concrete actions

		HookClass.driver.get("http://demo.guru99.com/telecom/");
	}

	@Given("^The user navigates the add customer page$")
	public void the_user_navigates_the_add_customer_page() {
		// Write code here that turns the phrase above into concrete actions
		HookClass.driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("^The user enters the customer details \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enters_the_customer_details_and(String fname, String lname, String email, String adress,
			String phnum, String backround) {
		// Write code here that turns the phrase above into concrete actions
		HookClass.driver.findElement(By.id("fname")).sendKeys(fname);
		HookClass.driver.findElement(By.id("lname")).sendKeys(lname);
		HookClass.driver.findElement(By.id("email")).sendKeys(email);

		HookClass.driver.findElement(By.name("addr")).sendKeys(adress);
		HookClass.driver.findElement(By.id("telephoneno")).sendKeys(phnum);

		HookClass.driver.findElement(By.xpath("//label[text()='Done']")).click();
		HookClass.driver.findElement(By.name("submit")).click();
	}

	@Then("^The user should get the customer id$")
	public void the_user_should_get_the_customer_id() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(
				HookClass.driver.findElement(By.xpath("//section[@id='main']//table//h3")).getText().length() > 0);
	}

}
