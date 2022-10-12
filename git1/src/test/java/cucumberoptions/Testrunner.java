package cucumberoptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features",
	    glue = "stepdefinition", stepNotifications= true, plugin = {"pretty", "html:target/cucumber.html"}, tags = "@ebay1")
public class Testrunner {

}
