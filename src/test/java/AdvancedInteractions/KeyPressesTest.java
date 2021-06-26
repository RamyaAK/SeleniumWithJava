package AdvancedInteractions;

import Base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class KeyPressesTest extends BaseTest {
    @Test(priority=1)
    public void testSuccessfulKeyPress() {
        homePage.clickOnKeyPresses();
        keyPressesPage.InputText("A" + Keys.BACK_SPACE);
        Assert.assertEquals(keyPressesPage.getResults(), "You entered: BACK_SPACE");

    }

    @Test(priority=2)
    public void enterPiTest(){
        keyPressesPage.enterPi();
        Assert.assertEquals(keyPressesPage.getResults(), "You entered: 2");
    }
    @AfterTest
    public void closeTest() {
        System.out.println("Test complete!");
    }

}
