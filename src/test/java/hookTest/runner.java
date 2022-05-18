package hookTest;

import org.junit.runner.RunWith; 
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(features = "src/test/resources/features/hooks.feature", glue = { "hookTest",
"outline" }, monochrome = true, plugin = { "pretty", "html:target/reports/HTMLReports", "pretty",
		"json:target/reports/cucumber.json", "pretty", "junit:target/reports/cucumber.xml" }) 
 
public class runner { }