package LaunchBrowser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchingBrowser {

    // Traditional method
    @Test(enabled = false)
    public void testLaunchingBrowser() {

        System.setProperty("webdriver.chrome.driver", "utilities/drivers/chromedriver 4");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://ramyakulkarni.wordpress.com/");

    }

    // Using WebDriverManager library, no need to specify the location of the browser or download the exe files.
    @Test
    public void testLaunchingBrowserWithWebDriverManager() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://ramyakulkarni.wordpress.com");

    }
}

