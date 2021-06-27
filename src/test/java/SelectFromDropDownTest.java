import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SelectFromDropDownTest extends BaseTest {

    @Test
    public void testDropDownElement() throws InterruptedException {
        //option to be selected: "Option 1"
        String option = "Option 1";

        homePage.clickOnDropDown();
        dropDownPage.selectOptionFromDropdown(option);

        Assert.assertEquals(dropDownPage.getSelectedOptions().size(), 1, "incorrect size");
        Assert.assertTrue(dropDownPage.getSelectedOptions().contains(option), "option mismatch");
        Assert.assertEquals(dropDownPage.getSelectedOptionValue(), option);
    }

    @AfterTest
    public void closeTest() {
        System.out.println("Test complete!");
    }
}
