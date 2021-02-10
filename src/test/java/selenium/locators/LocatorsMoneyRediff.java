package test.java.selenium.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorsMoneyRediff {

    @Test

    public void moneyRediff(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://money.rediff.com/gainers");

        //self
        String text = driver.findElement(By.xpath("//a[contains(text(),'Vinati Organics')]/self::a")).getText();
        //for getting text() I need assign as a String
        System.out.println(text); //Vinati Organics

        //parent
        String text1 = driver.findElement(By.xpath("//a[contains(text(),'Vinati Organics')]/parent::td")).getText();
        System.out.println(text1); //Vinati Organics

        //child
      List<WebElement> childs =  driver.findElements(By.xpath("//a[contains(text(),'Vinati Organics')]/ancestor::tr/child::td"));
        System.out.println("Number of child elements: " + childs.size()); //5

        //ancestor
      text = driver.findElement(By.xpath("//a[contains(text(),'Vinati Organics')]/ancestor::tr")).getText();
        System.out.println(text);

    }
}
