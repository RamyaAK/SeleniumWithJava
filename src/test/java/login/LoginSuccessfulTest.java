package login;

import Base.BaseTest;
import org.testng.Assert;
import constants.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginSuccessfulTest extends BaseTest {
    UserProperties user = new UserProperties();


    @BeforeTest
    public void initializeTestData() {
        user.setUsername("tomsmith");
        user.setPassword("SuperSecretPassword!");
    }

    @Test(priority = 1)
    public void testSuccessfulLogin() {
        homePage.clickOnLoginForm();

        loginPage.setUsername(user.getUsername())
                .setPassword(user.getPassword())
                .clickOnLogin();
                Assert.assertTrue(secureArea.verifyLoginSuccessful().contains("You logged into a secure area!"));
                System.out.println("logged In successfully!");
                loginPage.clickOnLogout();
                Assert.assertTrue(loginPage.getAlertMessage().contains("You logged out of the secure area!"));
                System.out.println("logged out successfully!");

    }

    @Test
    public void testInvalidCredentialsLogin() throws InterruptedException {
        Thread.sleep(5000);
        homePage.clickOnLoginForm();
        loginPage.setUsername("xyz")
                .setPassword("12e3")
                .clickOnLogin();
        Assert.assertTrue(loginPage.getAlertMessage().contains("Your username is invalid!"));
    }

    @AfterTest
    public void closeTest(){
        System.out.println("Test complete!");
    }
}
