package Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadAndDownload {

    public WebDriver driver;

    public By uploadAndDownloadDownload = By.id("downloadButton");
    public By uploadAndDownloadUpload = By.id("uploadFile");
    public By fileUploadedTxt = By.id("uploadedFilePath");

    public UploadAndDownload(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUploadAndDownloadDownload(){
        return driver.findElement(uploadAndDownloadDownload);
    }

    public WebElement getUploadAndDownloadUpload(){
        return driver.findElement(uploadAndDownloadUpload);
    }

    public void uploadAndDownloadDownloadClick(){
        getUploadAndDownloadDownload().click();
    }

    public void uploadAndDownloadUploadCLick(){
        getUploadAndDownloadUpload().click();
    }

    public void uploadFile(String path){
        getUploadAndDownloadUpload().sendKeys(path);
    }

    public String uploadedFileGetTxt(){
       return driver.findElement(fileUploadedTxt).getText();
    }
}
