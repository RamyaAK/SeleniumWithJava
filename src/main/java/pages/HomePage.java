package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By authenticationLink = By.linkText("Form Authentication");
    private By dropDownButton = By.linkText("Dropdown");
    private By forgotPageLink = By.xpath("//a[normalize-space()='Forgot Password']");
    private By hoversLink = By.linkText("Hovers");
    private By keyPressesLink = By.linkText("Key Presses");
    private By javaScriptAlertsLink = By.linkText("JavaScript Alerts");
    private By fileUploadLink =By.linkText("File Upload");
    // @FindBy(linkText = "Form Authentication") WebElement authenticationLink;


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickOnLoginForm() {
        driver.findElement(authenticationLink).click();
        return new LoginPage(driver);
    }

    public DropDownPage clickOnDropDown() {
        driver.findElement(dropDownButton).click();
        return new DropDownPage(driver);
    }

    public ForgotPasswordPage clickOnForgotPasswordLink() {
        driver.findElement(forgotPageLink);
        return new ForgotPasswordPage(driver);
    }

    public HoversPage clickOnHovers() {
        driver.findElement(hoversLink).click();
        return new HoversPage(driver);
    }

    public KeyPressesPage clickOnKeyPresses() {
        driver.findElement(keyPressesLink).click();
        return new KeyPressesPage(driver);
    }

    public JavaScriptAlertPage clickOnJavaScriptAlert() {
        driver.findElement(javaScriptAlertsLink).click();
        return new JavaScriptAlertPage(driver);
    }

    public FileUploadPage clickOnFileUploadLink(){
        driver.findElement(fileUploadLink).click();
        return new FileUploadPage(driver);

    }
}
