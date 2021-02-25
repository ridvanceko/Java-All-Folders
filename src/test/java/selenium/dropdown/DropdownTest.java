package test.java.selenium.dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.java.selenium.pages.herokuapp.HerokuAppHomePage;


public class DropdownTest {


    WebDriver driver;
    HerokuAppHomePage herokuAppHomePage;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        herokuAppHomePage = new HerokuAppHomePage(driver);

    }

    @Test
    public  void test1() {
        driver.get("https://the-internet.herokuapp.com/");
        herokuAppHomePage.dropdownLink.click();
    }
}
