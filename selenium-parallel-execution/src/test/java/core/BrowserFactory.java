package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BrowserFactory {
	final static String url = "https://www.google.com.br/";
	public static WebDriver driver;

	@Parameters("browser")
	@BeforeMethod
	public synchronized static void initDriver(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver");
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
	}

	@AfterMethod
	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}