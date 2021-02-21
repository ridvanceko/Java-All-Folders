package test.java.selenium.testng.homework5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDrop {

    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }


    @Test
    public void boxDisplayed() {

        driver.navigate().to("https://demos.telerik.com/kendo-ui/dragdrop/area");
        Assert.assertTrue(driver.getCurrentUrl().contains("dragdrop"));

        WebElement circle = driver.findElement(By.id("draggable"));
        WebElement blueBox = driver.findElement(By.xpath("//div[@id='droptarget']/div[@class='test1']"));

        Actions actions = new Actions(driver);
        Action dragAndDrop = actions.clickAndHold(circle).moveToElement(blueBox).release().build();

        dragAndDrop.perform();

        String text = toString();
        if(text.equals("You did great!")) {
            System.out.println("PASS: File is dropped to target as expected");
        }else {
            System.out.println("FAIL: File couldn't be dropped to target as expected");
        }
        driver.close();
    }






    }


