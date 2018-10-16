package stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomTest extends Custom {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver_win32\\chromedriver.exe");
		// driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		WebElement oldelement1 = driver.findElement(By.id("lst-ib"));
		driver.navigate().refresh();
		WebElement oldelement2 = driver.findElement(By.id("lst-ib"));
		oldelement2.sendKeys("test");

	}

	public static void goToPageyahoo(String pagnum) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://in.search.yahoo.com/");
		driver.findElement(By.id("yschsp")).sendKeys("selenium", Keys.ENTER);
		WebElement parentElement = driver.findElement(By.xpath("//div[@class='compPagination']"));
		List<WebElement> childPages = parentElement.findElements(By.tagName("a"));
		for (int i = 0; i < childPages.size(); i++) {
			if (childPages.get(i).getText().equals(pagnum)) {
				childPages.get(i).click();
				break;
			}
		}
	}

	public static void goToPagegoogle(String pagnum) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.id("lst-ib")).sendKeys("selenium", Keys.ENTER);
		WebElement parentElement = driver.findElement(By.xpath("//table[@id='nav']//tr"));
		List<WebElement> childElements = parentElement.findElements(By.xpath("//td//a"));
		System.out.println(childElements.size());
		for (int i = 0; i < childElements.size() - 1; i++) {
			if (childElements.get(i).getText().equals(pagnum)) {
				childElements.get(i).click();
				break;
			}
		}
	}

	public static void goToPagegoogleNew(String pagnum) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.id("lst-ib")).sendKeys("selenium", Keys.ENTER);
		String locator = "//a[@aria-label='Page $']";
		locator = locator.replace("$", pagnum);
		driver.findElement(By.xpath(locator)).click();
	}

	public  void goToPage(String pagnum) {
		System.out.println("modification based on my class");

	}
}