package mypack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageNat {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);
		goToPage("9");
	}

	public static void goToPage(String pageNum) {
		WebElement parEle = driver.findElement(By.xpath("//table[@id='nav']//tr"));
		List<WebElement> childTd = parEle.findElements(By.tagName("td"));

		for (int i = 0; i < childTd.size(); i++) {
			if (childTd.get(i).getText().equals(pageNum)) {
				childTd.get(i).click();
				break;
			}
		}

	}

}
