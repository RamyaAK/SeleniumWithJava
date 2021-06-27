package Alerts;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestingAlerts extends BaseTest {
    @Test(priority = 1)
    public void testJavaScriptAlerts() throws InterruptedException {
        homePage.clickOnJavaScriptAlert();

        javaScriptAlertPage.clickOnTriggerAlertButton()
                .acceptAlert();
        Assert.assertEquals(javaScriptAlertPage.getResult(), "You successfully clicked an alert");

        javaScriptAlertPage.clickOnTriggerConfirmButton()
                .dismissAlert();
        Assert.assertEquals(javaScriptAlertPage.getResult(), "You clicked: Cancel");

        String text = "Ramya Rocks!";
        javaScriptAlertPage.clickOnTriggerPromptButton()
                .promptAlert(text)
                .acceptAlert();
        System.out.println(javaScriptAlertPage.getResult());
        Assert.assertEquals(javaScriptAlertPage.getResult(), "You entered: Ramya Rocks!");

    }

    @AfterTest
    public void closeTest() {
        System.out.println("Test complete!");
    }
}
