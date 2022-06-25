package Pages.Forms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class PracticeForm {

    public WebDriver driver;

    By formFirstName = By.id("firstName");
    By formLastName = By.id("lastName");
    By formEmail = By.id("userEmail");
    By formRadioGenderMale = By.cssSelector("label[for='gender-radio-1']");
    By formRadioGenderFemale = By.cssSelector("label[for='gender-radio-2']");
    By formRadioGenderOther = By.cssSelector("label[for='gender-radio-1']");
    By formUserNumber = By.id("userNumber");
    By formDateOfBirth = By.id("dateOfBirthInput");
    By formSubjects = By.id("subjectsInput");
    By formBoxHobbiesSports = By.cssSelector("label[for='hobbies-checkbox-1']");
    By formBoxHobbiesReading = By.cssSelector("label[for='hobbies-checkbox-2']");
    By formBoxHobbiesMusic = By.cssSelector("label[for='hobbies-checkbox-3']");
    By formUploadPicture = By.id("uploadPicture");
    By formCurrentAddress = By.id("currentAddress");
    By formSelectCity = By.id("react-select-3-input");
    By formSelectState = By.xpath("react-select-4-input");

    By formChooseDate = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[1]");
    By formChooseMonth = By.className("react-datepicker__month-select");
    By formChooseYear = By.className("react-datepicker__year-select");
    public void formUploadPicture(String path){
        driver.findElement(formUploadPicture).sendKeys(path);
    }

    public PracticeForm(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFormFirstName(){
        return driver.findElement(formFirstName);
    }

    public void formFirstNameFill(String a){
        getFormFirstName().sendKeys(a);
    }

    public WebElement getFormLastName(){
        return driver.findElement(formLastName);
    }

    public void formLastNameFill(String b){
        getFormLastName().sendKeys(b);
    }

    public WebElement getFormEmail(){
        return driver.findElement(formEmail);
    }

    public void formEmailFill(String c){
        getFormEmail().sendKeys(c);
    }

    public WebElement getFormRadioGenderMale(){
        return driver.findElement(formRadioGenderMale);
    }

    public void formRadioGenderMaleClick(){
        getFormRadioGenderMale().click();
    }

    public WebElement getFormSelectCityDropdown(){
        return driver.findElement(formSelectCity);
    }

    public WebElement getFormUserNumber(){
        return driver.findElement(formUserNumber);
    }

    public void formUserNumberFill(String a){
        getFormUserNumber().sendKeys(a);
    }

    public WebElement getFormHobbiesMusic(){
        return driver.findElement(formBoxHobbiesMusic);
    }
    public WebElement getFormHobbiesSports(){
        return driver.findElement(formBoxHobbiesSports);
    }

    public WebElement getFormHobbiesReading(){
        return driver.findElement(formBoxHobbiesReading);
    }

    public void formHobbiesMusicSelect(){
        getFormHobbiesMusic().click();
    }

    public void formHobbiesSportsClick(){
        getFormHobbiesSports().click();
    }
    public void formHobbiesReadingClick(){
        getFormHobbiesReading().click();
    }

    public WebElement getFormSubjects(){
        return driver.findElement(formSubjects);
    }

    public void formSubjectsFill(String a){
        Actions action = new Actions(driver);
        action.moveToElement(getFormSubjects()).click().sendKeys(a).sendKeys(Keys.ENTER).build().perform();
    }

    public WebElement getFormCurrentAddress(){
        return driver.findElement(formCurrentAddress);
    }

    public void formCurrentAddressFill(String b){
        getFormCurrentAddress().sendKeys(b);
    }

    public void formSelectState(int i){
        Select select = new Select(driver.findElement(formSelectState));
        select.selectByIndex(i);
    }

    public void formSelectCity(int i){
        Select select = new Select(driver.findElement(formSelectCity));
        select.selectByIndex(i);
    }
    public WebElement formDatePicker(){
        return driver.findElement(formDateOfBirth);
    }

    public void formDatePickerSelect(){
        formDatePicker().click();
    }

    public void formSelectDate(){
        formDatePickerSelect();
//        ArrayList<WebElement> years = new ArrayList<>(driver.findElements(formChooseYear));
//        years.get(31).click();
//        ArrayList<WebElement> months = new ArrayList<>(driver.findElements(formChooseMonth));
//        months.get(0).click();
        driver.findElement(formChooseDate).click();
    }


}
