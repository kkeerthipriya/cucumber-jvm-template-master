package step_definitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features/onlyscenario.feature",
		plugin = {"pretty", "html:target/cucumber-html-report"},
		tags = "@basicscenario1"
		)
public class RunCukesTest{

}