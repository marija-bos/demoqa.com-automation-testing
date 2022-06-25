package Tests.ElementsTests;

import BasePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.fail;

public class CheckBoxTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(url);
        wdwait.until(ExpectedConditions.elementToBeClickable(navigate.getElement()));
        navigate.navigateToElement();
        scroll();
        scroll();
        wdwait.until(ExpectedConditions.elementToBeClickable(elementnavigate.getCheckBox()));
        elementnavigate.visitCheckBox();
    }

    @Test
    public void testHome() throws InterruptedException {
        checkbox.expandHome();
        checkbox.expandUnderHome();
        Thread.sleep(2000);
        checkbox.expandUnderDocuments();
        checkbox.expandUnderDownloads();
        checkbox.checkBoxClick();
        Thread.sleep(2000);
        for(WebElement we : checkbox.getAllResults()){
            if(!checkbox.resultText().contains(we.getText())){
                fail();
            }
        }
    }



    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
