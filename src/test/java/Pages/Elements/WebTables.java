package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebTables {

    public WebDriver driver;


    public By webTablesAddButton = By.id("addNewRecordButton");
    public By webTablesSearchBox = By.className("form-control");
    public By webTablesTableBody = By.className("rt-tbody");
    public By webTablesField = By.className("rt-td");
    public By webTablesFirstName = By.id("firstName");
    public By webTablesLastName = By.id("lastName");
    public By webTablesEmail = By.id("userEmail");
    public By webTablesAge = By.id("age");
    public By webTablesSalary = By.id("salary");
    public By webTablesDepartment = By.id("department");
    public By webTablesSubmitButton = By.id("submit");
    public By webTablesEditRecord1 = By.id("edit-record-1");
    public By webTablesEditRecord2 = By.id("edit-record-2");
    public By webTablesEditRecord3 = By.id("edit-record-3");
    public By webTablesDeleteRecord1 = By.id("delete-record-1");
    public By webTablesDeleteRecord2 = By.id("delete-record-2");
    public By webTablesDeleteRecord3 = By.id("delete-record-3");
    public By webTablesJumpPage = By.className("-pageJump");
    public By webTablesRows = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]/span[2]/select");

    public WebTables(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getWebTablesAddButton(){
        return driver.findElement(webTablesAddButton);
    }

    public void webTablesAddRecordFill(){
        getWebTablesAddButton().click();
    }

    public WebElement getWebTablesSearchBox(){
        return driver.findElement(webTablesSearchBox);
    }

    public String getWebtablesTableBodyText(){
        return driver.findElement(webTablesTableBody).getText();
    }
    public WebElement getWebTablesUsername(){
        return driver.findElement(webTablesFirstName);
    }
    public void webTablesSearch(String s){
        driver.findElement(webTablesSearchBox).sendKeys(s);
    }

    public void webTablesFillUserName(String a){
        driver.findElement(webTablesFirstName).sendKeys(a);
    }

    public void webTablesFillLastName(String b){
        driver.findElement(webTablesLastName).sendKeys(b);
    }

    public void webTablesFillEmail(String c){
        driver.findElement(webTablesEmail).sendKeys(c);
    }

    public void webTablesFillAge(String d){
        driver.findElement(webTablesAge).sendKeys(d);
    }

    public void webTablesFillSalary(String e){
        driver.findElement(webTablesSalary).sendKeys(e);
    }

    public void webTablesFillDepartment(String f){
        driver.findElement(webTablesDepartment).sendKeys(f);
    }

    public void webTablesSubmitForm(){
        driver.findElement(webTablesSubmitButton).click();
    }

    public WebElement getWebTablesDeleteRecord1(){
        return driver.findElement(webTablesDeleteRecord1);
    }

    public void webTablesDeleteRecordOne(){
        getWebTablesDeleteRecord1().click();
    }

    public WebElement getWebTablesEditRecord1(){
        return driver.findElement(webTablesEditRecord1);
    }

    public void webTablesEditRecordOne(){
        getWebTablesEditRecord1().click();
    }

    public void webTablesJumpPage(String i){
        driver.findElement(webTablesJumpPage).clear();
        driver.findElement(webTablesJumpPage).sendKeys("i");
    }

    public void webTablesDropdownMenu(int i){
        Select select = new Select(driver.findElement(webTablesRows));
        select.selectByIndex(i);
    }
}
