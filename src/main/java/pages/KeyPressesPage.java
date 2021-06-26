package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {

    WebDriver driver;
    private By textArea = By.id("target");
    private By resultText = By.id("result");


    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public KeyPressesPage InputText(String value) {
        driver.findElement(textArea).sendKeys(value);
        return this;
    }

    public String getResults() {
        return driver.findElement(resultText).getText();
    }


}
