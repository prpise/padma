package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features={"src/main/resources/sample4.feature"},
		glue="stepdefinition",
		plugin="json:target/cucumber.json")
		//plugin="html:target/htmlreport")
		//tags={"@smoke"})

public class RunnerClass {

}


