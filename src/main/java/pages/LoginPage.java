package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    private WebDriver driver;

    @FindBy(id = "username")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement passwordVal;

    @FindBy(css = "#login button")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String username) {
        userName.sendKeys(username);
    }

    public void setPassword(String password) {
        passwordVal.sendKeys(password);
    }

    public SecureArea clickOnLogin() {
        loginButton.click();
        return new SecureArea(driver);
    }
}
