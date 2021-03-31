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
}
