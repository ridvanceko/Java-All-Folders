package test.java.selenium.Lenovo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

    public class LenovoTestNG {

        @Test
        public void lenovoLaptops() throws InterruptedException {

            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.get("https://amazon.com");

            WebElement searchField= driver.findElement(By.id("twotabsearchtextbox"));
            Actions action=new Actions(driver);
            action.keyDown(Keys.SHIFT).sendKeys(searchField,"l").keyUp(Keys.SHIFT).sendKeys("enovo ")
                    .keyDown(Keys.SHIFT).sendKeys("l").keyUp(Keys.SHIFT).sendKeys("aptop")
                    .sendKeys(Keys.ENTER).perform();

            //action.sendKeys(searchField,"lenovo laptop"+ Keys.ENTER).perform();
            List<WebElement> lenovoElementList=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
            List<String> laptopNames=new ArrayList<>(); // empty

            for (WebElement laptop:lenovoElementList) {
                laptopNames.add(laptop.getText());
            }

            List<WebElement> priceList=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
            List<Integer> laptopPrices=new ArrayList<>(); // empty

            for (WebElement priceElement:priceList) {
                String temp=priceElement.getText();
                if(temp.contains(",")){
                    temp=temp.replace(",","");
                }
                int intPrice=Integer.parseInt(temp);
                laptopPrices.add(intPrice);
            }

            /*
        Thread.sleep(3000);
        WebElement secondPage= driver.findElement(By.xpath("//a[@href='/s?k=lenovo+laptop&page=2&qid=1613417731&ref=sr_pg_2']"));
        action.moveToElement(secondPage).click();

        lenovoElementList=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        for (WebElement laptop:lenovoElementList) {
            laptopNames.add(laptop.getText());
        }
        priceList=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
        for (WebElement priceElement:priceList) {
            String temp=priceElement.getText();
            if(temp.contains(",")){
                temp=temp.replace(",","");
            }
            int intPrice=Integer.parseInt(temp);
            laptopPrices.add(intPrice);
        }

             */
            Map<String,Integer> laptops=new LinkedHashMap<>();
            for (int i = 0; i < laptopNames.size(); i++) {
                laptops.put(laptopNames.get(i),laptopPrices.get(i));
            }
            for (String key:laptops.keySet()) { // iterating map
                System.out.println(key+"  = $"+laptops.get(key));
                System.out.println();
            }
        }
    }


