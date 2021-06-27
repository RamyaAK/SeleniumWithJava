package Wait_Strategies;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ExplictWaitTest extends BaseTest {
    @Test
    public void testExplicitWait() {
        homePage.clickOnDynamicLoading();
        dynamicLoadingPage.clickOnExample1()
                .clickOnStartButton()
                .waitForTextToAppear();
        System.out.println(dynamicLoadingPage.getLoadedText());
        Assert.assertEquals(dynamicLoadingPage.getLoadedText(), "Hello World!");
    }

    @AfterTest
    public void closeTest() {
        System.out.println("Test complete!");
    }

}
