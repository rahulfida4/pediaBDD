package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/Rahul Sinha/Downloads/BDD/FreeMyPediaV3/src/main/java/Features/login.feature"
,glue={"StepDefination"},
format={"pretty","html:test-output"},// used to generate reporting format// pretty --proper format
monochrome=true,
strict=true,
dryRun=true
)

public class TestRunner{

	
}
