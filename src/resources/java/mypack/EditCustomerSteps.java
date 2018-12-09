package mypack;

import java.util.Map;

import org.openqa.selenium.By;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class EditCustomerSteps {
	@Given("^The user enters the customer ID$")
	public void the_user_enters_the_customer_ID(DataTable custId) {
		Map<String, String> custIdMap = custId.asMap(String.class, String.class);
		BaseClass.driver.findElement(By.name("cusid")).sendKeys(custIdMap.get("custID"));
		BaseClass.driver.findElement(By.name("AccSubmit")).click();
	}

	@When("^The user modify the phone number$")
	public void the_user_modify_the_phone_number(DataTable phnum) {
		Map<String, String> custIDMap = phnum.asMap(String.class, String.class);
		BaseClass.driver.findElement(By.name("telephoneno")).clear();
		BaseClass.driver.findElement(By.name("telephoneno")).sendKeys(custIDMap.get("PhoneNumber"));

	}
}
