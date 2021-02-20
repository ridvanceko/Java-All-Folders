package test.java.selenium.screenshots;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenshotTask {

    WebDriver driver;
    Actions actions;
    ScreenshotIntro screenshotIntro;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        actions = new Actions(driver);
        screenshotIntro = new ScreenshotIntro();
    }



    @Test
    public void horizontalSlider() {

        driver.get("https://the-internet.herokuapp.com/");
        screenshotIntro.takeScreenshot("hrekuappHomePage");

        WebElement horizontalSlider = driver.findElement(By.linkText("Horizontal Slider"));
        actions.click(horizontalSlider).perform();

        screenshotIntro.takeScreenshot("horizontalSliderPage");
        WebElement slider = driver.findElement(By.tagName("input"));
        actions.clickAndHold(slider).moveByOffset(5, 0).release().perform();
        screenshotIntro.takeScreenshot("horizontalSliderMoved");

    }



}
