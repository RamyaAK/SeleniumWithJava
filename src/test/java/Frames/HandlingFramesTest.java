package Frames;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class HandlingFramesTest extends BaseTest {
    @Test
    public void testFrames() {
        homePage.clickOnWYSIWYGLink();
        wysiswygPage.clearText()
                .setText("Hello World!")
                .clickOnIncreaseIndentButton();

        System.out.println(wysiswygPage.getTextFromEditor());
        Assert.assertEquals(wysiswygPage.getTextFromEditor(), "Hello World!");

    }

    @AfterTest
    public void closeTest() {
        System.out.println("Test complete!");
    }

}
