package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"pretty", "html:Reports/htmlReport.html", "json:Reports/jsonReport.json"},
        features = "resources/features",
        glue = "stepDefinitions",
        tags = "@Smoke"
)
public class SmokeTestRunner {
}
