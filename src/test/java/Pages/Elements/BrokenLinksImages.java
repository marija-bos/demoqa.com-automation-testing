package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenLinksImages {


    public WebDriver driver;


    By brokenLIValidImage = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/img[1]");
    By brokenLIBrokenImage = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/img[2]");
    By brokenLIValidLink = By.linkText("Click Here for Valid Link");
    By brokenLIBrokenLink = By.linkText("Click Here for Broken Link");

    public BrokenLinksImages(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getBrokenLIValidImage(){
        return driver.findElement(brokenLIValidImage);
    }

    public WebElement getBrokenLIBrokenImage(){
        return driver.findElement(brokenLIBrokenImage);
    }

    public WebElement getBrokenLIValidLink(){
        return driver.findElement(brokenLIValidLink);
    }

    public WebElement getBrokenLIBrokenLink(){
        return driver.findElement(brokenLIBrokenLink);
    }

    public void brokenLIBrokenLinkClick(){
        getBrokenLIBrokenLink().click();
    }

    public void brokenLIValidLinkClick(){
        getBrokenLIValidLink().click();
    }
}
