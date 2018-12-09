package mypack;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "@src/resources/java/mypack/failed.txt", glue = { "mypack" }, plugin = { "html:target" })
public class TestRunnerRerun {

}
