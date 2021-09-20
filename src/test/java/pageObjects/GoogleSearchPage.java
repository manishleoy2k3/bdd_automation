package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	WebDriver driver;

	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
	}

	// google search field locator
	By searchFieldName = By.xpath("//input[@title='Search']");
	
	// search results first link locators
	By firstSearchLink = By.xpath("//h3[normalize-space()='J.P. Morgan | Official Website']");
	
	// method to return the web element for search field
	public WebElement getSearchField() {
		return driver.findElement(searchFieldName);
	}
	
	// method to return the web element for first link of search results
	public WebElement getFirstSearchLink() {
		return driver.findElement(firstSearchLink);
	}
}
