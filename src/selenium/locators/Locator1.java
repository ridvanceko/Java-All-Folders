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

    public void test1() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
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

        driver.close();

    }

    @Test

    public void etsyTest() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://etsy.com");
        WebElement search = driver.findElement(By.id("global-enhancements-search-query"));
        search.sendKeys("Java book" + Keys.ENTER);

        String currentURL = driver.getCurrentUrl();
        System.out.println("current URL is " + currentURL);


    }

    @Test
    public void nameLocator() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/");
        WebElement firstNameField = driver.findElement(By.name("firstName"));
        firstNameField.sendKeys("Ceko");

    }

    @Test
    public void tagNameLocator() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement abTestLink = driver.findElement(By.xpath("//a[@href='/abtest']"));
        abTestLink.click();

        WebElement abTestHeader = driver.findElement(By.tagName("h3"));
        System.out.println(abTestHeader);

        String currentURL = driver.getCurrentUrl();
        System.out.println("current URL is " + currentURL);

    }

    @Test
    public void linkTextTest() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement abTestingLink = driver.findElement(By.linkText("A/B Testing"));
        abTestingLink.click();

    }
    @Test
    public void linkTextTest1() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        String Title = driver.getTitle();
        System.out.println("Home page's title is: " + Title);
        String CurrentUrl = driver.getCurrentUrl();
        System.out.println(CurrentUrl);

        WebElement forgetPassword = driver.findElement(By.xpath("//a[@href='/forgot_password']"));
        forgetPassword.click();
        driver.navigate().back();

        WebElement header = driver.findElement(By.tagName("h2"));
        System.out.println(header);
        driver.navigate().back();

        WebElement hoversLink = driver.findElement(By.linkText("Hovers"));
        hoversLink.click();


        String currentURL = driver.getCurrentUrl();
        System.out.println("current URL is " + currentURL);
        driver.get("https://the-internet.herokuapp.com/");

        String url = driver.getCurrentUrl();
        if(url.equalsIgnoreCase(currentURL)){
            System.out.println("Url is same");
        }
        else {
            System.out.println("Url is different");
        }

    }

    @Test
    public void partialLinkTextTest() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement sliderLink = driver.findElement(By.partialLinkText("Slider"));
        sliderLink.click();

    }

}
