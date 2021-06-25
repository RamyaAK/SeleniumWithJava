package login;

import Base.BaseTest;
import constants.*;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginInvalidCredentialsTest extends BaseTest {
    UserProperties user = new UserProperties();

    @BeforeTest
    public void initializeTestData() {
        user.setUsername("xyz");
        user.setPassword("12e3@word");
    }

    @Test
    public void testInvalidCredentialsLogin() throws InterruptedException {
        homePage.clickOnLoginForm();
        loginPage.setUsername(user.getUsername())
                .setPassword(user.getPassword())
                .clickOnLogin();
        Assert.assertTrue(loginPage.getAlertMessage().contains("Your username is invalid!"));
        System.out.println("Invalid username/password! Your Login attempt has failed, Please Try with valid credentials!");
    }

    @AfterTest
    public void closeTest() {
        System.out.println("Test complete!");
    }
}
