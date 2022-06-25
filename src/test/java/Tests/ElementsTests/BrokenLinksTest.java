package Tests.ElementsTests;

import BasePage.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenLinksTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(url);
        wdwait.until(ExpectedConditions.elementToBeClickable(navigate.getElement()));
        navigate.navigateToElement();
        scroll();
        scroll();
        wdwait.until(ExpectedConditions.elementToBeClickable(elementnavigate.getBrokenLinks()));
        elementnavigate.visitBrokenLinks();
    }

    @Test
    public void testValidImage() {
        Boolean isThereAnImage = (Boolean) js
                .executeScript("return arguments[0].complete "
                        + "&& typeof arguments[0].naturalWidth != \"undefined\" "
                        + "&& arguments[0].naturalWidth > 0", brokenlinks.getBrokenLIValidImage());

        Assert.assertTrue(isThereAnImage);
    }

    @Test
    public void testBrokenImage() {
        Boolean isThereAnImage = (Boolean) js
                .executeScript("return arguments[0].complete "
                        + "&& typeof arguments[0].naturalWidth != \"undefined\" "
                        + "&& arguments[0].naturalWidth > 0", brokenlinks.getBrokenLIBrokenImage());

        Assert.assertFalse(isThereAnImage);
    }

    @Test
    public void testValidLink() {
        scroll();
        brokenlinks.brokenLIValidLinkClick();
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }

    @Test
    public void testBrokenLink() {
        scroll();
        brokenlinks.brokenLIBrokenLinkClick();
        Assert.assertEquals(driver.getCurrentUrl(), "http://the-internet.herokuapp.com/status_codes/500");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
