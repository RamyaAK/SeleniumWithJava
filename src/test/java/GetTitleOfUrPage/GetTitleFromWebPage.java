package GetTitleOfUrPage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetTitleFromWebPage {
    @Test
    public void shouldGetTitle() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://ramyakulkarni.wordpress.com");
        // Getting Title
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Worth2Read.com – Follow Your dreams, transform your Life");
    }

    @Test
    public void shouldGetCurrentURL() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://ramyakulkarni.wordpress.com/");

        Assert.assertEquals(driver.getCurrentUrl(), "https://ramyakulkarni.wordpress.com/");
    }

    @Test
    public void shouldGetPageSource() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://ramyakulkarni.wordpress.com/");
        System.out.println(driver.getPageSource());

        Assert.assertTrue(driver.getPageSource().contains("Save tigers, Save life.."));
    }
}
