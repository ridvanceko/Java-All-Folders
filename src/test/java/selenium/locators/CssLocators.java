package test.java.selenium.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CssLocators {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }


    @Test
    public void test1() {
        driver.get("https:/amazon.com");
     WebElement searchBox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
     searchBox.sendKeys("java programming");

    }


}
