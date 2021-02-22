package test.java.selenium.testng.homework5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDrop {

    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }


    @Test
    public void boxDisplayed() {

        driver.navigate().to("https://demos.telerik.com/kendo-ui/dragdrop/area");
        Assert.assertTrue(driver.getCurrentUrl().contains("dragdrop"));

        WebElement circle = driver.findElement(By.id("draggable"));
        WebElement blueBox = driver.findElement(By.xpath("//div[@id='droptarget']/div[@class='test1']"));
        WebElement orangeBox= driver.findElement(By.xpath("//div[@class='test2']"));

        Actions actions = new Actions(driver);
        //Action dragAndDrop = actions.clickAndHold(circle).moveToElement(blueBox).release().build();
        actions.clickAndHold(circle).moveByOffset(-75, 50).build().perform();

//
//        String text = toString();
//        if(text.equals("You did great!")) {
//            System.out.println("PASS: File is dropped to target as expected");
//        }else {
//            System.out.println("FAIL: File couldn't be dropped to target as expected");
//        }
        driver.close();
    }
//
//    @Test
//    public void test2() throws InterruptedException {
//
//        driver.navigate().to("https://demos.telerik.com/kendo-ui/dragdrop/area");
//        driver.manage().window().maximize();
//        WebElement circle = driver.findElement(By.xpath("//div[@id='draggable']"));
//
//        Actions actions = new Actions(driver);
//        actions.clickAndHold(circle).moveByOffset(-75, 55).perform();
//
//        WebElement blueBox = driver.findElement(By.xpath("//div[@class='test1']"));
//        WebElement orangeBox= driver.findElement(By.xpath("//div[@class='test2']"));
//
//        softAssert.assertEquals(blueBox.getText(), "Now you can drop it.");
//        softAssert.assertEquals(orangeBox.getText(),"(Drop here)");
//        actions.release().perform();

//        softAssert.assertAll();
//    }

//
//    @Test
//    public void test3() {
//
//        driver.navigate().to("https://demos.telerik.com/kendo-ui/dragdrop/area");
//        driver.manage().window().maximize();
//
//        WebElement circle = driver.findElement(By.xpath("//div[@id='draggable']"));
//        Actions actions = new Actions(driver);
//
//        actions.clickAndHold(circle).moveByOffset(75, 55).perform();
//        WebElement blueBox = driver.findElement(By.xpath("//div[@class='test1']"));
//        WebElement orangeBox= driver.findElement(By.xpath("//div[@class='test2']"));
//
//        softAssert.assertEquals(blueBox.getText(), "(Drop here)");
//        softAssert.assertEquals(orangeBox.getText(),"Now you can drop it.");
//        actions.release().perform();
//
//        softAssert.assertAll();
//    }


    @Test
    public void test4() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();

        WebElement FirstMinusFiveThousand = driver.findElement(By.xpath("//li[@id='credit']/child::a"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(FirstMinusFiveThousand).moveByOffset(0, 10).perform();
        WebElement expectedWarning = driver.findElement(By.xpath("//div[@id='e1']"));
        boolean warning1 = expectedWarning.isDisplayed();

        Assert.assertTrue(warning1);
        actions.release().perform();

        WebElement FirstFiveThousand = driver.findElement(By.xpath("//div[@style='min-height: 0%;']//child::li[2]//child::a"));
        WebElement DebitSideAmount = driver.findElement(By.xpath("//ol[@id='amt7']"));
        actions.clickAndHold(FirstFiveThousand)
                .moveToElement(DebitSideAmount)
                .release().build().perform();

        WebElement DebitMovementAmount = driver.findElement(By.id("t7"));
        WebElement CreditMovementAmount = driver.findElement(By.id("t8"));
        Assert.assertEquals(DebitMovementAmount.getText(), "5000");
        Assert.assertEquals(CreditMovementAmount.getText(), "0");

        WebElement SecondFiveThousand = driver.findElement(By.xpath("//div[@style='min-height: 0%;']//child::li[4]//child::a"));
        WebElement CreditSideAmount = driver.findElement(By.xpath("//ol[@id='amt8']/child::li"));
        actions.clickAndHold(SecondFiveThousand)
                .moveToElement(CreditSideAmount)
                .release().build().perform();
        Assert.assertEquals(DebitMovementAmount.getText(), "5000");
        Assert.assertEquals(CreditMovementAmount.getText(), "5000");
        WebElement bank = driver.findElement(By.xpath("//li[@id='credit2']/child::a"));
        WebElement DebitSideAccount= driver.findElement(By.xpath("//ol[@id='bank']"));
        actions.clickAndHold(bank)
                .moveToElement(DebitSideAccount)
                .release().build().perform();
        Assert.assertEquals(DebitSideAccount.getText(), "BANK");
        WebElement sales = driver.findElement(By.xpath("//li[@id='credit1']/child::a"));
        WebElement CreditSideAccount = driver.findElement(By.xpath("//ol[@id='loan']"));
        actions.clickAndHold(sales)
                .moveToElement(CreditSideAccount)
                .release().build().perform();
        Assert.assertEquals(CreditSideAccount.getText(),"SALES");
    }

    }


