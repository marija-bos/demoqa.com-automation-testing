package NavigatePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookStoreNavigate {

    public WebDriver driver;

    By bookStoreLogin = By.xpath("//*[@class=\"element-list collapse show\"]/ul/li");

    By bookStoreProfile = By.xpath("//*[@id=\"item-3\"]");

    public BookStoreNavigate(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getBookStoreLogin(){
        return driver.findElement(bookStoreLogin);
    }

    public void bookStoreLoginVisit(){
        getBookStoreLogin().click();
    }
}
