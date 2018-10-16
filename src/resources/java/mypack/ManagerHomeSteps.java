package mypack;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;

public class ManagerHomeSteps {
	@Given("^navigates to add customer page$")
	public void navigates_to_add_customer_page() {
		// Write code here that turns the phrase above into concrete actions
		BaseClass.driver.findElement(By.xpath("//a[text()='New Customer']")).click();
	}
}
