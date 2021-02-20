package test.java.selenium.screenshots;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenshotIntro {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @Test
    public void screenshotTest() throws IOException {

        driver.get("http://google.com");

       File firstScreenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
       String screenshotFolder = "screenshot/";
        FileUtils.copyFile(firstScreenshotFile,
                new File(screenshotFolder + "myScreenshot-" + System.currentTimeMillis()+ ".png"));

    }

    @Test
    public void screenshotTest2()  {

        driver.get("https://etsy.com");
        //if we want to explicitly fail
        Assert.fail();


    }

    @AfterMethod
    public void cleanup(ITestResult result) {
        //ITestResult help us understand if SS fail or pass
       if( !result.isSuccess()){
           takeScreenshot(result.getName());
       }
       driver.quit();

    }


    public void takeScreenshot(String screenshotName)  {
        // takes screenshot
       File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

       String screenshotDirectory = "screenshot/";
       //copy taken screenshot to screenshot directory

        try{
            FileUtils.copyFile(screenshot, new File(screenshotDirectory +
                    "screenshotName" + "-" + System.currentTimeMillis() + ".png"));
        } catch (IOException ex) {
            System.out.println("Screenshot was not taken");
            ex.printStackTrace();
            // printStackTrace will print out
        }



    }


}
