package Runner;

import io.cucumber.testng.CucumberOptions;
@CucumberOptions(tags = "@MagentoLogin")

//@MagentoLogin or @PHPPricing - this will run both
//@MagentoLogin and @PHPPricing - this will run only those that have both the tags on them

public class SimpleRunner extends testNGRunnerWithoutAbstractTestNGCucumberTests {



}
