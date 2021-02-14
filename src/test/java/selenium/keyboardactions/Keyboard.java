package test.java.selenium.keyboardactions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {

    @Test

    public void allUpperCaseTest() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");
     WebElement searchField = driver.findElement(By.name("q"));

        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT).sendKeys(searchField, "Spire")
                .keyUp(Keys.SHIFT).sendKeys(searchField, "Web Solutions" + Keys.ENTER).perform();



    }

    @Test

    public void copyPasteTest() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");
        WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));

        Actions actions = new Actions(driver);
        actions.sendKeys(searchBar, "java").keyDown(Keys.COMMAND)

    //select all
    .sendKeys("a")
    //copy
    .sendKeys("c")
     //paste
    .sendKeys("v")
     //paste
    .sendKeys("v")
     // release Control button on keyboard
    .keyUp(Keys.COMMAND).perform();


    }

    @Test

    public void cutPasteTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");
        WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));

        Actions actions = new Actions(driver);
        actions.sendKeys(searchBar, "iphone 12")

                .keyDown(Keys.COMMAND)
                .sendKeys("a")
                .sendKeys("x")
                .sendKeys("v")
                .sendKeys("v")
                .sendKeys("v")
                .keyUp(Keys.COMMAND)
                .sendKeys(Keys.ENTER)
                .perform();

    }




}
