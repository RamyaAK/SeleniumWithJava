package LaunchBrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchingBrowser {
    @Test
    public void testLaunchingBrowser() {

        System.setProperty("webdriver.chrome.driver", "utilities/drivers/chromedriver 4");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://ramyakulkarni.wordpress.com/");

    }
}
