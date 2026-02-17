package ObjectRepoTestAutomation;

import A_GenericLibrary.WebDriver_Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static A_GenericLibrary.Base_Class.driver;

public class UploadSingleFile {

    WebDriver_Utility utility=new WebDriver_Utility(driver);
    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));

    public UploadSingleFile(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//h3[@class=\"post-title entry-title\"]")
    private WebElement toDrag;

    @FindBy(xpath = "//input[@id=\"singleFileInput\"]")
    private WebElement singleFile;

    @FindBy(xpath = "//button[text()=\"Upload Single File\"]")
    private WebElement clickUploadSingleFileButton;

    public void addSingleFile(String file1){
       utility.dragAndDropDown(toDrag,singleFile);
       wait.until(ExpectedConditions.visibilityOf(singleFile));
        singleFile.sendKeys(file1);
        clickUploadSingleFileButton.click();
    }

}
