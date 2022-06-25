package Tests.ElementsTests;

import BasePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class LinksTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(url);
        wdwait.until(ExpectedConditions.elementToBeClickable(navigate.getElement()));
        navigate.navigateToElement();
        scroll();
        scroll();
        wdwait.until(ExpectedConditions.elementToBeClickable(elementnavigate.getLinks()));
        elementnavigate.visitLinks();
    }

    @Test
    public void clickHomeLink() {
        link.linksSimpleLinkClick();
        List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }

    @Test
    public void clickDynamicLink() {
        link.linksDynamicLinkClick();
        List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }

    @Test
    public void clickCreated() throws InterruptedException {
        link.linksCreatedClick();
        Thread.sleep(2000);
        Assert.assertTrue(link.linksTextOutputShow().contains(link.getLinksCreated().getText()));
    }

    @Test
    public void clickAllApiLinks() throws InterruptedException {
        scroll();
        List<WebElement> linksToClick = new ArrayList<WebElement>();
        linksToClick.add(link.getLinksCreated());
        linksToClick.add(link.getLinksForbidden());
        linksToClick.add(link.getlinksBadRequest());
        linksToClick.add(link.getLinksMoved());
        linksToClick.add(link.getLinksNotFound());
        linksToClick.add(link.getLinksUnauthorized());
        linksToClick.add(link.getLinksNoContent());
        for(WebElement we : linksToClick){
            we.click();
            Thread.sleep(1500);
            Assert.assertTrue(link.linksTextOutputShow().contains(link.linksTextOutputShow()));
        }

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
