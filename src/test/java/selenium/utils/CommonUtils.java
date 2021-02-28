package test.java.selenium.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class CommonUtils {

    public static void handleDDByIndex(WebElement dd, String text) {

        Select select = new Select(dd);
        select.selectByVisibleText(text);
    }

    public static void handleDDByIndex(WebElement dd, int index) {

        Select select = new Select(dd);
        select.selectByIndex(index);
    }

//    public static void handleDDByValue(WebElement dd, String value) {
//        Select select = new Select(dd);
//        select.selectByIndex(value);
//    }

//    public static void hoverOver(WebDriver driver) {
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).perform();
//    }

//
//    public static void moveElement(WebDriver driver, WebElement element) {
//        Actions actions = new Actions(driver);
//        actions.clickAndHold(elementSource).moveToElement(elementTarget).perform();
//    }

    public static void switchWindow(WebDriver driver) {
        String currentWindow = driver.getWindowHandle();
       Set<String> allWindowHandles = driver.getWindowHandles();
       String toSwitch = "";

       for (String handle:allWindowHandles) {
           if(!currentWindow.equals(handle)) {
               driver.switchTo().window(handle);
               driver.switchTo().window(handle);
           }
       }


    }

    public static WebElement locateElemet(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement myElement = wait.until(ExpectedConditions.visibilityOf(element));
        return myElement;
    }

    public static void scrollElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("argument[0].scrollIntoView", element);


    }

    public static void scrollBottom(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
    }




}
