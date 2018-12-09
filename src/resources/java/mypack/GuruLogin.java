package mypack;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GuruLogin {
	static WebDriver driver;

	@Given("^The user is in demo guru page$")
	public void test() {
		// Write code here that turns the phrase above into concrete act
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");
	}

	@When("^The user enters valid username,password and clicks login button$")
	public void the_user_enters_valid_username_password_and_clicks_login_button() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("uid")).sendKeys("mngr161823");
		driver.findElement(By.name("password")).sendKeys("yzavunY");
		driver.findElement(By.name("btnLogin")).click();
	}

	@Then("^The user should be in managers home page$")
	public void the_user_should_be_in_managers_home_page() {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals("http://demo.guru99.com/v4/manager/Managerhomepage.php", driver.getCurrentUrl());
	}

	// @When("^The user enters valid username,password$")
	// public void the_user_enters_valid_username_password() {
	// driver.findElement(By.name("uid")).sendKeys("mngr161823");
	// driver.findElement(By.name("password")).sendKeys("yzavunY");
	// }

	@When("^The user enters valid username,password$")
	public void the_user_enters_valid_username_password(DataTable credential) {
		// List<String> credentialList = credential.asList(String.class);
		// driver.findElement(By.name("uid")).sendKeys(credentialList.get(0));
		// driver.findElement(By.name("password")).sendKeys(credentialList.get(1));
		// Map<String, String> credentialMap = credential.asMap(String.class,
		// String.class);
		// System.out.println(credentialMap);
		// driver.findElement(By.name("uid")).sendKeys(credentialMap.get("UserName"));
		// driver.findElement(By.name("password")).sendKeys(credentialMap.get("Password"));
		// List<List<String>> credentialLists =
		// credential.asLists(String.class);
		// System.out.println(credentialLists);
		// System.out.println(credentialLists.get(2).get(0));
		// System.out.println(credentialLists.get(1).get(1));
		// driver.findElement(By.name("uid")).sendKeys(credentialLists.get(0).get(0));
		// driver.findElement(By.name("password")).sendKeys(credentialLists.get(0).get(1));

		List<Map<String, String>> credentialMaps = credential.asMaps(String.class, String.class);
		System.out.println(credentialMaps);
		System.out.println(credentialMaps.get(1).get("password"));
		System.out.println(credentialMaps.get(3).get("username"));
		driver.findElement(By.name("uid")).sendKeys(credentialMaps.get(0).get("username"));
		driver.findElement(By.name("password")).sendKeys(credentialMaps.get(0).get("password"));
	}

	@When("^The user clicks the login button$")
	public void the_user_clicks_the_login_button() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("btnLogin")).click();
	}

	@Given("^The user navigates to add tarif plan page$")
	public void the_user_navigates_to_add_tarif_plan_page() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[text()='Telecom Project']")).click();
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("^The user enters the valid plan details \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enters_the_valid_plan_details_and(String monRent, String freeLocMins, String freeIntMins,
			String freeSMS, String localCharges, String IntCharges, String smsCharges) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("rental1")).sendKeys(monRent);
		driver.findElement(By.id("local_minutes")).sendKeys(freeLocMins);
		driver.findElement(By.id("inter_minutes")).sendKeys(freeIntMins);
		driver.findElement(By.id("sms_pack")).sendKeys(freeSMS);
		driver.findElement(By.id("minutes_charges")).sendKeys(localCharges);
		driver.findElement(By.id("inter_charges")).sendKeys(IntCharges);
		driver.findElement(By.id("sms_charges")).sendKeys(smsCharges);
	}

	@When("^The user clicks the submit button$")
	public void the_user_clicks_the_submit_button() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("submit")).click();
	}

	@Then("^The user should see the success message$")
	public void the_user_should_see_the_success_message() {
		// Write code here that turns the phrase above into concrete actions
		WebElement ele = driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']"));
		Assert.assertEquals("Congratulation you add Tariff Plan", ele.getText());
	}

}
