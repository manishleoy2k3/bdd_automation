package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	WebDriver driver;

	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
	}

	By searchFieldName = By.xpath("//input[@title='Search']");
	By firstSearchLink = By.xpath("//h3[normalize-space()='J.P. Morgan | Official Website']");
	
	public WebElement getSearchField() {
		return driver.findElement(searchFieldName);
	}
	
	public WebElement getFirstSearchLink() {
		return driver.findElement(firstSearchLink);
	}
}
