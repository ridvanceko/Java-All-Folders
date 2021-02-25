package test.java.selenium.pages.herokuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HerokuAppHomePage {

    public HerokuAppHomePage(WebDriver driver) {
        // it will initialize
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "A/B Testing")
    public WebElement abTesting;

    @FindBy(xpath = "//a[@href='/challenging_dom']")
   public  WebElement challengingDomLink;

    @FindBy(xpath = "//a[text()=''Dropdown]")
    public WebElement dropdownLink;
    //WebElement abTesting = driver.findElement(By.linkText(""));
}
