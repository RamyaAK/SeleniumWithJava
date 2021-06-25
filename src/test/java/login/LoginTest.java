package login;

import Base.BaseTest;
import constants.UserProperties;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    UserProperties user = new UserProperties();


    @BeforeTest
    public void initializeTestData() {
        user.setUsername("tomsmith");
        user.setPassword("SuperSecretPassword!");
    }

    @Test
    public void testSuccessfulLogin() {

        homePage.clickOnLoginForm();

        loginPage.setUsername(user.getUsername())
                .setPassword(user.getPassword())
                .clickOnLogin();
        Assert.assertTrue(secureArea.verifyLoginSuccessful().contains("You logged into a secure area!"));
    }

    @AfterTest
    public void closeTest(){
        System.out.println("Test complete!");
    }
}
