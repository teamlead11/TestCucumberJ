package mypack;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;

public class ManagerHomePageSteps {

	@Given("^The user navigates to edit customer page$")
	public void the_user_navigates_to_edit_customer_page() {
		// Write code here that turns the phrase above into concrete actions
		BaseClass.driver.findElement(By.xpath("//a[text()='Edit Customer']")).click();
	}
}
