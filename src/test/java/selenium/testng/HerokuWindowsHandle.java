package test.java.selenium.testng;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//import selenium.screenshots.ScreenshotIntro;
import java.util.List;
import java.util.Set;

public class HerokuWindowsHandle {
    WebDriver driver;
    SoftAssert softAssert;
    Actions actions;
    ScreenshotIntro screenshot;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        actions=new Actions(driver);
        softAssert=new SoftAssert();
        screenshot=new ScreenshotIntro();
    }
    @Test
    public void test() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/");
        //softAssert.assertTrue(driver.getTitle().contains("heroku"));
        String mainPageID= driver.getWindowHandle();
        Thread.sleep(2000);
        List<WebElement> links= driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        int index=1;
        for (WebElement currentLink:links) { // 1,2,3...46 links
            actions.keyDown(Keys.SHIFT).click(currentLink).keyUp(Keys.SHIFT).perform();
            Thread.sleep(2000);
            //now i have 2 windows
            Set<String> mainAndCurrentIDs= driver.getWindowHandles(); // heroku, abtest
            for (String id:mainAndCurrentIDs) {
                if(!id.equals(mainPageID)){
                    driver.switchTo().window(id);
                }
            }
            String url=driver.getCurrentUrl();
            String header= driver.findElement(By.xpath("//h3")).getText();
            String [] headerWords=header.toLowerCase().split(" "); // "add/remove" "elements"
            boolean bl=false;
            for (String word:headerWords) {
                if(url.contains(word)){
                    bl=true;
                }
            }
            softAssert.assertTrue(bl);
            System.out.println("Header "+index+++" : "+header);
            //screenshot.takeScreenshot("HerokuLinks");
            //driver.close();
            driver.switchTo().window(mainPageID);
        }
        softAssert.assertAll();
    }



}
