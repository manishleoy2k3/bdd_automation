package stepDefinitions;

import java.io.IOException;
import org.openqa.selenium.WebDriver;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {
	public WebDriver driver;

	// This is reusable code which will execute before each tests tagged as Smoke Tests
	@Before("@SmokeTest")
	public void beforeValidation() throws IOException {
		driver = Base.getDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}

	// This is reusable code which will execute after each tests tagged as Smoke Tests
	@After("@SmokeTest")
	public void afterValidation() throws IOException {
		driver.close();
	}
}