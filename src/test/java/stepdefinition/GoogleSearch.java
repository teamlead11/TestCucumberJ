package stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class GoogleSearch {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.id("lst-ib")).sendKeys("selenium", Keys.ENTER);
		goToPageNew("8");
	}

	public static void goToPage(String pageNum) {

		WebElement parentElement = driver.findElement(By.xpath("//table[@id='nav']//tr"));
		List<WebElement> childPages = parentElement.findElements(By.tagName("td"));
		int requiredIndex = 0;
		for (int i = 0; i < childPages.size(); i++) {
			if (childPages.get(i).getText().equals(pageNum)) {
				requiredIndex = i;
				break;
			}
		}

		childPages.get(requiredIndex).click();
	}

	public static void goToPageNew(String pageNum) {
		String locator = "//a[@aria-label='Page $']";
		locator = locator.replace("$", pageNum);
		driver.findElement(By.xpath(locator)).click();
		
//		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver){
//			
//		}
	}
}
