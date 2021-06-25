package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By userName = By.id("username");
    private By passwordVal = By.id("password");
    private By loginButton = By.cssSelector("#login button");
    private By logoutButton = By.cssSelector(".button.secondary.radius");
    private By alertMessageBox = By.id("flash");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage setUsername(String username){
        driver.findElement(userName).sendKeys(username);
        return this;
    }

    public LoginPage setPassword(String password){
        driver.findElement(passwordVal).sendKeys(password);
        return this;
    }

    public SecureArea clickOnLogin(){
        driver.findElement(loginButton).click();
        return new SecureArea(driver);
    }

    public LoginPage clickOnLogout() {
        driver.findElement(logoutButton).click();
        return this;
    }

    public String getAlertMessage(){
        return driver.findElement(alertMessageBox).getText();
    }
}
