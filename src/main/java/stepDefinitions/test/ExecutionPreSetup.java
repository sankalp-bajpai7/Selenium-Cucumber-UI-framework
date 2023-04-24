package stepDefinitions.test;

import frameworkUtils.YamlData;
import org.openqa.selenium.WebDriver;

import helperUtils.HelperBaseInterface;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.yaml.snakeyaml.Yaml;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class ExecutionPreSetup implements HelperBaseInterface {

    public static WebDriver Driver;
    private Map<String, Object> scenarioData;
    private static Map<String, Map<String, String>> data = new HashMap<>();



    public static WebDriver getBaseDriver() {
        return Driver;
    }

    public static String scenarioName = null;

    public static String getScenarioName() {
        return scenarioName;
    }

    public static void setScenarioName(String scenarioName) {
        ExecutionPreSetup.scenarioName = scenarioName;
    }

    public static Map<String, String> getData(String scenarioName) {
        return data.get(scenarioName);
    }

    @Before
    public void setUpBrowser(io.cucumber.java.Scenario scenario) throws FileNotFoundException {
        Driver = initializeBrowser(Driver,"Chrome");

        //setDriver(Driver);
        scenarioName = scenario.getName();
        //	System.out.println(scenarioName);
        Yaml yaml = new Yaml();
        InputStream inputStream = new FileInputStream("src/main/resources/testdata.yaml");
        data = yaml.load(inputStream);
       // System.out.println(data);
    }







        @After
    public  void stopDriver() {
        //Driver = getDriver();
        //Driver.close();
       // Driver.quit();

    }


}
