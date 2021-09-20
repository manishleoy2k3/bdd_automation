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
	
	By logo = By.xpath("//div[@class='logo-desktop-only']//img[@alt='J.P. Morgan logo']");
	
	public WebElement getLogo() {
		return driver.findElement(logo);
	}
	
	public Boolean isLogoPresent() {
		WebElement i = getLogo();
		// Javascript executor to check logo image
		Boolean p = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);
		return p;
	}
}