package Tests.BookStoreAppTests;

import BasePage.BasePage;
import Pages.BookStoreApplication.Login;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class BookStoreTest extends BasePage {

    @BeforeMethod
    public void setUp() throws InterruptedException {
            driver.navigate().to(url);
            wdwait.until(ExpectedConditions.elementToBeClickable(navigate.getElement()));
            navigate.navigateToElement();
            scroll();
            scroll();
            wdwait.until(ExpectedConditions.elementToBeClickable(elementnavigate.getBrokenLinks()));
            elementnavigate.visitBrokenLinks();

    }

    @Test
    public void testAddBookToCart() throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<WebElement> booksToAdd = new ArrayList<>(driver.findElements(bookStore.bookStoreItemLink));
        booksToAdd.get(0).click();
        bookStore.getBookStoreAddButtons().get(1).click();
    }
}
