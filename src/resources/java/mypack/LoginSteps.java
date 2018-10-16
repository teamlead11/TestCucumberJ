package mypack;

import java.util.Map;

import org.openqa.selenium.By;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;

public class LoginSteps {

	@Given("^The user login with the valid credentials$")
	public void the_user_login_with_the_valid_credentials(DataTable credentials) {
		Map<String, String> credentialMap = credentials.asMap(String.class, String.class);
		BaseClass.driver.findElement(By.name("uid")).sendKeys(credentialMap.get("username"));
		BaseClass.driver.findElement(By.name("password")).sendKeys(credentialMap.get("password"));
		BaseClass.driver.findElement(By.name("btnLogin")).click();
	}
}
