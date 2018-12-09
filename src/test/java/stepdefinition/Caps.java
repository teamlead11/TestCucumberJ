package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Caps {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver_win32\\chromedriver.exe");
		options.merge(caps);
		driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
	}

}
