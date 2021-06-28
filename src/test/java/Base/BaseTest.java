package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import pages.*;

import java.io.File;
import java.io.IOException;
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
    protected DeepDomPage deepDomPage;


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
        deepDomPage = new DeepDomPage(driver);
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

    @AfterMethod
    public void recordFailedTestcase(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            try {
                // Create reference of TakesScreenshot
                TakesScreenshot ts = (TakesScreenshot) driver;

                // Call method to capture screenshot
                File screenshot = ts.getScreenshotAs(OutputType.FILE);

                try {
                    FileHandler.copy(screenshot,
                            new File("/Users/ramyaakulkarni/Downloads/orders-functional-tests/selenium practice/src/main/resources/Screenshots" + result.getName() + ".png"));
                    System.out.println("Screenshot taken");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } finally {
                System.out.println("Please Refer the screenshot to investigate test failure!");
            }
            }
        }

        @AfterClass(alwaysRun = true)
        public void tearDown () {
            driver.quit();
        }
    }
