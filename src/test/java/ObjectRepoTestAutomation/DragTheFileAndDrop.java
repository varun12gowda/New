package ObjectRepoTestAutomation;

import A_GenericLibrary.Base_Class;
import A_GenericLibrary.WebDriver_Utility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static A_GenericLibrary.Base_Class.driver;

public class DragTheFileAndDrop {
    WebDriver_Utility utility=new WebDriver_Utility(driver);

    public DragTheFileAndDrop(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//div[@id=\"draggable\"]")
    private WebElement todragFromScr;// the file present beside the dropdown to drop it

    @FindBy(xpath = "//div[@id=\"droppabled\"]")
    private WebElement toDromToDsc;// the dropdown place


    public void dragAndDropDownAFile() throws InterruptedException {
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView(true);", todragFromScr);

//        Thread.sleep(5000);// used just to verify it will be deleted and implicitly wait will be used
        utility.dragAndDropDown(todragFromScr,toDromToDsc);//this will pass to the utility class
    }

}
