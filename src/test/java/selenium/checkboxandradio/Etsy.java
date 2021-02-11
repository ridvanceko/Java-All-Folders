package test.java.selenium.checkboxandradio;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Etsy {

    @Test
    public void test1() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/?ref=lgo");
       WebElement searchButton = driver.findElement(By.xpath("//button[@value='Search']"));
        searchButton.click();
        Thread.sleep(3000);


      WebElement shipIn1Day =  driver.findElement(By.xpath("//label[@for='max-processing-days-1']"));
      shipIn1Day.click();

      Thread.sleep(2000);
      shipIn1Day = driver.findElement(By.xpath("//label[@for='max-processing-days-1']/preceding-sibling::input"));

      Assert.assertTrue(shipIn1Day.isSelected());


        WebElement shipIn3Days = driver.findElement(By.xpath("//label[@for='max-processing-days-3']"));
        shipIn3Days.click();

        shipIn3Days = driver.findElement(By.xpath("//label[@for='max-processing-days-3']/preceding-sibling::input"));

        Assert.assertTrue(shipIn3Days.isSelected());



      driver.close();

    }

}
