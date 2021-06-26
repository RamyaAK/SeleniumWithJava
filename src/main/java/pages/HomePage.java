package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    private WebDriver driver;
    private By authenticationLink = By.linkText("Form Authentication");
    private By dropDownButton = By.linkText("Dropdown");
    private By forgotPageLink = By.xpath("//a[normalize-space()='Forgot Password']");
   // @FindBy(linkText = "Form Authentication") WebElement authenticationLink;


    public HomePage(WebDriver driver){
          this.driver = driver;
    }

    public LoginPage clickOnLoginForm(){
        driver.findElement(authenticationLink).click();
        return new LoginPage(driver);
    }

    public DropDownPage clickOnDropDown(){
         driver.findElement(dropDownButton).click();
        return new DropDownPage(driver);
    }

    public ForgotPasswordPage clickOnForgotPasswordLink() {
        driver.findElement(forgotPageLink);
        return new ForgotPasswordPage(driver);
    }
}
