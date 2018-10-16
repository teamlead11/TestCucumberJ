package stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Custom {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.id("lst-ib")).sendKeys("selenium", Keys.ENTER);
		//goToPage("8");
	}

	public  void goToPage() {
		WebElement parentElement = driver.findElement(By.xpath("//table[@id='nav']//tbody//tr"));
		List<WebElement> childElements = parentElement.findElements(By.tagName("td"));
		for (int i = 0; i < childElements.size(); i++) {
			if (childElements.get(i).getText().equals("11")) {
				childElements.get(i).click();
				break;
			}
		}
	}
}
