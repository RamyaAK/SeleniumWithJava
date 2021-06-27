package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertPage {
    WebDriver driver;

    private By triggerAlertButton = By.xpath("//button[normalize-space()='Click for JS Alert']");
    private By triggerConfirmButton = By.xpath("//button[normalize-space()='Click for JS Confirm']");
    private By triggerPromptButton = By.xpath("//button[normalize-space()='Click for JS Prompt']");
    private By results = By.id("result");


    public JavaScriptAlertPage(WebDriver driver) {
        this.driver = driver;
    }

    public JavaScriptAlertPage clickOnTriggerAlertButton() {
        driver.findElement(triggerAlertButton).click();
        return this;
    }

    public JavaScriptAlertPage acceptAlert() throws InterruptedException {
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        return this;
    }

    public JavaScriptAlertPage dismissAlert() throws InterruptedException {
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        return this;
    }

    public JavaScriptAlertPage promptAlert(String text) throws InterruptedException {
        Thread.sleep(4000);
        driver.switchTo().alert().sendKeys(text);
        return this;
    }

    public String getResult() {
        return driver.findElement(results).getText();
    }

    public JavaScriptAlertPage clickOnTriggerConfirmButton() {
        driver.findElement(triggerConfirmButton).click();
        return this;
    }

    public JavaScriptAlertPage clickOnTriggerPromptButton() {
        driver.findElement(triggerPromptButton).click();
        return this;
    }
}
