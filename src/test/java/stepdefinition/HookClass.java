package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookClass {
	static WebDriver driver;

	//@Before
	public static void beforeMethod() {

		System.out.println("before method no priority");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	//@Before(order = 1)
	public static void beforeMethod1() {

		System.out.println("before method 1st priority");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	//@Before("@smoke")
	public static void beforeMethodtag() {

		System.out.println("before method 1st priority");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}


	//@After
	public static void afterMethod() {
		System.out.println("after method");
		driver.close();
		driver.quit();
	}
}
