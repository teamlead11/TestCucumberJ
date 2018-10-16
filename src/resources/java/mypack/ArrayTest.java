package mypack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayTest {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement elemtref = driver.findElement(By.id("lst-ib"));
		// driver.navigate().refresh();
		String xyz = elemtref.getAttribute("xyz");
		System.out.println(xyz.charAt(0));
		driver.close();
		

		// List<String> testlist = new ArrayList<String>();
		// testlist.add("A");
		// testlist.add("X");
		// testlist.add("M");
		// testlist.add("M");
		// System.out.println(testlist);
		//
		// Set<String> testSet = new HashSet<String>(testlist);
		//
		// System.out.println(testSet);

	}

}
