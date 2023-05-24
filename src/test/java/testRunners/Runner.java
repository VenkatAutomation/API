package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFiles/Rest.feature",glue="stepDefinations",dryRun=false
				,plugin = {"json:target/jsonReports/cucumber-report.json"}
				)
public class Runner {

}
