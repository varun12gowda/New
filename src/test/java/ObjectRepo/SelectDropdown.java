package ObjectRepo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectDropdown {

    public SelectDropdown(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="pre_rand")
    private WebElement refresh;

    @FindBy(id="pre_button")
    private WebElement insertText;

    @FindBy(xpath = "//button[@class=\"form-control dropdown-toggle\"]")
    private WebElement dropDown;

    @FindBy(xpath = "//button[text()=\"chitthi.in\"]")
    private WebElement chittiDrop;

    @FindBy(xpath = "//button[@class=\"btn btn-green mx-auto\"]")
    private WebElement copyButton;

    // Type email and select dropdown reliably
    public void setCustomEmail(String email) throws InterruptedException {
        refresh.click();

      insertText.sendKeys(Keys.chord(Keys.CONTROL, "a")); // select all
        insertText.sendKeys(Keys.DELETE); // delete existing text
        insertText.sendKeys(email); // type new email
        dropDown.click();
        chittiDrop.click();
    }

    // Click copy button
    public String copyEmail() {
        copyButton.click();
        return insertText.getAttribute("value");
    }

}
