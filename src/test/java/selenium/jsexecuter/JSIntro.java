package test.java.selenium.jsexecuter;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JSIntro {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @Test
    public void test1() {
        // casting my driver js executer??
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.location='https://amazon.com'");
        WebElement searchBar = (WebElement)js.executeScript("return document.getElementByID('twotabsearchtextbox')");

       searchBar.sendKeys("iphone 12");

    }

    @Test
    public void scrollTest() {
        driver.get("https://amazon.com");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, 600)");
    }
}
