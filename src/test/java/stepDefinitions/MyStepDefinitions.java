package stepDefinitions;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import base.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.GoogleSearchPage;
import pageObjects.JPMorganHomePage;

@RunWith(Cucumber.class)
public class MyStepDefinitions extends Base {

	GoogleSearchPage gp;
	JPMorganHomePage jp;

	@Given("^User is on google search (.+) page$")
	public void user_is_on_google_search_page(String searchPageTitle) throws Throwable {
		Assert.assertEquals(searchPageTitle, driver.getTitle());
	}

	@When("^User searched for (.+) Text$")
	public void user_searched_for_text(String searchText) throws Throwable {
		gp = new GoogleSearchPage(driver);
		WebElement el = gp.getSearchField();
		el.sendKeys(searchText);
		el.sendKeys(Keys.ENTER);
	}

	@Then("^Search results (.+) are displayed$")
	public void search_results_are_displayed(String searchResultPageTitle) throws Throwable {
		Assert.assertEquals(searchResultPageTitle, driver.getTitle());
	}

	@And("^User clicks on first result link$")
	public void user_clicks_on_first_result_link() throws Throwable {
		gp.getFirstSearchLink().click();
	}

	@And("^J P Morgan Home page \"([^\"]*)\" is shown$")
	public void j_p_morgan_home_page_is_shown(String jpMorganHomePage) throws Throwable {
		Assert.assertEquals(jpMorganHomePage, driver.getTitle());
	}
	
	
	@Given("^User is on (.+) Home page$")
	public void user_is_on_j_p_morgan_home_page(String jpMorganPage) {
		gp = new GoogleSearchPage(driver);
		WebElement el = gp.getSearchField();
		el.sendKeys(jpMorganPage);
		el.sendKeys(Keys.ENTER);
		gp.getFirstSearchLink().click();
	}
	
	@When("^User clicks on J P Morgan logo$")
	public void user_clicks_on_j_p_morgan_logo() {
		jp = new JPMorganHomePage(driver);
		jp.getLogo().click();
	}
	@Then("^Verify the J P Morgan logo is present$")
	public void verify_the_j_p_morgan_logo_is_present() {
		// verify Logo
		Assert.assertTrue(jp.isLogoPresent());
	}
}
