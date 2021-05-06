package TextProperties;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class GetTextVsGetAttribute {

    @Test
    public void shouldTestGetTextVsGetAttribute() throws InterruptedException {
        // difference btw get attribute and get text.
        // getAttribute : will display the value of the mentioned attribute of an web element.
        //getText: will return only the text value if any present for that element otherwise returns empty value.

        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();

        driver.get("https://ramyakulkarni.wordpress.com/");


        WebElement searchInputBox = driver.findElement(By.cssSelector("section#search-2 input[name=\"s\"]"));
        searchInputBox.sendKeys("The Power of Words");

        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"search-2\"]/form/button"));
        //searchButton.click();

        List<WebElement> month = driver.findElements(By.cssSelector("#archives-2 > ul > li"));

       //String desiredMonth ="March 2017";

        for (WebElement element : month) {
            System.out.println(element.getText());
        }

        // get text attribute
        WebElement recentPosts = driver.findElement(By.cssSelector("#recent-posts-2>h2"));
        WebElement searchAttributeText = driver.findElement(By.cssSelector("#search-3 > form > label > input"));
        WebElement recentPostText = driver.findElement(By.xpath("//*[@id=\"recent-posts-2\"]/h2"));

        System.out.println(recentPosts.getAttribute("class"));
        System.out.println("The value of the search box attribute is " +searchAttributeText.getAttribute("name") );
        System.out.println("The value of the search box getText is " +searchAttributeText.getText());
        System.out.println("The recent Post text is "+ recentPostText.getText());
        driver.quit();
    }
}
