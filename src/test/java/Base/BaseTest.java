package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureArea;

public class BaseTest {
    private WebDriver driver;

    protected HomePage homePage;
    protected LoginPage loginPage;
    protected SecureArea secureArea;


    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        this.driver= driver;

        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        secureArea = new SecureArea(driver);

        driver.get("https://the-internet.herokuapp.com/");
    }
    @AfterClass(alwaysRun=true)
    public void tearDown() {
        driver.quit();
    }
}
