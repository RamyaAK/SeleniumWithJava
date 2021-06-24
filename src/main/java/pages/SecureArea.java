package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureArea {
    private WebDriver driver;
    private By loggedInBanner = By.id("flash");

    public SecureArea(WebDriver driver) {
        this.driver = driver;
    }

    public  String verifyLoginSuccessful(){
        driver.findElement(loggedInBanner).isDisplayed();
        return driver.findElement(loggedInBanner).getText();
    }
}
