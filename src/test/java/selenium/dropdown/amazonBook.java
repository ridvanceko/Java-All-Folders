package test.java.selenium.dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

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

        @Test
    public void test4() {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.get("https://the-internet.herokuapp.com/dropdown");
            WebElement dropDown = driver.findElement(By.id("dropdown"));

            Select dropDownHandler = new Select(dropDown);
           List<WebElement> listOfOptions = dropDownHandler.getOptions();
            System.out.println(listOfOptions.size());

        }

        @Test
    public void amazonDropDownPrint() {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.amazon.com/");
            WebElement dropdown = driver.findElement(By.cssSelector("#searchDropdownBox"));

            Select dropDown = new Select(dropdown);
            List<WebElement> listDropDown = dropDown.getOptions();

            for (WebElement option:listDropDown) {
                System.out.println(option.getText());
            }
            System.out.println(listDropDown.size());
        }


}
