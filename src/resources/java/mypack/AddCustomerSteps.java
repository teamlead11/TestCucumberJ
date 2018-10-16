package mypack;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomerSteps {

	@When("^The user enters customer details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enters_customer_details_and(String custname, String gendre, String dob, String adress,
			String city, String state, String pin, String phnum, String email, String pass) {
		BaseClass.driver.findElement(By.name("name")).sendKeys(custname);
		BaseClass.driver.findElement(By.xpath("//input[@name='rad1' and @value='m']")).click();
		BaseClass.driver.findElement(By.id("dob")).sendKeys(dob);
		BaseClass.driver.findElement(By.name("addr")).sendKeys(adress);
		BaseClass.driver.findElement(By.name("city")).sendKeys(city);
		BaseClass.driver.findElement(By.name("state")).sendKeys(state);
		BaseClass.driver.findElement(By.name("pinno")).sendKeys(pin);
		BaseClass.driver.findElement(By.name("telephoneno")).sendKeys(phnum);
		BaseClass.driver.findElement(By.name("emailid")).sendKeys(email);
		BaseClass.driver.findElement(By.name("password")).sendKeys(pass);

	}

	@When("^The user click reset button$")
	public void the_user_click_reset_button() {
		// Write code here that turns the phrase above into concrete actions
		BaseClass.driver.findElement(By.name("btnReset")).click();
	}

	@Then("^The user should be in add customer page$")
	public void the_user_should_see_the_success_message() {
		// Write code here that turns the phrase above into concrete actions
		String out1 = BaseClass.driver.findElement(By.xpath("//p[@class='heading3']")).getText();
		Assert.assertEquals("Add New Customer", out1);
		Assert.assertTrue(BaseClass.driver.getCurrentUrl().contains("addcustomerpage"));
	}

}
