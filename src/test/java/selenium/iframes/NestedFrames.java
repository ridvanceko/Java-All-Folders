package test.java.selenium.iframes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class NestedFrames {
    WebDriver driver;
  //  Actions actions;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
     //   actions = new Actions(driver);
    }

    @Test
    public void test1() {
        driver.get("https://the-internet.herokuapp.com");

        WebElement frames = driver.findElement(By.xpath("//a[@href='/frames']"));
        frames.click();

        WebElement nestedFrames = driver.findElement(By.xpath("//a[@href='/nested_frames']"));
        nestedFrames.click();


        // switch the first frame
        driver.switchTo().frame("frame-top");

        // switch second inner frame by index
        driver.switchTo().frame(1);
        WebElement middle = driver.findElement(By.id("content"));
        System.out.println(middle.getText());



        // switch back to parent frame and to inner right frame
        driver.switchTo().parentFrame().switchTo().frame(2);
        WebElement body = driver.findElement(By.tagName("body"));
        System.out.println(body.getText());

        //////////////////////////////

        //  finds out number of iframes on the page

//       List<WebElement> iframe = driver.findElements(By.tagName("iframe"));
//        System.out.println(iframe.size());


    }
}
