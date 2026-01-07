package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectDropdown {
    public SelectDropdown(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//button[@class=\"form-control dropdown-toggle\"]")
    private WebElement dropDown ;

    @FindBy(xpath = "//button[text()=\"chitthi.in\"]")
    private WebElement chittiDrop;

    @FindBy(xpath = "//button[@class=\"btn btn-green mx-auto\"]")
    private WebElement copyButton;

    public WebElement getChitsDrop() {
        return chittiDrop;
    }
    public WebElement getDropDown(){
        return dropDown;
    }
    public WebElement getCopyButton(){
        return copyButton;
    }
}
