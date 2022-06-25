package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicProperties {

    public WebDriver driver;
    public WebDriverWait wdwait;

    By dynamicPropertiesEnableAfter = By.id("enableAfter");
    By dynamicPropertiesColorChange = By.id("colorChange");
    By dynamicPropertiesVisibleAfter = By.id("visibleAfter");

    public DynamicProperties(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }

    public WebElement getDynamicPropertiesEnableAfter(){
        return driver.findElement(dynamicPropertiesEnableAfter);
    }

    public WebElement getDynamicPropertiesColorChange(){
        return driver.findElement(dynamicPropertiesColorChange);
    }

    public WebElement getDynamicPropertiesVisibleAfter(){
        return driver.findElement(dynamicPropertiesVisibleAfter);
    }

    public void dynamicPropertiesEnableAfterClick() throws InterruptedException {
        wdwait.until(ExpectedConditions.elementToBeClickable(getDynamicPropertiesEnableAfter()));
        getDynamicPropertiesEnableAfter().click();
    }

    public void dynamicPropertiesColorChangeClick(){
        getDynamicPropertiesColorChange().click();
    }

    public void dynamicPropertiesVisibleAfterClick(){
        wdwait.until(ExpectedConditions.presenceOfElementLocated(dynamicPropertiesVisibleAfter));
        getDynamicPropertiesVisibleAfter().click();
    }
}
