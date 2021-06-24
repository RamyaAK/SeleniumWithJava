package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecureArea {
    private WebDriver driver;
    @FindBy(id = "flash")
    private WebElement loggedInBanner;

    public SecureArea(WebDriver driver) {
        this.driver = driver;
    }

    public String verifyLoginSuccessful() {
        loggedInBanner.isDisplayed();
        return loggedInBanner.getText();
    }
}
