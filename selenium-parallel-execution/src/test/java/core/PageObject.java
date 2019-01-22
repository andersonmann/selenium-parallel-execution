/**
 * 
 */
package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author anderson.mann
 *
 */
public class PageObject {

	protected static WebDriver driver;

	public PageObject(WebDriver driver) {
		PageObject.driver = driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}
}