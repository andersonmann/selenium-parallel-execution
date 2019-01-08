package test;

import org.testng.annotations.Test;

import core.BaseTest;
import core.BrowserFactory;
import page.GoogleHomePage;

public class GoogleSearchTest extends BaseTest {

	@Test(priority = 0)
	public void searchOnGoogle0() {
		GoogleHomePage googleHome = new GoogleHomePage(driver);
		googleHome.googleSearch("Anderson Mann");
	}

	@Test(priority = 1)
	public void searchOnGoogle1() {
		GoogleHomePage googleHome = new GoogleHomePage(driver);
		googleHome.googleSearch1("g1");
	}

	@Test(priority = 2)
	public void searchOnGoogle2() {
		GoogleHomePage googleHome = new GoogleHomePage(driver);
		googleHome.googleSearch2("gauchazh");
	}
}