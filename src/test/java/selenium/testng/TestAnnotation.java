package test.java.selenium.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class TestAnnotation {

    WebDriver driver;

    @BeforeClass //executed ONCE before class
    public void classSetup() {
        System.out.println("BEFORE CLASS hook is executed");
    }

    @AfterClass //executed ONCE after class
    public void classCleanup() {
        System.out.println("AFTER CLASS hook is executed");
    }


    @BeforeMethod //executed before EVERY @Test method in the class
    public void setup() {
        System.out.println("BEFORE METHOD hook is executed");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(); //ne need to WebDriver
    }


    @AfterMethod //executed after every @Test method in the class
    public void tearDown() {
        System.out.println("AFTER METHOD hook executed");
       // driver.quit();
    }


    @Test(priority = 10)
    public void googleTest() {
        System.out.println("Executing Google test");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        Assert.assertTrue(driver.getCurrentUrl().contains("google"));
    }

    @Test(priority = -60)
    public void amazonTest() {
        System.out.println("Executing Amazon test");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com/");

        Assert.assertTrue(driver.getCurrentUrl().contains("amazon"));
    }

}
