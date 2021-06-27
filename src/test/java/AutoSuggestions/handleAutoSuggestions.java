package AutoSuggestions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;


public class handleAutoSuggestions {
    @Test
    public void testAutoSuggestions() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.google.co.in/");

        WebElement searchKeyword = driver.findElement(By.name("q"));
        searchKeyword.sendKeys("humming");
        Thread.sleep(4000);

        List<WebElement> options = driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div[1]//span"));

        System.out.println(options.size());

        for(WebElement option : options){
            if(option.getText().equalsIgnoreCase("humming meaning")){
                option.click();
                break;
            }
        }
        driver.quit();
    }
}

