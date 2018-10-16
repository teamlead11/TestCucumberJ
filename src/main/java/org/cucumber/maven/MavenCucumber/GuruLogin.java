package org.cucumber.maven.MavenCucumber;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GuruLogin {
	static WebDriver driver;

	@BeforeClass
	public static void browserlaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver_win32\\chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/v4/");
	}

	@Test
	public  void loginTest() {
		driver.findElement(By.name("uid")).sendKeys("mngr154050");
		driver.findElement(By.name("password")).sendKeys("zamynEs");
		driver.findElement(By.name("btnLogin")).click();
		Assert.assertEquals("Welcome To Manager's Page of Guru99 Bank", driver.findElement(By.tagName("marquee")));
	}
}
