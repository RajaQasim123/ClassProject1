package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="feature",
glue="stepDefinition",
dryRun=false,
plugin= {
		"pretty","htmlLreport/cucumber",
		"json.report/cucumber.json,"},
		
		monochrome=true)

public class TestRunner {

}
