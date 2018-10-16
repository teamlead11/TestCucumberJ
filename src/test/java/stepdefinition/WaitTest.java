package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTest {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://demoqa.com/registration/");
		WebElement myele = driver.findElement(By.id("name_3_firstname"));
		driver.findElement(By.id("name_3_lastname")).sendKeys("tech");

		By byele = By.id("name_3_lastname");
		System.out.println(byele);
		System.out.println(myele);

		driver.findElement(byele);

		WebDriverWait waitobj = new WebDriverWait(driver, 10);
		waitobj.until(ExpectedConditions.visibilityOf(myele));
	}

}
