package test.java.selenium.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarmUp {

    @Test
    public void test1() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        String expectedURL = "https://www.google.com/";
        String expectedTitle = "Google";

        System.out.println("Asserting the url");
        Assert.assertEquals(expectedURL, driver.getCurrentUrl());
        Assert.assertEquals(expectedTitle, driver.getTitle());

        Assert.assertEquals(2, 2);
        Assert.assertTrue(3>2);

        Assert.assertFalse(driver.getCurrentUrl().contains("facebook"));


    }
}
