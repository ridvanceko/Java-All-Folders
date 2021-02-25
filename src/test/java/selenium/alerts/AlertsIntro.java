package test.java.selenium.alerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class AlertsIntro {

    WebDriver driver;
    Actions actions;


    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        actions = new Actions(driver);

    }

    @Test
    public void alertsTest() {

        driver.get("https://the-internet.herokuapp.com/");
        WebElement javaScriptAlert=driver.findElement(By.xpath("//a[text()='JavaScript Alerts']"));
        actions.keyDown(Keys.SHIFT).click(javaScriptAlert).perform();

        String firstWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();

        String secondWindowHandle = "";
        for(String id: allWindowHandles) {
            if(!id.equals(firstWindowHandle)) {
                secondWindowHandle = id;
            }
        }

        driver.switchTo().window(secondWindowHandle);

        WebElement simpleAlert = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        

        driver.switchTo().alert().accept();
        //other types of alerts
//        driver.switchTo().alert().dismiss();
//        driver.switchTo().alert().sendKeys();

    }
}
