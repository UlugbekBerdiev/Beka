package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(



        plugin = {"json:target/cucumber.json",
        "html:target/default-cucumber-reports"
},

        features = "resources/features",
        glue = "stepDefinitions",
        tags = "@Smoke"
)
public class SmokeTestRunner {
}
