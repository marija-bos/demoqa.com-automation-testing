package Tests.ElementsTests;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonsTest extends BasePage{




        @BeforeMethod
        public void setUp(){
            driver.navigate().to(url);
            wdwait.until(ExpectedConditions.elementToBeClickable(navigate.getElement()));
            navigate.navigateToElement();
            scroll();
            wdwait.until(ExpectedConditions.elementToBeClickable(elementnavigate.getButtons()));
            elementnavigate.visitButtons();
        }


        @Test
        public void doubleClick() throws InterruptedException {
            button.buttonsDoubleClickAction();
            wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("doubleClickMessage")));
            Assert.assertTrue(driver.findElement(By.id("doubleClickMessage")).isDisplayed());
        }

    @Test
    public void rightClick() throws InterruptedException {
        elementnavigate.visitButtons();
        button.buttonsRightClickAction();
            wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("rightClickMessage")));
            Assert.assertTrue(driver.findElement(By.id("rightClickMessage")).isDisplayed());
    }

    @Test
    public void meClick() throws InterruptedException {
        elementnavigate.visitButtons();
        button.buttonsClickMeAction();
            wdwait.until(ExpectedConditions.presenceOfElementLocated(By.id("dynamicClickMessage")));
            Assert.assertTrue(driver.findElement(By.id("dynamicClickMessage")).isDisplayed());
    }

        @AfterMethod
        public void tearDown() {
            driver.quit();
        }

}
