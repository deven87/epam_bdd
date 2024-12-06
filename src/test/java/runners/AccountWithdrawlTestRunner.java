package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/**
 * AccountWithdrawlTestRunner runner class to run cucumber feature using testng
 */
@CucumberOptions(features = "src/test/resources/features", glue = "steps", tags = "@account_withdrawl",
plugin = { "pretty", "html:target/cucumberreport.html", "json:target/cucumberreport.json",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
dryRun = false
		)
public class AccountWithdrawlTestRunner extends AbstractTestNGCucumberTests {


}
