package Tests.FormsTests;

import BasePage.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeFormTest extends BasePage {

    @BeforeMethod
    public void setUp() {
        driver.navigate().to(url);
        wdwait.until(ExpectedConditions.elementToBeClickable(navigate.getForms()));
        navigate.navigateToForms();
        scroll();
        wdwait.until(ExpectedConditions.elementToBeClickable(formsNavigate.getPracticeForm()));
        formsNavigate.visitPracticeForms();}

    @Test
    public void testFillOutTheForm() {
        practiceform.formFirstNameFill("Name");
        practiceform.formLastNameFill("Lastname");
        practiceform.formEmailFill("email@email.com");
        practiceform.formRadioGenderMaleClick();
        practiceform.formUserNumberFill("12345678");
        practiceform.formSelectDate();
        scroll();
        practiceform.formSubjectsFill("History");
        practiceform.formHobbiesReadingClick();
        practiceform.formUploadPicture("C:\\Users\\vihor\\Downloads\\sampleFile.jpeg");
        practiceform.formCurrentAddressFill("Address line 1");
//        practiceform.formSelectState(2);
//        practiceform.formSelectCity(2);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
