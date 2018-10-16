package mypack;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewCustomer {
	@Given("^The user logged in as manager with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_logged_in_as_manager_with_and(String mngrid, String mngrpass) {
		BaseClass.driver.findElement(By.name("uid")).sendKeys(mngrid);
		BaseClass.driver.findElement(By.name("password")).sendKeys(mngrpass);
		BaseClass.driver.findElement(By.name("btnLogin")).click();
	}

	@Given("^The user navigate to new customer page$")
	public void the_user_navigate_to_new_customer_page() {
		BaseClass.driver.findElement(By.xpath("//a[text()='New Customer']")).click();
	}

	@When("^The user enters the customer details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enters_the_customer_details_and(String custname, String gender, String DOB, String Adress,
			String city, String state, String pin, String phnum, String email, String pass) {
		// Write code here that turns the phrase above into concrete actions
		BaseClass.driver.findElement(By.name("name")).sendKeys(custname);
		BaseClass.driver.findElement(By.xpath("//input[@name='rad1' and @value='m']")).click();
		BaseClass.driver.findElement(By.id("dob")).sendKeys(DOB);
		BaseClass.driver.findElement(By.name("addr")).sendKeys(Adress);
		BaseClass.driver.findElement(By.name("city")).sendKeys(city);
		BaseClass.driver.findElement(By.name("state")).sendKeys(state);
		BaseClass.driver.findElement(By.name("pinno")).sendKeys(pin);
		BaseClass.driver.findElement(By.name("telephoneno")).sendKeys(phnum);
		BaseClass.driver.findElement(By.name("emailid")).sendKeys(email);
		BaseClass.driver.findElement(By.name("password")).sendKeys(pass);

	}

	@When("^The user clicks the reset button$")
	public void the_user_submit_the_form() {
		// Write code here that turns the phrase above into concrete actions
		BaseClass.driver.findElement(By.name("res")).click();
	}

	//@Then("^The user should be in add customer page$")
	public void the_user_should_see_the_success_message() {
		// Write code here that turns the phrase above into concrete actions
		String out1 = BaseClass.driver.findElement(By.xpath("//p[@class='heading3']")).getText();
		Assert.assertEquals("Add New Customer", out1);
		Assert.assertTrue(BaseClass.driver.getCurrentUrl().contains("addcustomerpage"));
	}

	@Given("^The user logged in as manager with credentials$")
	public void the_user_logged_in_as_manager_with_credentials(DataTable credential) {
		Map<String, String> crdntlMap = credential.asMap(String.class, String.class);

		BaseClass.driver.findElement(By.name("uid")).sendKeys(crdntlMap.get("mangerUserID"));
		BaseClass.driver.findElement(By.name("password")).sendKeys(crdntlMap.get("password"));
		BaseClass.driver.findElement(By.name("btnLogin")).click();
	}

}
