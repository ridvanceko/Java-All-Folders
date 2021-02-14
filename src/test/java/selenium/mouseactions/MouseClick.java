package test.java.selenium.mouseactions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClick {

    @Test

    public void test1() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement abTestingLink = driver.findElement(By.linkText("A/B Testing"));

        Actions actions = new Actions(driver);
        actions.click(abTestingLink).perform();

    }

    @Test

    public void test2() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        WebElement contextMenuLink = driver.findElement(By.linkText("Context Menu"));
        Actions actions = new Actions(driver);
        actions.click(contextMenuLink).perform();

        WebElement rectangle = driver.findElement(By.id("hot-spot"));

        ////////////////////
        // contextClick = Right click in mouse
        actions.contextClick(rectangle).perform();


    }

    @Test

    public void test3() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/");

        WebElement horizontalSliderLink = driver.findElement(By.linkText("Horizontal Slider"));
        Actions actions = new Actions(driver);

        actions.click(horizontalSliderLink).perform();
        WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));

        ///////////////////////////////
        // moving to range while click and hold the mouse
        actions.clickAndHold(slider).moveByOffset(50, 0).release().perform();


    }

    @Test

    public void test4() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://the-internet.herokuapp.com/");
        WebElement hoversLink = driver.findElement(By.linkText("Hovers"));

        Actions actions = new Actions(driver);
        actions.click(hoversLink).perform();

       WebElement avatar3 = driver.findElement(By.xpath("//h5[.='name: user3']/../preceding-sibling::img"));

       /////////////////////
       // hover-over
       actions.moveToElement(avatar3).perform();


    }

    @Test
    public void test5() {

        WebDriverManager.firefoxdriver().setup();
        WebDriver firefox = new FirefoxDriver();

        firefox.get("http://demo.guru99.com/test/simple_context_menu.html");


        String currentTitle = firefox.getTitle();
        Assert.assertEquals("Simple Context Menu", currentTitle);

        WebElement doubleClickButton = firefox.findElement(By.xpath("//button[@andblclick='myFunction()']"));

        Actions actions = new Actions(firefox);
        actions.doubleClick(doubleClickButton).perform();

    }






}
