package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RadioButton {

    public WebDriver driver;
    public Actions action;

    By radioButtonYes = By.cssSelector("label[for='yesRadio']");
    By radioButtonImpressive = By.cssSelector("label[for='impressiveRadio']");
    By radioButtonNo = By.cssSelector("label[for='noRadio']");
    By radioButtonOutputText = By.className("mt-3");

    public RadioButton(WebDriver driver, Actions action) {
        this.driver = driver;
        this.action = new Actions(driver);
    }

    public WebElement getRadioButtonYes(){
        return driver.findElement(radioButtonYes);
    }

    public WebElement getRadioButtonImpressive(){
        return driver.findElement(radioButtonImpressive);
    }

    public WebElement getRadioButtonNo(){
        return driver.findElement(radioButtonNo);
    }

    public WebElement getRadioButtonOutputText(){
        return driver.findElement(radioButtonOutputText);
    }

    public void radioButtonYesSelect(){
        getRadioButtonYes().click();
    }

    public void radioButtonImpressiveSelect(){
        getRadioButtonImpressive().click();
    }

    public void radioButtonNoSelect(){
        getRadioButtonNo().click();
    }
}
