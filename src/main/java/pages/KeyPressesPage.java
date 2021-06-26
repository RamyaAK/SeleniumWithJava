package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

    public KeyPressesPage enterPi(){
        InputText(Keys.chord(Keys.ALT,"p"+" = 3.142"));
        return this;
    }

    public String getResults() {
        return driver.findElement(resultText).getText();
    }


}
