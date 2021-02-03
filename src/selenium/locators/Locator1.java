package selenium.locators;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.System.out;
import static java.lang.System.setOut;

public class Locator1 {


    @Test

    public void test1 () {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("iphone 12" + Keys.ENTER);
//        WebElement seacrhIcon = driver.findElement(By.id("nav-search-submit-button"));
//        seacrhIcon.click();
        WebElement iphoneLink = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        iphoneLink.click();

        WebElement iphoneHeader = driver.findElement(By.xpath("//span[@class='a-size-large qa-title-text']"));
        String text = iphoneHeader.getText();
        System.out.println(text);



    }

}
