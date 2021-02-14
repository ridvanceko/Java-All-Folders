package test.java.selenium.dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;



public class SelectDropDown {

    @Test

    public void test() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://learn.letskodeit.com/p/practice");
        WebElement dropDown = driver.findElement(By.id("carselect"));

        // selectByVisibleText
        Select dropDownHandler = new Select(dropDown);
        dropDownHandler.selectByVisibleText("Honda");

        // selectByIndex
        WebElement selectedOption = dropDownHandler.getFirstSelectedOption();
        Assert.assertEquals("Honda", selectedOption.getText());

        // selectByValue

    }

    @Test

    public void test1() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://learn.letskodeit.com/p/practice");
        WebElement dropDown = driver.findElement(By.id("carselect"));

        Select dropDownHandler = new Select(dropDown);
        dropDownHandler.selectByValue("benz");

       WebElement firstSelectedOption =  dropDownHandler.getFirstSelectedOption();
       Assert.assertEquals("Benz", firstSelectedOption.getText());


    }

    @Test

    public void test2() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");
        WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));

        Select dropDownHandler = new Select(dropDown);
        dropDownHandler.selectByValue("search-alias=instant-video");

        WebElement firstSelectedOption = dropDownHandler.getFirstSelectedOption();
        Assert.assertEquals("Prime Video", firstSelectedOption.getText());

    }


}
