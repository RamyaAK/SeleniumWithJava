package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    private WebDriver driver;
    private By authenticationLink = By.linkText("Form Authentication");
   // @FindBy(linkText = "Form Authentication") WebElement authenticationLink;


    public HomePage(WebDriver driver){
          this.driver = driver;
    }

    public LoginPage clickOnLoginForm(){
        driver.findElement(authenticationLink).click();
        return new LoginPage(driver);
    }


}
