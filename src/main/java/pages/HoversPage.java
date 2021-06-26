package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    WebDriver driver;

    private By figureBox = By.className("figure");
    private By boxCaption = By.className("figcaption");

    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }

    public FigureCaptionBlock hoverOverFigure(int index) {
        WebElement figure = driver.findElements(figureBox).get(index - 1);
        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();
        return new FigureCaptionBlock(figure.findElement(boxCaption));
    }

}

