package mypack;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/resources/java/mypack/EditCustomer.feature", dryRun = false, glue = {
		"mypack" }, plugin = { "json:src/resources/java/cucumberReportNew.json" })

public class NewTestRunner {

}
