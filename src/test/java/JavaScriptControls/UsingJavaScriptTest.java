package JavaScriptControls;

import Base.BaseTest;
import org.testng.annotations.Test;

public class UsingJavaScriptTest extends BaseTest {
    @Test
    public void testScrollTable(){
        homePage.clickOnDeepDomLink();
        deepDomPage.scrollToTable();
    }
}
