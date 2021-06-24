package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    private WebDriver driver;
    @FindBy(linkText = "Form Authentication")
    private WebElement authenticationLink;

    public HomePage(WebDriver driver){
          this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        authenticationLink.click();
        return new LoginPage(driver);
    }


}
