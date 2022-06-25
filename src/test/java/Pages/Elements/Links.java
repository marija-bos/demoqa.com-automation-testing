package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Links {

    public WebDriver driver;


    By linksSimpleLink = By.id("simpleLink");
    By linksDynamicLink = By.id("dynamicLink");
    By linksCreated = By.id("created");
    By linksNoContent = By.id("no-content");
    By linksMoved = By.id("moved");
    By linksBadRequest = By.id("bad-request");
    By linksUnauthorized = By.id("unauthorized");
    By linksForbidden = By.id("forbidden");
    By linksNotFound = By.id("invalid-url");
    By linksTextOutput = By.id("linkResponse");



    public Links(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLinksSimpleLink(){
        return driver.findElement(linksSimpleLink);
    }

    public void linksSimpleLinkClick(){
        getLinksSimpleLink().click();
    }

    public WebElement getLinksDynamicLink(){
        return driver.findElement(linksDynamicLink);
    }

    public void linksDynamicLinkClick(){
        getLinksDynamicLink().click();
    }

    public WebElement getLinksCreated(){
        return driver.findElement(linksCreated);
    }

    public void linksCreatedClick(){
        getLinksCreated().click();
    }

    public WebElement getLinksNoContent(){
        return driver.findElement(linksNoContent);
    }

    public void linksNoContentClick(){
        getLinksNoContent().click();
    }

    public WebElement getLinksMoved(){
        return driver.findElement(linksMoved);
    }

    public void linksMovedClick(){
        getLinksMoved().click();
    }

    public WebElement getlinksBadRequest(){
        return driver.findElement(linksBadRequest);
    }

    public void linksBadRequestClick(){
        getlinksBadRequest().click();
    }

    public WebElement getLinksUnauthorized(){
        return driver.findElement(linksUnauthorized);
    }

    public void linksUnauthorizedClick(){
        getLinksUnauthorized().click();
    }

    public WebElement getLinksForbidden(){
        return driver.findElement(linksForbidden);
    }

    public void linksForbiddenClick(){
        getLinksForbidden().click();
    }

    public WebElement getLinksNotFound(){
        return driver.findElement(linksNotFound);
    }

    public void linksNotFoundClick(){
        getLinksNotFound().click();
    }

    public String linksTextOutputShow(){
        return driver.findElement(linksTextOutput).getText();
    }
}
