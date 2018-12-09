package mypack;

import java.util.Map;

import org.openqa.selenium.By;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;

public class HomePageSteps {

	@Given("^The user logins to guru home page$")
	public void the_user_logins_to_guru_home_page(DataTable credentials) {
		Map<String, String> credentialMap = credentials.asMap(String.class, String.class);
		BaseClass.driver.findElement(By.name("uid")).sendKeys(credentialMap.get("username"));
		BaseClass.driver.findElement(By.name("password")).sendKeys(credentialMap.get("password"));
		BaseClass.driver.findElement(By.name("btnLogin")).click();
	}
}
