package test.java.selenium.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class EtsySearchJava {

    private WebDriver driver;
    private SoftAssert softAssert;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        // Finance doesn't use because of security concern
        driver = new ChromeDriver();

    }

    @Test
    @Parameters({"searchCriteria"})
    public void etsySearch(String etsySearchText) {
        //without @Parameters we cannot have arguments
        driver.navigate().to("https:/etsy.com");
        Assert.assertTrue(driver.getCurrentUrl().contains("etsy"));

        WebElement searchBox = driver.findElement(By.id("global-enhancements-search-query"));
        searchBox.sendKeys(etsySearchText);
        driver.findElement(By.xpath("//button[@value='Search']")).click();

        List<WebElement> itemLinks = driver.findElements
        (By.xpath("//h3[@class='text-gray text-truncate mb--xs-0 text-body']"));

        //java programming mug
        String[] strArr = etsySearchText.split(" ");
        String java = strArr[0];
        String programming = strArr[1];
        String mug = strArr[2];


        for(WebElement itemLink: itemLinks) {
            String temp = itemLink.getText();
            System.out.println(temp);

            softAssert.assertTrue(temp.contains("java") ||
                    temp.contains(programming) || temp.contains(mug));
        }

        softAssert.assertAll();


    }

}
