package login;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureArea;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin(){
       LoginPage loginPage = homePage.clickFormAuthentication();
       loginPage.setUsername("tomsmith");
       loginPage.setPassword("SuperSecretPassword!");
       SecureArea secureArea = loginPage.clickOnLogin();
       Assert.assertTrue(secureArea.verifyLoginSuccessful().contains("You logged into a secure area!"));
    }
}
