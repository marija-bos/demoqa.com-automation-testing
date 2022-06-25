package NavigatePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ElementsNavigate {

//    https://demoqa.com/elements

    public WebDriver driver;

    By textBox = By.id("item-0");
    By checkBox = By.id("item-1");
    By radioButton = By.id("item-2");
    By webTables = By.id("item-3");
    By buttons = By.id("item-4");
    By links = By.id("item-5");
    By brokenLinks = By.id("item-6");
    By uploadAndDownload = By.id("item-7");
    By dynamicProperties = By.id("item-8");






    public ElementsNavigate(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getTextBox(){
        return driver.findElement(textBox);
    }

    public WebElement getCheckBox(){
        return driver.findElement(checkBox);
    }

    public WebElement getRadioButton(){
        return driver.findElement(radioButton);
    }

    public WebElement getWebTables(){
        return driver.findElement(webTables);
    }

    public WebElement getButtons(){
        return driver.findElement(buttons);
    }

    public WebElement getLinks(){
        return driver.findElement(links);
    }

    public WebElement getBrokenLinks(){
        return driver.findElement(brokenLinks);

    }

    public WebElement getUploadAndDownload(){
        return driver.findElement(uploadAndDownload);
    }

    public void visitUploadAndDownload(){
        getUploadAndDownload().click();
    }

    public WebElement getDynamicProperties(){
        return driver.findElement(dynamicProperties);
    }

    public void visitTextBox(){
        getTextBox().click();
    }

    public void visitCheckBox(){
        getCheckBox().click();
    }

    public void visitRadioButton(){
        getRadioButton().click();
    }

    public void visitWebTables(){
        getWebTables().click();
    }

    public void visitButtons(){
        getButtons().click();
    }

    public void visitLinks(){
        getLinks().click();
    }

    public void visitBrokenLinks(){
        getBrokenLinks().click();
    }

    public void visitDynamicProperties(){
        getDynamicProperties().click();
    }



}
