package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Buttons {

    public WebDriver driver;
    public Actions action;

    By buttonsDoubleClick = By.id("doubleClickBtn");
    By buttonsRightClick = By.id("rightClickBtn");
    By buttonsClickMe = By.cssSelector("#PlLUl");

    public Buttons(WebDriver driver, Actions action) {
        this.driver = driver;
        this.action = new Actions(driver);
    }


    public void buttonsDoubleClickAction(){
        action.doubleClick(driver.findElement(buttonsDoubleClick)).build().perform();
    }

    public void buttonsRightClickAction(){
        action.contextClick(driver.findElement(buttonsRightClick)).build().perform();
    }

    public void buttonsClickMeAction(){
        driver.findElement(buttonsClickMe).click();
    }
}
