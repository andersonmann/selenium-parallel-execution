/**
 * 
 */
package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import core.BasePage;

/**
 * @author anderson.mann
 *
 */
public class GoogleHomePage extends BasePage {

	public GoogleHomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = "q")
	@CacheLookup
	public WebElement field;
	@FindBy(name = "btnK")
	@CacheLookup
	public WebElement button;
	public void googleSearch(String text) {
		field.sendKeys(text);
		field.sendKeys(Keys.ENTER);
	}
	
	public void googleSearch1(String text) {
		write(field, text);
		field.sendKeys(Keys.ENTER);		
	}
	
	public void googleSearch2(String text) {
		escrever(By.name("q"), text);
		field.sendKeys(Keys.ENTER);
		
	}
}