package FindElementAndFindElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class FindElementVsFindElements {

    @Test
    public void shouldTestFindElementVsFindElements(){
        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();

       // findElement --- returns single element.
        driver.get("https://ramyakulkarni.wordpress.com/");

        WebElement searchBox = driver.findElement(By.xpath("//section[@id='search-2']//input[@placeholder='Search …']"));
        searchBox.sendKeys("Tigers");

        //findElements --- returns List of WebElements.

        List<WebElement> pageTitles = driver.findElements(By.xpath("//*[@id=\"recent-posts-2\"]/ul/li//a"));
        for(WebElement page : pageTitles){
            System.out.println("Title : "+page.getText());
        }

        //get size of the pageTitles
        System.out.println("Size of PageTitles : "+pageTitles.size());
    }
}

