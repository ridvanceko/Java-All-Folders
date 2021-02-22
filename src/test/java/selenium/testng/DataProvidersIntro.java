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

    @Parameters({"MRSusername", "MRSpassword"})
    @Test
    public void testData(String user, String password){

        driver.get("https://demo.openmrs.org/openmrs/login.htm");
        WebElement userNameBox= driver.findElement(By.id("username"));
        WebElement passwordBox = driver.findElement(By.id("password"));
        userNameBox.sendKeys(user);
        passwordBox.sendKeys(password);

        WebElement option = driver.findElement(By.id("Inpatient Ward"));
        option.click();

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




