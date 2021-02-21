package test.java.selenium.testng;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProvidersIntro2 {


    private WebDriver driver;
    private Actions actions;
    private Select select;



    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        actions = new Actions(driver);

    }

//    @Test
//    public void registerPatientTest() {
//        driver.get("https://demo.openmrs.org/openmrs/login.htm");
//        WebElement registerPatientButton = driver.findElement(By.id());
//
//    }

    private void login() {
        WebElement userName = driver.findElement(By.id("username"));
        WebElement password1 = driver.findElement(By.id("password"));




    }




}
