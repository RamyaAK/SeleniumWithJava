package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage{

    private WebDriver driver;

    private By dropdown = By.id("dropdown");

    public DropDownPage(WebDriver driver){
        this.driver = driver;
    }

    public DropDownPage selectOptionFromDropdown(String option){
        findDropDownElement().selectByVisibleText(option);
        return this;
    }

    public String getSelectedOptionValue(){
        Select dropdownEle = new Select(driver.findElement(dropdown));
        WebElement option = dropdownEle.getFirstSelectedOption();
        String selectOptionFromDropdown = option.getText();
        return selectOptionFromDropdown;
    }

    public List<String> getSelectedOptions(){
        List<WebElement> options = findDropDownElement().getAllSelectedOptions();
        return options.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    private Select findDropDownElement(){
        return new Select(driver.findElement(dropdown));
    }
}
