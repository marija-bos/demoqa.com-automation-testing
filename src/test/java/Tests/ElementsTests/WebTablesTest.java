package Tests.ElementsTests;

import BasePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class WebTablesTest extends BasePage {
    @BeforeMethod
    public void setUp() {
        driver.navigate().to(url);
        wdwait.until(ExpectedConditions.elementToBeClickable(navigate.getElement()));
        navigate.navigateToElement();
        scroll();
        wdwait.until(ExpectedConditions.elementToBeClickable(elementnavigate.getWebTables()));
        elementnavigate.visitWebTables();
    }
    public ArrayList<WebElement> fields(){
        ArrayList<WebElement> allFields = new ArrayList<>(driver.findElements(wtable.webTablesField));
        return allFields;
    }
    @Test
    public void testAddRecord() {
        wtable.webTablesAddRecordFill();
        wtable.webTablesFillUserName("Name");
        wtable.webTablesFillLastName("Lastname");
        wtable.webTablesFillEmail("email@email.com");
        wtable.webTablesFillAge("32");
        wtable.webTablesFillSalary("1200");
        wtable.webTablesFillDepartment("Department");
        wtable.webTablesSubmitForm();
        wtable.webTablesSearch("Name");
        Assert.assertEquals(fields().get(0).getText(), "Name");
        }

    @Test
    public void testDeleteRecord() {
        final String firstNameInTheTable = fields().get(0).getText();
        wtable.webTablesDeleteRecordOne();
        Assert.assertNotEquals(fields().get(0).getText(), firstNameInTheTable);
    }

    @Test
    public void testEditRecord() {
        wtable.webTablesEditRecordOne();
        wtable.getWebTablesUsername().clear();
        wtable.webTablesFillUserName("Anne");
        wtable.webTablesSubmitForm();
        Assert.assertEquals(fields().get(0).getText(), "Anne");

    }

//    @Test
//    public void testJumpTables() {
//        scroll();
//        wtable.webTablesJumpPage("3");
//    }

    @Test
    public void testTableRowsChange() {
        wtable.webTablesDropdownMenu(4);
        Assert.assertEquals(fields().size(), 350);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
