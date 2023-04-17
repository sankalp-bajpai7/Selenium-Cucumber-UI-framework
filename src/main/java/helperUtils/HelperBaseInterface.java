package helperUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import frameworkUtils.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import stepDefinitions.test.ExecutionPreSetup;

public interface HelperBaseInterface {

        BaseClass bc = new BaseClass();

        public default void waitNow(WebDriver Driver) {

        }


        public default  WebDriver initializeBrowser(WebDriver Driver,String browserName) {
            if(browserName.equals("Chrome")){
                WebDriverManager.chromedriver().setup();
                Driver = new ChromeDriver();
                Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
                Driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
            }else if(browserName.equals("Edge")) {
                WebDriverManager.edgedriver().setup();
                Driver = new EdgeDriver();
                Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            }else if(browserName.equals("FireFox")) {
                WebDriverManager.firefoxdriver().setup();
                Driver = new FirefoxDriver();
                Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            }
            Driver.manage().window().maximize();
            return Driver;
        }

    /**
     * Need to see if this can be used
     * @param <T>
     * @param driver
     * @param c
     * @return
     * @throws SecurityException
     */
    public default <T> Object InitializePageFactory(WebDriver driver, Class <T> c ) throws  SecurityException {
        return PageFactory.initElements(driver,c);
    }


    public default void stopDriver(WebDriver Driver) {
        Driver.close();
        Driver.quit();
    }

    /**
     * @param Driver
     * @param url
     * @throws InterruptedException
     */
    public default void navigateURL(WebDriver Driver,String url) throws InterruptedException {

        if(!url.isEmpty()) {
            Driver.get(url);
            //	bc.waitShort();
        }else {
            System.out.println("URL missing");
            Driver.quit();
        }

    }

    public static void getScreenShot(WebDriver Driver) {


        /* The below path needs to come from properties file */

        String tempPath = getScreenShotFolderPath();
        String finalPath = createFolder(tempPath);
        try {
            File scrFile = ((TakesScreenshot) Driver).getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(scrFile, new File(finalPath + "\\" + ExecutionPreSetup.getScenarioName()+getCurrentTime() + ".jpeg"));

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getLocalizedMessage());
        }
    }

    /**
     * Returns Date and time in the given format
     *
     * @return
     */
    static String getCurrentTime() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HHmmssS");
        LocalDateTime now = LocalDateTime.now();
        String currentTime = dtf.format(now);
        // System.out.println()
        return currentTime;
    }
    static String createFolder(String path) {
        String finalPath = path + "\\" + getCurrentDate();
        // System.out.println(finalPath);
        try {
            /*
             * the below command will create a new directory only if the existing new
             * directory does not already exist.
             */
            Files.createDirectories(Paths.get(finalPath));
        } catch (IOException e) {

            e.printStackTrace();
        }

        return finalPath;
    }

    static String getCurrentDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        String outputDate = dtf.format(now);
        //System.out.println(outputDate);
        return outputDate;
    }

    static String getScreenShotFolderPath() {

        Path path = Paths.get("Screenshots");
        String getScreenShotFolderPath = path.toAbsolutePath().toString();
        return getScreenShotFolderPath;
    }


}
