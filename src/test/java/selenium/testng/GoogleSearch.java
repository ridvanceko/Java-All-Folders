package test.java.selenium.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class GoogleSearch {

    WebDriver driver;
    SoftAssert softAssert;
    Actions actions;

    @BeforeMethod
    public void setup(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        softAssert = new SoftAssert();
    }

    @Test
    public void googleSearchTest() throws InterruptedException {
        driver.get("https://google.com");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";

        softAssert.assertEquals(actualTitle, expectedTitle);

        WebElement searchBar = driver.findElement(By.name("g"));
        searchBar.sendKeys("java oca certification" + Keys.ENTER);
        Thread.sleep(2000);

        softAssert.assertTrue(driver.getCurrentUrl().contains("google"));
        WebElement results =  driver.findElement(By.id("result-stats"));
        String resultText = results.getText();
        System.out.println(resultText);

          softAssert.assertAll();

       String[] array =  resultText.split(" ");
       String resultNum = array[1].replace(",", "");

       int endResult = Integer.parseInt(resultNum);
       softAssert.assertTrue(endResult > 100000);


       softAssert.assertAll();

    }

    @AfterMethod
    public void cleanup() {
        driver.quit();
    }


}
