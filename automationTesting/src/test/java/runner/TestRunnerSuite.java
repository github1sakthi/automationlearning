package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features = "features", glue = { "stepDefinitions" }, tags = { "@WindowHandlerTest,@GmailLoginTest,@OrbitzFlightSearchTest,@QuestDiagnosisAppointmentBookingTest" }, plugin = { "pretty",
	//	"html:target/cucumber-reports"} , monochrome=true)
@CucumberOptions(features = "features", glue = { "stepDefinitions" }, tags = { "@OrbitzFlightSearchTest" }, plugin = { "pretty",
"html:target/cucumber-reports"} , monochrome=true)

public class TestRunnerSuite {

}
