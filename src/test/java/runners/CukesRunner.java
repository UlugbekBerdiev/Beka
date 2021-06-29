package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                  "html:target/default-cucumber-reports"
        },

        features = "src/test/resources",
        glue = "stepDefinitions",
        tags = {"@regression"}

)
public class CukesRunner {

}
