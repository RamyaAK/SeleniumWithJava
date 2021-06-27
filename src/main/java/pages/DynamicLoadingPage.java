package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingPage {
    WebDriver driver;
    private By example1Link = By.linkText("Example 1: Element on page that is hidden");
    private By startButton = By.cssSelector("#start button");
    private By loadingIndicator = By.id("loading");
    private By loadedText = By.id("finish");

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicLoadingPage clickOnExample1() {
        driver.findElement(example1Link).click();
        return this;
    }

    public DynamicLoadingPage clickOnStartButton() {
        driver.findElement(startButton).click();
        return this;
    }

    public DynamicLoadingPage waitForTextToAppear() {
        //fluentWait();
        explicitWait();
        return this;
    }

    public void explicitWait() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
    }

    public void fluentWait() {
        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
    }

    public String getLoadedText() {
        return driver.findElement(loadedText).getText();
    }


}
