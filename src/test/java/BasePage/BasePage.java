package BasePage;

import NavigatePages.BookStoreNavigate;
import NavigatePages.ElementsNavigate;
import NavigatePages.FormsNavigate;
import Pages.BookStoreApplication.BookStore;
import Pages.BookStoreApplication.Login;
import Pages.BookStoreApplication.Profile;
import Pages.Elements.*;
import Pages.Forms.PracticeForm;
import NavigatePages.Navigate;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BasePage {

    public final String url = "https://demoqa.com/";
    public WebDriverManager wmd;
    public WebDriver driver;
    public Actions action;
    public WebDriverWait wdwait;
    public Navigate navigate;
    public ElementsNavigate elementnavigate;
    public TextBox textbox;
    public CheckBox checkbox;
    public RadioButton radiobutton;
    public Buttons button;
    public Links link;
    public WebTables wtable;
    public BrokenLinksImages brokenlinks;

    public JavascriptExecutor js;

    public DynamicProperties dynamicproperty;

    public PracticeForm practiceform;

    public FormsNavigate formsNavigate;

    public UploadAndDownload uploadAndDownload;
    public BookStoreNavigate bookStoreNavigate;

    public Login bookstorelogin;

    public BookStore bookStore;

    public Profile profile;

    @BeforeClass
    public void beforeClass(){
        wmd = new ChromeDriverManager();
        wmd.setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        navigate = new Navigate(driver);
        elementnavigate = new ElementsNavigate(driver);
        textbox = new TextBox(driver);
        checkbox = new CheckBox(driver);
        radiobutton = new RadioButton(driver, action);
        button = new Buttons(driver, action);
        link = new Links(driver);
        wtable = new WebTables(driver);
        js = (JavascriptExecutor)driver;
        action = new Actions(driver);
        brokenlinks = new BrokenLinksImages(driver);
        dynamicproperty = new DynamicProperties(driver, wdwait);
        practiceform = new PracticeForm(driver);
        formsNavigate = new FormsNavigate(driver);
        uploadAndDownload = new UploadAndDownload(driver);
        bookStoreNavigate = new BookStoreNavigate(driver);
        bookstorelogin = new Login(driver);
        bookStore = new BookStore(driver);
        profile = new Profile(driver);

    }

    public void scroll(){
        js.executeScript("window.scrollBy(0,100)", "");
    }



//    @AfterClass
//    public void afterClass(){
//        wdwait = null;
//        driver.quit();
//        driver = null;
//        wmd = null;
//    }

}
