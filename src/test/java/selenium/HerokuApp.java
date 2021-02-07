package test.java.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HerokuApp {

    @Test
    public void abTest() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement abTestLink = driver.findElement(By.xpath("//a[@href='/abtest']"));
        abTestLink.sendKeys(Keys.ENTER);
        abTestLink.click();
        String title = driver.getTitle();
        System.out.println("AB test page's title is " + title);

    }

    @Test
    public void dropDownTest() {
        //provide chrome drier location
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        // instantiate chrome browser object
        WebDriver driver = new ChromeDriver();
        // navigate to website
        driver.get("http://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        // locate web element
        WebElement dropdownLink = driver.findElement(By.xpath("//a[@href='/dropdown']"));

        String dropdownText = dropdownLink.getText();
        System.out.println(dropdownText);
    }

    //driver.manage().window().maximize();

    // driver.getTitle();

    //driver.navigate().back();


}