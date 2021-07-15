package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/resources" },
        glue = { "step_definitions" },
        tags = {"@test"}
)

public class CukesRun {
}
