package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.*;

import java.util.List;

public class BaseTest {
    private WebDriver driver;

    protected HomePage homePage;
    protected LoginPage loginPage;
    protected SecureArea secureArea;
    protected DropDownPage dropDownPage;
    protected ForgotPasswordPage forgotPasswordPage;
    protected HoversPage hoversPage;
    protected KeyPressesPage keyPressesPage;
    protected JavaScriptAlertPage javaScriptAlertPage;
    protected FileUploadPage fileUploadPage;
    protected ContextClickPage contextClickPage;
    protected WYSISWYGPage wysiswygPage;
    protected DynamicLoadingPage dynamicLoadingPage;


    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        this.driver = driver;

        //below is an Example of Implicit wait:
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        initializePageObjects();
        launchUrl(driver);
    }

    private void launchUrl(ChromeDriver driver) {
        driver.get("https://the-internet.herokuapp.com/");
    }

    public void initializePageObjects() {
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        secureArea = new SecureArea(driver);
        dropDownPage = new DropDownPage(driver);
        forgotPasswordPage = new ForgotPasswordPage(driver);
        hoversPage = new HoversPage(driver);
        keyPressesPage = new KeyPressesPage(driver);
        javaScriptAlertPage = new JavaScriptAlertPage(driver);
        fileUploadPage = new FileUploadPage(driver);
        contextClickPage = new ContextClickPage(driver);
        wysiswygPage = new WYSISWYGPage(driver);
        dynamicLoadingPage = new DynamicLoadingPage(driver);
    }

    // generic  method implementation:
    public static void selectOptionFromDropdown(WebElement element, String option) {
        Select dropdown = new Select(element);
        List<WebElement> list = dropdown.getOptions();

        for (WebElement ele : list) {
            if (ele.getText().equalsIgnoreCase(option)) {
                ele.click();
            }
        }
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}
