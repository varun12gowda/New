package GenericLibrary;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_Utility extends Base_Class {

    public void dragAndDropDown(WebElement src, WebElement dest){
        Actions actions=new Actions(driver);
        actions.dragAndDrop(src, dest).perform();
    }
    public void RightClick(){
        Actions actions =new Actions(driver);
        actions.contextClick().perform();
    }
    public void doubletap(){
        Actions actions=new Actions(driver);
        actions.doubleClick().perform();
    }
    public void mouseHoveringOnElement(WebElement element){
        Actions actions=new Actions(driver);
        actions.moveToElement(element).perform();
    }
    //Handling the Dropdown
    public Select selectReferences(WebElement dropdown) {
        Select select = new Select(dropdown);
        return select;
    }
    public void handelingDropdown(WebElement dropdown, String value){
        Select select=new Select(dropdown);
        try
        {
            select.selectByVisibleText(value);
        }
        catch (NoSuchElementException e){
            select.selectByValue(value);
        }
    }
    public void handlingDropDown(WebElement dropdown, int index){
        Select select=new Select(dropdown);
        select.selectByIndex(index);
    }
}

