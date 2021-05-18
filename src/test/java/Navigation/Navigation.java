package Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Navigation {
    @Test
    public void shouldTestNavigatingCommandsInSelenium() {
        WebDriverManager.chromedriver().setup();
        RemoteWebDriver driver = new ChromeDriver();
        String url ="https://www.amazon.com/";

        driver.get("https://www.snapdeal.com/");

        driver.navigate().to(url);
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        //  RemoteWebDriver implements WebDriverManager class

        // difference between get and navigate().to(url) is that get will wait till page loads and
        // navigate.to will not wait until page load but saves the page info and cookie for further navigation.
        // both the get and the navigate.to methods are same.
        // The only diff is navigate().to internally calls get method and
        // it can accept string as well as URL as its Parameters where as the get mtd only accepts string as parameter.

    }
}
