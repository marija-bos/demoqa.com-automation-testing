package NavigatePages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FormsNavigate {
    public WebDriver driver;

    By practiceForm = By.xpath("//*[@class=\"element-list collapse show\"]/ul/li");

    public FormsNavigate(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getPracticeForm(){
        return driver.findElement(practiceForm);
    }

    public void visitPracticeForms(){
        Actions action = new Actions(driver);
        action.moveToElement(getPracticeForm()).click().build().perform();
    }

    public void visitPracticeForm(){
        driver.navigate().to("https://demoqa.com/automation-practice-form");
    }
}
