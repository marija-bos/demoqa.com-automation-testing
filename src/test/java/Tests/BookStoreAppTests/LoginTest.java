package Tests.BookStoreAppTests;

import BasePage.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BasePage{

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(url);
        wdwait.until(ExpectedConditions.elementToBeClickable(navigate.getBookstore()));
        navigate.navigateToBookstore();
        scroll();
        wdwait.until(ExpectedConditions.elementToBeClickable(bookStoreNavigate.getBookStoreLogin()));
        bookStoreNavigate.bookStoreLoginVisit();
    }

    @Test
    public void testLogin() throws InterruptedException {
        bookstorelogin.bookStoreUserNameFill("ImePrezimenkovic");
        bookstorelogin.bookStorePasswordFill("Sifra12345!");
        bookstorelogin.bookStoreSubmitButtonClick();
        Thread.sleep(1500);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/profile");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
