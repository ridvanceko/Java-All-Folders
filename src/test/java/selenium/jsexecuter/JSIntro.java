package test.java.selenium.jsexecuter;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
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

    @Test
    public void scrollTest2() {
        driver.get("https://amazon.com");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, document.body.scrollHeight)"); //scroll all the way down to page
    }

    @Test
    public void scrollTest3() {
        driver.get("https://amazon.com");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement mustSeeDeals = driver.findElement(By.xpath("//h2[.='Must-see fashion deals']"));
        js.executeScript("argument[0].scrollIntoView();", mustSeeDeals);
    }


}
