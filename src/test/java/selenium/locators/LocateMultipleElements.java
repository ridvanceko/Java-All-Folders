package test.java.selenium.locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;

public class LocateMultipleElements {

    @Test

    public void multipleElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");
        WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));

        Actions actions = new Actions(driver);
        actions.sendKeys(searchBar, "iphone 12" + Keys.ENTER).perform();

       List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price']"));

       /*
       1- prices with $ sign
       2- prices with ','
       3- empty prices
       4- prices without $ sign
        */

        double totalPrice = 0.0;

       for(WebElement elementPrice : prices) {
           //System.out.println(elementPrice.getText());

           String temp = elementPrice.getText();
           if(temp.startsWith("$")) {
               temp = temp.substring(1);

           }

           if(temp.contains(",")) {
               temp = temp.replace(",", "");
           }

          if(temp.isEmpty()) {
              continue;
          }
          if(temp.contains("\n")) {
              temp = temp.replace("\n", ".");
          }

           totalPrice += Double.parseDouble(temp);
       }
        System.out.println(totalPrice);


    }

    @Test
    public void samsungTest() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
        Actions actions = new Actions(driver);

        actions.sendKeys(searchBar, "Samsung" + Keys.ENTER).perform();
        List<WebElement> productNameList = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

        List<String> productNames = new ArrayList<>();

        for (WebElement product: productNameList) {
            String temp = product.getText();
            productNames.add(temp);
        }
        System.out.println(productNames);

        int index = 0;
        while(index < productNames.size()) {
            System.out.println(index + ". " + productNames.get(index));

            // making sure every element has SAMSUNG word
            Assert.assertTrue(productNames.get(index).toLowerCase().contains("samsung"));
            index++;
        }
    }



}







