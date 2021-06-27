package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    WebDriver driver;

    private By inputFileElement = By.id("file-upload");
    private By fileUploadButton = By.id("file-submit");
    private By uploadedFile = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver =driver;
    }

    public FileUploadPage clickOnFileUploadButton() {
        driver.findElement(fileUploadButton).click();
        return this;
    }

    public FileUploadPage uploadFile(String absolutePath) {
        driver.findElement(inputFileElement).sendKeys(absolutePath);
        clickOnFileUploadButton();
        return this;
    }

    public String getUploadedFiles(){
        return driver.findElement(uploadedFile).getText();
    }


}
