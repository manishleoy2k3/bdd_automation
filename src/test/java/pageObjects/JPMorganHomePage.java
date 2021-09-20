package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JPMorganHomePage {
	public WebDriver driver;

	public JPMorganHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	// J P Morgan logo locator
	By logo = By.xpath("//div[@class='logo-desktop-only']//img[@alt='J.P. Morgan logo']");
	
	// method to return the web element logo
	public WebElement getLogo() {
		return driver.findElement(logo);
	}
	
	// method to return the true or false depending on logo is present or not on J P Morgan Home page
	public Boolean isLogoPresent() {
		WebElement i = getLogo();
		// Javascript executor to check logo image
		Boolean p = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);
		return p;
	}
}