package AdvancedInteractions;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pages.FigureCaptionBlock;

public class HoverOverImageTest extends BaseTest {
    @Test
    public void testSuccessfulHoverOverImage() {
        homePage.clickOnHovers();
        FigureCaptionBlock caption = hoversPage.hoverOverFigure(1);
        Assert.assertTrue(caption.isCaptionDisplayed(),"Caption is Displayed");
        Assert.assertEquals(caption.getTitle(),"name: user1");
        Assert.assertEquals(caption.getLink(),"https://the-internet.herokuapp.com/users/1");

    }

    @AfterTest
    public void closeTest(){
        System.out.println("Test complete!");
    }

}
