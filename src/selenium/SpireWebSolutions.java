package selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpireWebSolutions {

    @Test
    public void spireTest() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://spirewebsolutions.com/");
        driver.manage().window().maximize();
       WebElement searchField = driver.findElement(By.xpath("//input[@name='q']"));
       searchField.sendKeys("SEO" + Keys.ENTER);
        String spireTitle = driver.getTitle();
        System.out.println("Chrome browser result page name: " + spireTitle);

      driver.findElement(By.xpath("//a[@href='href='/blog/what-is-marketing-automation.html']")).click();

        driver.navigate().back();
    }


}
