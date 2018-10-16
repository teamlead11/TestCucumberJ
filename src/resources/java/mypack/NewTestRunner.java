package mypack;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/resources/java/mypack/AddCustomer.feature", monochrome = true, dryRun = false, strict = true, glue = {
		"mypack" }, plugin = { "json:target/cucumbReport.json" })

public class NewTestRunner {

}
