package frameworkUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

    WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriver initiateDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //
        return driver;
    }

    public void closeDriver() {
        driver.close();
        driver.quit();
    }

    public void navigateURL(String url) throws InterruptedException {

        if(!url.isEmpty()) {
            driver.get(url);
            //
        }else {
            System.out.println("URL missing");
            driver.quit();
        }

    }


//
//	public void getScreenShot(WebDriver Driver) {
//
//		/* The below path needs to come from properties file */
//
//		String tempPath = getScreenShotFolderPath();
//		String finalPath = createFolder(tempPath);
//		try {
//			File scrFile = ((TakesScreenshot) Driver).getScreenshotAs(OutputType.FILE);
//			FileUtils.copyFile(scrFile, new File(finalPath + "\\" + ExecutionPreSetup.getScenarioName()+getCurrentTime() + ".jpeg"));
//
//		} catch (IOException e) {
//			e.printStackTrace();
//			System.out.println(e.getLocalizedMessage());
//		}
//	}


    /**
     * Returns Date and time in the given format
     *
     * @return
     */
    public String getCurrentTime() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HHmmssS");
        LocalDateTime now = LocalDateTime.now();
        String currentTime = dtf.format(now);
        // System.out.println()
        return currentTime;
    }

    /**
     * Returns the path of where the folder was requested to be created if
     * successfully created.
     *
     * @param path
     * @return
     */
    public String createFolder(String path) {
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

    public String getCurrentDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        String outputDate = dtf.format(now);
        //System.out.println(outputDate);
        return outputDate;
    }

    private String getScreenShotFolderPath() {

        Path path = Paths.get("Screenshots");
        String getScreenShotFolderPath = path.toAbsolutePath().toString();
        return getScreenShotFolderPath;
    }



    public  void scrollPage(WebDriver Driver, String direction) {
        JavascriptExecutor jse = (JavascriptExecutor)Driver;
        if(direction.equalsIgnoreCase("Down")) {
            jse.executeScript("window.scrollBy(0,250)");

        }else if(direction.equalsIgnoreCase("Up")) {
            jse.executeScript("window.scrollBy(0,-250)");

        }else {
            System.out.println("Error trying to scroll");
        }

        //WebDriver driver = new FirefoxDriver();
        //        JavascriptExecutor js = (JavascriptExecutor) driver;
        //Locating element by link text and store in variable "Element"
       // WebElement Element = driver.findElement(By.linkText("Try Selenium Testing For Free"));
        // Scrolling down the page till the element is found
        //        js.executeScript("arguments[0].scrollIntoView();", Element);


    }

    public void scrollUntilElementVisible(WebDriver Driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(Driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
        JavascriptExecutor jse = (JavascriptExecutor)Driver;
        jse.executeScript("arguments[0].scrollIntoView()",element);

    }
}
