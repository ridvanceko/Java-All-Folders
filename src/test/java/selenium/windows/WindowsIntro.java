package test.java.selenium.windows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowsIntro {


    WebDriver driver;
    Actions actions;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        actions = new Actions(driver);
    }

@Test
    public void test1() throws InterruptedException {

        driver.get("https://google.com");
    WebElement searchBox = driver.findElement(By.name("q"));
    actions.sendKeys(searchBox, "java programming" + Keys.ENTER).perform();

    WebElement _3rdLink = driver.findElement(By.xpath("//span[text()='Learn Java Programming - Programiz']"));
    // opens in a NEW WINDOW
    actions.keyDown(Keys.SHIFT).click(_3rdLink).keyUp(Keys.SHIFT).perform();

    // because of all windows are unique we use SET interface
     String currentWindowId = driver.getWindowHandle();
    Set<String> allWindowId =  driver.getWindowHandles();

    String newWindowId = "";
    for(String id : allWindowId) {
        if(!id.equals(currentWindowId)) {
            newWindowId = id;
        }
    }

    // switch to a second window/browser
    driver.switchTo().window(newWindowId);


    // operations on a new browsers
    WebElement header = driver.findElement(By.tagName("h1"));
    Assert.assertEquals(header.getText(), "Learn Java Programming");

    // switch to a first window/browser
    driver.switchTo().window(currentWindowId);

    Thread.sleep(2000);

    WebElement wikiLink = driver.findElement(By.xpath("//span[.='Java (programming language) - Wikipedia']"));

    // open link in a new window
    actions.keyDown(Keys.SHIFT).click(wikiLink).keyUp(Keys.SHIFT).perform();

    allWindowId = driver.getWindowHandles();

    String thirdWindowId = "";
    for (String id : allWindowId) {
        if(!id.equals(currentWindowId) && !id.equals(newWindowId)) {
            thirdWindowId = id;
        }
    }

    driver.switchTo().window(thirdWindowId);

    System.out.println(driver.getCurrentUrl());
    System.out.println(driver.getTitle());


}

}
