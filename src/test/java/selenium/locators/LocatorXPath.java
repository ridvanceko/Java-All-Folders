package test.java.selenium.locators;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXPath {

    @Test
    public void absoluteXpath() {
        //provide chrome drier location
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        // instantiate chrome browser object
        WebDriver driver = new ChromeDriver();
        // navigate to website
        driver.get("http://the-internet.herokuapp.com/");
        WebElement horizontalSliderLink = driver.findElement(By.linkText("Horizontal Slider"));
        horizontalSliderLink.click();
       WebElement header = driver.findElement(By.xpath("/html/body/div[2]/div/div/h3"));

        System.out.println(header.getText());



        Assert.assertEquals("Ceko", "Ridvan");
        Assert.assertEquals("Ceko", "Ceko");

        //Assert is import from JUnit library

    }





}