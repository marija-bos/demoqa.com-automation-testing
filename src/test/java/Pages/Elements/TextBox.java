package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBox {
    public WebDriver driver;

//    https://demoqa.com/text-box

    By textBoxUserName = By.id("userName");
    By textBoxUserEmail = By.id("userEmail");
    By textBoxCurrentAddress = By.id("currentAddress");
    By textBoxPermanentAddress = By.id("permanentAddress");
    By textBoxSubmitButton = By.id("submit");

    public TextBox(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getTextBoxUsername(){
        return driver.findElement(textBoxUserName);
    }

    public WebElement getTextBoxUserEmail(){
        return driver.findElement(textBoxUserEmail);
    }

    public WebElement getTextBoxCurrentAddress(){
        return driver.findElement(textBoxCurrentAddress);
    }

    public WebElement getTextBoxPermanentAddress(){
        return driver.findElement(textBoxPermanentAddress);
    }

    public void textBoxUsernameFill(String a){
        getTextBoxUsername().sendKeys(a);
    }
    public void textBoxUserEmailFill(String b){
        getTextBoxUserEmail().sendKeys(b);
    }
    public void textBoxCurrentAddressFill(String c){
        getTextBoxCurrentAddress().sendKeys(c);
    }

    public void textBoxPermanentAddressFill(String d){
        getTextBoxPermanentAddress().sendKeys(d);
    }

    public void textBoxSubmit(){
        driver.findElement(textBoxSubmitButton).click();
    }

}
