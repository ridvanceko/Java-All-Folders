package test.java.selenium.iframes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IFrameIntro {

    WebDriver driver;
    Actions actions;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        actions = new Actions(driver);
    }

    @Test
    public void test1() {
        driver.get("https://the-internet.herokuapp.com/iframe");

       driver.switchTo().frame("mce_0_ifr");

        WebElement textBox = driver.findElement(By.id("tinymce"));
        textBox.clear();
        textBox.sendKeys("Hello World");

        driver.switchTo().parentFrame();     // switch back to parent frame
     //   driver.switchTo().defaultContent();

        WebElement header = driver.findElement(By.tagName("h3"));
        System.out.println(header.getText());



    }

}
