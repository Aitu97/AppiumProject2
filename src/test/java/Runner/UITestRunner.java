package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumberHTML-report","pretty","json:target/cucumber.json"},
        features = {"src/test/java/resources/UIFeatures"},
        glue = "stepDefs",
        dryRun =false,
       tags ="@TECTC-100"
)
//src/test/resources/uiFeatures
public class UITestRunner {


}
