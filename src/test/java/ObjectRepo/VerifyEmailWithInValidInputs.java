package ObjectRepo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.locks.Condition;

import static A_GenericLibrary.Base_Class.driver;

public class VerifyEmailWithInValidInputs {
    public VerifyEmailWithInValidInputs(){
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

    @FindBy(xpath = "//div[@id=\"alert-main\"]")
    private WebElement verifyInvalidMessage;

    public void setCustomEmail(String email) throws InterruptedException {
        refresh.click();

        insertText.sendKeys(Keys.chord(Keys.CONTROL, "a")); // select all
        insertText.sendKeys(Keys.DELETE); // delete existing text
        insertText.sendKeys(email); // type new email
        dropDown.click();
        chittiDrop.click();
        copyButton.click();
    }
    public String verifyInvalidMessage(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(verifyInvalidMessage));

        return verifyInvalidMessage.getText();
    }

}
