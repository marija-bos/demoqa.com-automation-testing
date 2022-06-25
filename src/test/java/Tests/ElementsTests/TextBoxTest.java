package Tests.ElementsTests;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(url);
        wdwait.until(ExpectedConditions.elementToBeClickable(navigate.getElement()));
        navigate.navigateToElement();
        scroll();
        wdwait.until(ExpectedConditions.elementToBeClickable(elementnavigate.getTextBox()));
        elementnavigate.visitTextBox();
    }

    @Test
    public void fillOutTheTextBox(){
        textbox.textBoxUsernameFill("Name");
        textbox.textBoxUserEmailFill("email@email.com");
        textbox.textBoxCurrentAddressFill("Address line 1");
        textbox.textBoxPermanentAddressFill("Address line 2");
        scroll();
        textbox.textBoxSubmit();
        Assert.assertTrue(driver.findElement(By.id("output")).isDisplayed());
    }

    @Test
    public void invalidEmail(){
        textbox.textBoxUsernameFill("Name");
        textbox.textBoxUserEmailFill("email");
        textbox.textBoxCurrentAddressFill("Address line 1");
        textbox.textBoxPermanentAddressFill("Address line 2");
        scroll();
        textbox.textBoxSubmit();
        Assert.assertFalse(driver.findElement(By.id("output")).isDisplayed());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
