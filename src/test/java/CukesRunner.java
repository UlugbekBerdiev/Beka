import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                  "html:target/default-cucumber-reports"
        },

        features = "src/test/resources/features",
        glue = "step_definitions",
        tags = {"@regression"}

)
public class CukesRunner {

}
