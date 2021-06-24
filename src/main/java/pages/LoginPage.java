package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By userName = By.id("username");
    private By passwordVal = By.id("password");
    private By loginButton = By.cssSelector("#login button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String username){
        driver.findElement(userName).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(passwordVal).sendKeys(password);
    }

    public SecureArea clickOnLogin(){
        driver.findElement(loginButton).click();
        return new SecureArea(driver);
    }
}
