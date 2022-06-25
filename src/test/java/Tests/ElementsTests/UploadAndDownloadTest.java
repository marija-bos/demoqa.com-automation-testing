package Tests.ElementsTests;

import BasePage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UploadAndDownloadTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(url);
        wdwait.until(ExpectedConditions.elementToBeClickable(navigate.getElement()));
        navigate.navigateToElement();
        scroll();
        scroll();
        scroll();
        wdwait.until(ExpectedConditions.elementToBeClickable(elementnavigate.getUploadAndDownload()));
        elementnavigate.visitUploadAndDownload();
    }


    @Test
    public void testDownload() {
        uploadAndDownload.uploadAndDownloadDownloadClick();
    }

    @Test
    public void testUpload() {
        uploadAndDownload.uploadFile("C:\\Users\\vihor\\Downloads\\sampleFile.jpeg");
        Assert.assertTrue(uploadAndDownload.uploadedFileGetTxt() != null);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
