package ObjectRepo;

import A_GenericLibrary.Base_Class;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static A_GenericLibrary.Base_Class.driver;

public class ComposeEmail {
    public  ComposeEmail(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="pre_rand")
    private WebElement refresh;//refresh the email

    @FindBy(id="pre_button")
    private WebElement clearAndinsertNewEmail;//clear the email to insert the new email

    @FindBy(xpath = "//button[@class=\"form-control dropdown-toggle\"]")
    private WebElement dropDown;// click to select the domain

    @FindBy(xpath = "//button[text()=\"mailto.plus\"]")
    private WebElement toSelectDropdown;//Select the domine

    @FindBy(id="compose")
    private WebElement composeButton;// click the compose button

    @FindBy(xpath="//input[@data-tr=\"local_recipients_only:placeholder\"]")
    private WebElement insertRecepientEmail; //to enter the recpient email

    @FindBy(xpath = "//input[@data-tr=\"subject:placeholder\"]")
    private WebElement insertSubject; // to enter the subject

    @FindBy (xpath = "//div[@data-text=\"Text\"]")
    private WebElement insertText; // to insert the text

    @FindBy(xpath = "//input[@class=\"btn btn-green flex-grow-1\"]" )
    private WebElement sendButtonClick; //to click the send button

    @FindBy(xpath = "//div[@id=\"alert-main\"]")
    private WebElement successfullmessage;

    public void setEmail(String email){
        refresh.click();
       clearAndinsertNewEmail.sendKeys(Keys.chord(Keys.CONTROL, "a"));
       clearAndinsertNewEmail.sendKeys(Keys.DELETE);
       clearAndinsertNewEmail.sendKeys(email);
       dropDown.click();
       toSelectDropdown.click();
    }
    public void toComposeEmail(String recipientEmail, String subject, String text) throws InterruptedException {
        composeButton.click();
        insertRecepientEmail.click();
        insertRecepientEmail.sendKeys(recipientEmail);
        insertSubject.click();
        insertSubject.sendKeys(subject);
        insertText.click();
        insertText.sendKeys(text);
        sendButtonClick.click();
        //Thread.sleep(2000);
    }
    public String verifySuccessMessage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(successfullmessage));

        // Return the text content of the success message
        return successfullmessage.getText();
    }
}
