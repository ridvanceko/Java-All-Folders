package test.java.selenium.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DataProvidersIntro {

    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @Parameters({"username", "password"})
    @Test
    public void testData(String user, String password){

        driver.get("https://demo.openmrs.org/openmrs/login.htm");
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys(user);

        WebElement password1 = driver.findElement(By.id("password"));
        password1.sendKeys(password);

        WebElement login = driver.findElement(By.id("loginButton"));
        login.click();
    }

        @AfterMethod
    public void teardown() {
        driver.quit();
        }
//
//        @DataProvider(name = "MRSTestData")
//    public Object[] [] getTestData() {
//
//        return new Object[][]
//                {{"admin123", "invalidPassword"},
//                {"invalidUsername", "Admin123"},
//                {" ", " "}, {"admin123", " "},
//               {"invalidUserName", "invalidPassword"}};
//
//        }



    }




