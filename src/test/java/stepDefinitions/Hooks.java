package stepDefinitions;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.jpmorgan.bdd_automation.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {
	public WebDriver driver;

	@Before("@SmokeTest")
	public void beforeValidation() throws IOException {
		driver = Base.getDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}

	@After("@SmokeTest")
	public void afterValidation() throws IOException {
		driver.close();
	}
}