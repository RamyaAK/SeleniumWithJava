package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

   private WebDriver driver;
   private By email = By.id("email");
   private By submitButton = By.className("radius");

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }


    public ForgotPasswordPage enterEmailId(String emailId){
        driver.findElement(email).sendKeys(emailId);
        return this;
    }


    public ForgotPasswordPage submitRecoveryEmailId() throws InterruptedException {
        driver.findElement(submitButton).click();
        return this;
    }


}
