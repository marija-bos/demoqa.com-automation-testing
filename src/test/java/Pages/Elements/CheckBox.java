package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CheckBox {
    public WebDriver driver;

//    By checkBoxExpandHome = By.cssSelector(".rct-icon-expand-close");
//    By checkBoxCheckHome = By.cssSelector(".rct-icon-uncheck");
//    By checkBoxExpandAll = By.cssSelector(".rct-icon-expand-all");
//    By checkBoxCollapseAll = By.cssSelector(".rct-icon-collapse-all");
//    By checkBoxCheck = By.className("rct-title");
//    By checkBoxOutputText = By.id("result");
    By home = By.xpath("//*[@class=\"rct-text\"]/button");
    By underHome = By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li/span/button");
    By underDocuments = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/ol/li[3]/span/button");
    By underDownloads = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/ol/li[2]/span/button");
    By checkbox = By.className("rct-checkbox");
    By response=By.className("text-success");
    By message=By.id("result");

    By title = By.className("rct-title");
    public CheckBox(WebDriver driver) {
        this.driver = driver;
    }

    public ArrayList<WebElement> getAllNames(){
        ArrayList<WebElement> names = new ArrayList<>(driver.findElements(title));
        return names;
    }

    public String resultText(){
        return driver.findElement(message).getText();
    }

    public ArrayList<WebElement> getAllResults(){
        ArrayList<WebElement> results = new ArrayList<>(driver.findElements(response));
        return results;
    }
    public void expandHome(){
        driver.findElement(home).click();
    }

    public void expandUnderHome(){
        driver.findElement(underHome).click();

    }

    public void expandUnderDocuments(){
        driver.findElement(underDocuments).click();
    }

    public void expandUnderDownloads(){
        driver.findElement(underDownloads).click();
    }

    public void checkBoxClick(){
        driver.findElement(checkbox).click();
    }


}
