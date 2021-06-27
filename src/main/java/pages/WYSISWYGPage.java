package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSISWYGPage {

    WebDriver driver;
    String editorFrameId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increaseIndentButton = By.xpath("//button[@title='Increase indent']");


    public WYSISWYGPage(WebDriver driver) {
        this.driver = driver;
    }

    public WYSISWYGPage switchToEditor() {
        driver.switchTo().frame(editorFrameId);
        return this;
    }

    public WYSISWYGPage switchToMainArea() {
        driver.switchTo().parentFrame();
        return this;
    }

    public WYSISWYGPage clearText() {
        switchToEditor();
        driver.findElement(textArea).clear();
        switchToMainArea();
        return this;
    }

    public WYSISWYGPage setText(String text) {
        switchToEditor();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
        return this;
    }

    public WYSISWYGPage clickOnIncreaseIndentButton() {
        driver.findElement(increaseIndentButton).click();
        return this;
    }

    public String getTextFromEditor() {
        switchToEditor();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }


}
