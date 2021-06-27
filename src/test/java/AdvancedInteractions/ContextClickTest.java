package AdvancedInteractions;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.FigureCaptionBlock;

public class ContextClickTest extends BaseTest {
    @Test
    public void testSuccessfulLogin() {
        homePage.clickOnContextMenuLink();
        contextClickPage.doubleClickOnMenuBox();
        System.out.println("Right click using ContextClick method of Actions class");
    }

    @AfterTest
    public void closeTest(){
        System.out.println("Test complete!");
    }

}
