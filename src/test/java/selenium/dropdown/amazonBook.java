package test.java.selenium.dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class amazonBook {


        @Test

        public void testAmazon() {

            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.amazon.com/");
            WebElement dropdownBook = driver.findElement(By.id("searchDropdownDescription"));
//
//            Select dropDown = new Select(dropdownBook);
//            dropDown.selectByVisibleText("Books");
//
//            driver.close();


        }
        @Test

        public void test3() {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.get("https://the-internet.herokuapp.com/dropdown");
            WebElement dropDown = driver.findElement(By.id("dropdown"));

            Select dropDownHandler = new Select(dropDown);
            dropDownHandler.selectByIndex(1);


        }
}
