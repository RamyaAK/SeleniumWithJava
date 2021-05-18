package HandlingDropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class HandleDropDown {
    @Test
    public void HandleDropDown() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");

        WebElement dropdownElement = driver.findElement(By.cssSelector("#searchDropdownBox"));

        Select dropdownOptions = new Select(dropdownElement);

        // classic method:
        dropdownOptions.selectByVisibleText("Books");
        dropdownOptions.selectByIndex(6); // Appliances at index 6
        dropdownOptions.selectByValue("search-alias=pantry");


        // looping through the dropdown and selecting the option matching string
        List<WebElement> allOptions = dropdownOptions.getOptions();
        for (WebElement optionItem : allOptions) {
            if (optionItem.getText().equalsIgnoreCase("Books")) {
                optionItem.click();
                break;
            }
        }

        // call generic method
        selectOptionFromDropdown(dropdownElement, "Books");

        driver.quit();
    }

    // generic  method implementation:
    public static void selectOptionFromDropdown(WebElement element, String option) {
        Select dropdown = new Select(element);
        List<WebElement> list = dropdown.getOptions();

        for (WebElement ele : list) {
            if (ele.getText().equalsIgnoreCase(option)) {
                ele.click();
            }
        }
    }
}