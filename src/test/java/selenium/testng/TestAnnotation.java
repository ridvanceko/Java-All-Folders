package test.java.selenium.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAnnotation {

    @Test(priority = 10)

    public void googleTest() {
        System.out.println("Executing Google test");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        Assert.assertTrue(driver.getCurrentUrl().contains("google"));
    }

    @Test(priority = 60)

    public void amazonTest() {
        System.out.println("Executing Amazon test");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com/");

        Assert.assertTrue(driver.getCurrentUrl().contains("amazon"));
    }

}
