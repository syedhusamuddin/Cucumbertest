package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags="@test",
		features="src/test/resources/feature", 
		glue= {"stepdefination"},
		plugin = {"json:target/cucumber.json"})


public class testRunner {

}
