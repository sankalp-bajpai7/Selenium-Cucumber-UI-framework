package frameworkUtils;

public class ExcelReader {

    public String getDataforScenario(String scenarioName) {
        String testdata=null;

        if(scenarioName.equalsIgnoreCase("Retrieve Data from the cucumberScenario")) {
            testdata="test";
        }

        return testdata;
    }
}
