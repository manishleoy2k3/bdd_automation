package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//TestNG test Runner File to execute the tests suite
@CucumberOptions(features="src/test/java/features",
glue="stepDefinitions")
public class TestngTestRunner extends AbstractTestNGCucumberTests{

}
