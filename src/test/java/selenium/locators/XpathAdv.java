package test.java.selenium.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAdv {

    @Test
    public void test1() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement checkbox1 = driver.findElement
                (By.xpath("//input[@type='checkbox']/preceding-sibling::input"));

        checkbox1.click();

        boolean isChecked = checkbox1.isSelected();
        Assert.assertTrue(isChecked);
        System.out.println("Checkbox 1: " + isChecked);


    }

    @Test
    public void test2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement checkbox2 = driver.findElement
                (By.xpath("//input[@type='checkbox']/input[1]/following-sibling::input"));

        checkbox2.click();

        boolean isChecked2 = checkbox2.isSelected();
        Assert.assertTrue(isChecked2);
        System.out.println("Checkbox 2: " + isChecked2);


    }


}
