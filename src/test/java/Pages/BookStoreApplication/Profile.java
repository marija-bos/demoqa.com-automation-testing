package Pages.BookStoreApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class Profile {

    public WebDriver driver;

    public By bookStoreProfileTableCell = By.className("rt-td");
    public By bookStoreProfileGoToBookStore = By.id("gotoStore");
    public By bookStoreDeleteButton = By.id("submit");
    public By bookStoreSearch = By.id("searchBox");
    public By bookStoreLogOut = By.cssSelector("button.btn:nth-child(3)");
    public By bookStoreDeleteRecord = By.id("delete-record-undefined");

    public Profile(WebDriver driver) {
        this.driver = driver;
    }

    public ArrayList<WebElement> profileButtons(){
        ArrayList<WebElement> buttons = new ArrayList<>(driver.findElements(bookStoreProfileGoToBookStore));
        return buttons;
    }

    public void profileGoToBookStore(){
        profileButtons().get(0).click();
    }
}
