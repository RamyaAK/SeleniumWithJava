package forgotPassword;

import Base.BaseTest;
import constants.UserProperties;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ForgotPasswordFormTest extends BaseTest {
    UserProperties user = new UserProperties();

    @BeforeTest
    public void initializeTestData() {
        user.setEmail("ramya@gmail.com");
    }

    @Test(enabled=false)
    public void testForgotPasswordForm() throws InterruptedException {
        homePage.clickOnForgotPasswordLink();
        System.out.println("clicked on forgot Password link");
        forgotPasswordPage.enterEmailId(user.getEmail())
                          .submitRecoveryEmailId();
    }
    @AfterTest
    public void closeTest(){
        System.out.println("Test complete!");
    }

}
