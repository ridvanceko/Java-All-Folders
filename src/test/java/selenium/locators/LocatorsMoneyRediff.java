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

        //self  - Selects the current node
        String text = driver.findElement(By.xpath("//a[contains(text(),'Vinati Organics')]/self::a")).getText();
        //for getting text() I need assign as a String
        System.out.println(text); //Vinati Organics

        //parent - Selects the parent of the current node (always one)
        String text1 = driver.findElement(By.xpath("//a[contains(text(),'Vinati Organics')]/parent::td")).getText();
        System.out.println(text1); //Vinati Organics

        //child - Selects all children of the current node (one or many)
      List<WebElement> childs =  driver.findElements(By.xpath("//a[contains(text(),'Vinati Organics')]/ancestor::tr/child::td"));
        System.out.println("Number of child elements: " + childs.size()); //5

        //ancestor - Selects all ancestor (parent, grandparent, etc)
      text = driver.findElement(By.xpath("//a[contains(text(),'Vinati Organics')]/ancestor::tr")).getText();
        System.out.println(text);

        //descendant - Select all escendants (children, grandchildren, etc.) of the current node
      List <WebElement> descendants =  driver.findElements(By.xpath("//a[contains(text(),'Vinati Organics')]/ancestor::tr/descendant::*"));
        System.out.println("Number of Descendant nodes: " + descendants.size());

        //following - Selects everything in the document after the closing tag of the current node
        List <WebElement> followingNodes =driver.findElements(By.xpath("//a[contains(text(),'Vinati Organics')]/ancestor::tr/following::tr"));
        System.out.println("Number of following nodes: " + followingNodes.size());

        //following-sibling = Selects all siblings after the current node
        List <WebElement> followingSiblings = driver.findElements(By.xpath("//a[contains(text(),'Vinati Organics')]/ancestor::tr/following-sibling::tr"));

        System.out.println("Following Siblings : " + followingNodes.size());


        driver.close();
    }
}
