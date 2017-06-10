package runnerFile;


import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        strict = true,
        features = "src/test/java/testFeature/Test.feature",
        glue = "stepDefinition",
        tags = { },
        monochrome = false,
        plugin = {
                "pretty",
                "html:target/cucumber",
                "json:results/cucumber.json",
                "junit:results/cucumber.xml"
        }
        
        
       
)

public class RunCucumberTest {
	 
}
