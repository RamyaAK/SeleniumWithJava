package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FigureCaptionBlock {
    private WebElement caption;
    private By header = By.tagName("h5");
    private By link = By.tagName("a");

    public FigureCaptionBlock(WebElement caption) {
        this.caption = caption;
    }

    public boolean isCaptionDisplayed() {
        return caption.isDisplayed();
    }

    public String getTitle(){
        return caption.findElement(header).getText();
    }

    public String getLink(){
        return caption.findElement(link).getAttribute("href");
    }
}
