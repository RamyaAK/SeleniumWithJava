package StatusOfWebElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StatusOfWebElement {

    @Test
    public void testStatus() {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://ramyakulkarni.wordpress.com/");

        // check for webElement isDisplayed, isEnabled?

        WebElement element = driver.findElement(By.xpath("//section[@id='search-2']//input[@placeholder='Search …']"));
        System.out.println("Is the Element displayed? " + element.isDisplayed());
        System.out.println("Is the Element enabled? " + element.isEnabled());
    }
}
