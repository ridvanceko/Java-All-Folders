package test.java.selenium.Lenovo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.util.ArrayList;
import java.util.List;


public class LenovoAmazon {


    @Test

    public void lenovoTest() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
        Actions actions = new Actions(driver);

        actions.sendKeys(searchBar, "Lenovo" + Keys.ENTER).perform();
       List<WebElement> productNameList = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

       List<String> productNames = new ArrayList<>();

       for(WebElement product: productNameList) {
           String temp = product.getText();
           productNames.add(temp);
    }
        System.out.println(productNames);

       int index = 0;
       while(index < productNames.size()) {
           System.out.println(productNames.get(index++));

           Assert.assertTrue(productNames.get(index).toLowerCase().contains("lenovo"));
           index++;

       }

    }
}
