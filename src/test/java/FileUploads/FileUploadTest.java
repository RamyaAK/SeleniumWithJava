package FileUploads;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest {
    @Test
    public void testFileUpload() {
        homePage.clickOnFileUploadLink();
        fileUploadPage.uploadFile("/Users/ramyaakulkarni/Downloads/orders-functional-tests/selenium practice/utilities/drivers/chromedriver 4");
        System.out.println(fileUploadPage.getUploadedFiles());
        Assert.assertEquals(fileUploadPage.getUploadedFiles(),"chromedriver 4");
    }

    @AfterTest
    public void closeTest() {
        System.out.println("Test complete!");
    }
}
