package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextClickPage {
    WebDriver driver;

    private By menuBox = By.id("hot-spot");

    public ContextClickPage(WebDriver driver) {
        this.driver = driver;
    }

    public ContextClickPage doubleClickOnMenuBox(){
        Actions action =new Actions(driver);
        action.contextClick(driver.findElement(menuBox)).perform();
        return this;
    }
}
