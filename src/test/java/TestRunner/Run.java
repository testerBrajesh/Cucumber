package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = ".//Features//Customer.feature",

		glue = "StepDefinition",

		dryRun = false, 
		monochrome = true, plugin = { "pretty", "html:target/cucumber-reports/report.html", "pretty",
				"json:target/cucumber-reports/report_json.json", "pretty",
				"junit:target/cucumber-re"
				+ "ports/report_xml.xml" })

public class Run {
}
