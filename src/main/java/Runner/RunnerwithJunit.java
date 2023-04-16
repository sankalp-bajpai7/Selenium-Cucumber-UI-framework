package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/main/java/features",
        glue={"stepDefinitions"},
        tags="@Test",
        plugin={
                "pretty", // gives you details on the individual step definitions for the corresponding scenario
                "html:ExecutionReport.html", //Ex: html:target/sampleFolder/execReport.html (generates html report)
                "json:executionReport.json",
                "rerun:target/failedRerun.txt"
        },//Ex: json generates a json that can be used for reporting by any library or framework

        dryRun=false,
        monochrome=true,
        publish=false
)

public class RunnerwithJunit {
}

