package NavigatePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Navigate {
    public final String url = "https://demoqa.com/";
    public WebDriver driver;

    By element = By.cssSelector("div.card:nth-child(1)");  //moraju svi cssselector!!!!!
    By forms = By.cssSelector("div.card:nth-child(2)");
    By alerts = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[3]/div/div[2]");
    By widgets = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[4]/div/div[2]");
    By interactions = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[5]/div/div[2]/svg");
    By bookstore = By.cssSelector("div.card:nth-child(6)");



    public Navigate(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElement(){
        return driver.findElement(element);
    }

    public WebElement getForms(){
        return driver.findElement(forms);
    }

    public WebElement getAlerts(){
        return driver.findElement(alerts);
    }

    public WebElement getWidgets(){
        return driver.findElement(widgets);
    }

    public WebElement getInteractions(){
        return driver.findElement(interactions);
    }

    public WebElement getBookstore(){
        return driver.findElement(bookstore);
    }

    public void navigateToElement(){
        getElement().click();
    }

    public void navigateToForms(){
        getForms().click();
    }

    public void navigateToAlerts(){
        getAlerts().click();
    }
    public void navigateToWidgets(){
        getWidgets().click();
    }

    public void navigateToInteractions(){
        getInteractions().click();
    }
    public void navigateToBookstore(){
        getBookstore().click();
    }


}
