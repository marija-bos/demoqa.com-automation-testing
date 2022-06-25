package Tests.ElementsTests;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonTest extends BasePage {



    @BeforeMethod
    public void setUp() {
        driver.navigate().to(url);
        wdwait.until(ExpectedConditions.elementToBeClickable(navigate.getElement()));
        navigate.navigateToElement();
        scroll();
        wdwait.until(ExpectedConditions.elementToBeClickable(elementnavigate.getRadioButton()));
        elementnavigate.visitRadioButton();
    }

    @Test
    public void clickYes(){
        radiobutton.radioButtonYesSelect();
        Assert.assertTrue(radiobutton.getRadioButtonOutputText().isDisplayed());
    }

    @Test
    public void clickImpressive(){
        radiobutton.radioButtonImpressiveSelect();
        Assert.assertTrue(radiobutton.getRadioButtonOutputText().isDisplayed());
    }

    @Test
    public void clickNo(){
        wdwait.until(ExpectedConditions.elementToBeClickable(radiobutton.getRadioButtonNo()));
        if(radiobutton.getRadioButtonNo().isDisplayed()){
            radiobutton.radioButtonNoSelect();
        }
        else {
         action = new Actions(driver);
         action.moveToElement(radiobutton.getRadioButtonNo()).build().perform();
         Assert.assertEquals(radiobutton.getRadioButtonNo().getCssValue("cursor"), "disabled");
        }
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
