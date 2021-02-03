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
        WebElement contactButton = driver.findElement(By.xpath("//a[@href='/contact.html']"));
        contactButton.click();
        WebElement nameholder = driver.findElement(By.id("name"));
        nameholder.sendKeys("Ridvan Ceko");
        nameholder.sendKeys(Keys.RETURN);

        WebElement emailholder = driver.findElement(By.id("email"));
        emailholder.sendKeys("ridvanceko@gmail.com");
        emailholder.sendKeys(Keys.RETURN);

        WebElement subjectolder = driver.findElement(By.id("subject"));
        subjectolder.sendKeys("I want to have a website");
        subjectolder.sendKeys(Keys.RETURN);

        WebElement messageholder = driver.findElement(By.id("message"));
        messageholder.sendKeys("make me a website");
        messageholder.sendKeys(Keys.RETURN);


//       WebElement searchField = driver.findElement(By.xpath("//input[@name='q']"));
//       searchField.sendKeys("SEO" + Keys.ENTER);
//        String spireTitle = driver.getTitle();
//        System.out.println("Chrome browser result page name: " + spireTitle);


      //driver.findElement(By.xpath("//a[@href='href='/blog/what-is-marketing-automation.html']")).click();
        //driver.navigate().back();


    }



}
