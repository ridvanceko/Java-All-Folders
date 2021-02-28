package test.java.selenium.synchronization;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitIntro {


    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void test() {
        driver.get("https://google.com");
        driver.findElements(By.id("foo"));
    }

    @Test

    public void test2() {
        driver.get("https://facebook.com");
        // explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.titleIs("Facebook"));
    }

    @Test

    public void test3() {
        driver.get("https://facebook.com");

        WebDriverWait wait = new WebDriverWait(driver, 10);

      //  WebElement applyButton = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("ceko"));
    }


    public WebElement locateMyElement(By locator) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement locatedElement = wait.until(ExpectedConditions.presenceOfElementLocated(locator));

        return locatedElement;

    }
}
