package test.java.selenium.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.LocalDate;

public class DataProviderPatience {


    WebDriver driver;
    Actions actions;
    Select select;
    SoftAssert softAssert;

    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        actions=new Actions(driver);
        softAssert=new SoftAssert();
    }

    @Test(dataProvider="patientInfo")
    public void registerAPatient(String name,String lastname,String gender,int day,String month,int year,String address) throws InterruptedException {
        driver.get("https://demo.openmrs.org");
        login();

        WebElement registerAPatient= driver.findElement(By.id("referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension"));
        registerAPatient.click();

        WebElement givenName= driver.findElement(By.xpath("//input[@name='givenName']"));
        actions.sendKeys(givenName,name).perform();

        WebElement familyName= driver.findElement(By.xpath("//input[@name='familyName']"));
        actions.sendKeys(familyName,lastname).perform();

        WebElement nextButton= driver.findElement(By.id("next-button"));
        nextButton.click();

        WebElement genderDropdown= driver.findElement(By.id("gender-field"));
        select=new Select(genderDropdown);
        select.selectByVisibleText(gender);
        nextButton.click();

        WebElement birthDay=driver.findElement(By.id("birthdateDay-field"));
        actions.sendKeys(birthDay,String.valueOf(day)).perform();
        WebElement birthMonthDD=driver.findElement(By.id("birthdateMonth-field"));
        select=new Select(birthMonthDD); // webElement
        select.selectByVisibleText(month);
        WebElement birthYear=driver.findElement(By.id("birthdateYear-field"));
        actions.sendKeys(birthYear,String.valueOf(year)).perform();
        nextButton.click();
        Thread.sleep(1000);

        WebElement addressBox=driver.findElement(By.id("address1"));
        actions.sendKeys(addressBox,address).perform();
        nextButton.click();
        nextButton.click();
        nextButton.click();

        WebElement submitButton=driver.findElement(By.id("submit"));
        submitButton.click();
        Thread.sleep(3000);

        //Assertions
        WebElement nameAssertion=driver.findElement(By.className("PersonName-givenName"));
        softAssert.assertEquals(nameAssertion.getText(),name);
        WebElement familyNameAssertion=driver.findElement(By.xpath("//span[@class='PersonName-familyName']"));
        softAssert.assertEquals(familyNameAssertion.getText(),familyName);
        WebElement genderAssertion=driver.findElement(By.xpath("//*[@id='edit-patient-demographics']//preceding-sibling::span//preceding-sibling::span"));
        softAssert.assertTrue(genderAssertion.getText().contains(gender));

        String ageAndYear=driver.findElement(By.xpath("//span[@id='edit-patient-demographics']//preceding-sibling::span[1]")).getText().trim();
        String ageString=ageAndYear.substring(0,2); //.......(13.Jan.1971)
        String yearString=ageAndYear.substring(ageAndYear.length()-5,ageAndYear.length()-1);
        System.out.println(ageAndYear); // the whole string
        System.out.println(ageString);
        System.out.println(yearString);

        int expectedAge= LocalDate.now().getYear()-year;
        softAssert.assertEquals(Integer.parseInt(ageString),expectedAge);
        softAssert.assertEquals(Integer.parseInt(yearString),year);
        // (31.Aug.1971)
        String monthString=ageAndYear.substring(ageAndYear.length()-9,ageAndYear.length()-6);
        softAssert.assertTrue(month.contains(monthString));
        String dayString=ageAndYear.substring(ageAndYear.length()-12,ageAndYear.length()-10);
        softAssert.assertEquals(Integer.parseInt(dayString),day);


        WebElement actualAddress= driver.findElement(By.xpath("//div[@class='contact-info-inline labeled']/span[1]"));
        softAssert.assertEquals(actualAddress.getText().trim(),address);

    }

    @DataProvider(name="patientInfo")
    public Object[][] getPatientData(){
        return new Object[][]{
                {"John","Smith","Male",31,"August",1971,"2200 E Devon Ave"},
                {"Jonathan","O'Connell", "Male", 24, "April",1955, "45 Surrey Dr"},
                {"Larry", "Lord", "Male", 14, "January", 1978, "90 Chesterfield ave"},
        };
    }
    private void login(){
        WebElement usernameBox= driver.findElement(By.id("username"));
        usernameBox.sendKeys("admin");
        WebElement passwordBox= driver.findElement(By.id("password"));
        passwordBox.sendKeys("Admin123");
        WebElement pharmacy= driver.findElement(By.id("Pharmacy"));
        pharmacy.click();

        WebElement loginButton= driver.findElement(By.id("loginButton"));
        loginButton.click();
    }

}
