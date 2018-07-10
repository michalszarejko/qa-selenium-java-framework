package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"}
        , glue = {"steps"}
        , snippets = SnippetType.CAMELCASE
        , monochrome = true
        , tags = {"@Smoke"}
)

public class SmokeTestRunner extends AbstractTestNGCucumberTests {

}