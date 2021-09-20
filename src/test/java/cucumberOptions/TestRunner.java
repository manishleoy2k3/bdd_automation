package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// JUnit test Runner File to execute the tests suite
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",
				glue="stepDefinitions", stepNotifications = true,monochrome = true,
				plugin = {"pretty","html:target/cucumber.html","json:target/cucumber.json","junit:target/cukes.xml"})
public class TestRunner {
	
}