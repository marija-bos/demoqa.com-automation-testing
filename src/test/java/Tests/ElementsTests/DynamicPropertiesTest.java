package Tests.ElementsTests;

import BasePage.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicPropertiesTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(url);
        wdwait.until(ExpectedConditions.elementToBeClickable(navigate.getElement()));
        navigate.navigateToElement();
        scroll();
        scroll();
        scroll();
        scroll();
        wdwait.until(ExpectedConditions.elementToBeClickable(elementnavigate.getDynamicProperties()));
        elementnavigate.visitDynamicProperties();
    }

    @Test
    public void testEnabledAfterFiveSecondsButton() throws InterruptedException {
        scroll();
        dynamicproperty.dynamicPropertiesEnableAfterClick();

    }

    @Test
    public void testColorChangeButton() {
        scroll();
        dynamicproperty.dynamicPropertiesColorChangeClick();
    }

    @Test
    public void testVisibleAfterFiveSecondsButton() {
        scroll();
        dynamicproperty.dynamicPropertiesVisibleAfterClick();
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
