package Pages.BookStoreApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BookStore {

    public WebDriver driver;

    public By bookStoreSearch = By.id("searchBox");
    public By bookStoreItemLink = By.className("action-buttons");
    public By bookStoreAddToCollection = By.id("addNewRecordButton");



    public BookStore(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getBookStoreSearch(){
        return driver.findElement(bookStoreSearch);
    }

    public void bookStoreSearchInput(String a){
        getBookStoreSearch().sendKeys(a);
    }

    public ArrayList<WebElement> getBookStoreAddButtons() {
        ArrayList <WebElement> buttons = new ArrayList<>(driver.findElements(bookStoreAddToCollection));
        return buttons;
    }




}
