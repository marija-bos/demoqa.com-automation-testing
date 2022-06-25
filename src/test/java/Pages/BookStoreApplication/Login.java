package Pages.BookStoreApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

    public WebDriver driver;

    By bookStoreUserNameField = By.id("userName");
    By bookStorePasswordField = By.id("password");
    By bookStoreLoginButton = By.id("login");

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getBookStoreUserName(){
        return driver.findElement(bookStoreUserNameField);
    }

    public WebElement getBookStorePassword(){
        return driver.findElement(bookStorePasswordField);
    }

    public WebElement getBookStoreLoginButton(){
        return driver.findElement(bookStoreLoginButton);
    }

    public void bookStoreUserNameFill(String a){
        getBookStoreUserName().sendKeys(a);
    }

    public void bookStorePasswordFill(String b){
        getBookStorePassword().sendKeys(b);
    }

    public void bookStoreSubmitButtonClick(){
        getBookStoreLoginButton().click();
    }
}
