package mypack;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Then;

public class CustomerUpdatePage {

	@Then("^The customer should see the sucess message \"([^\"]*)\"$")
	public void the_customer_should_see_the_sucess_message(String message) {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(message, BaseClass.driver.findElement(By.className("heading3")).getText());
	}
}
