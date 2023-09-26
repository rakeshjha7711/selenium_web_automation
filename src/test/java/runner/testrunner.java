package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", // Path to your feature files
        glue = "step_definitions", // Package where your step definitions are located
        plugin = {"pretty", "html:target/cucumber-reports"} // Plugins for reporting
)
public class testrunner {
}
