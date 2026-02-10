package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static A_GenericLibrary.Base_Class.driver;

public class ContactUs {
    WebDriverWait wait;

    public ContactUs(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@href=\"#!contacts\"] ")
    private WebElement clickContactUsLink;

    @FindBy(xpath = "//input[@id=\"contact-name\"] ")
    private WebElement enterName;

    @FindBy(xpath = "//input[@id=\"contact-email\"] ")
    private WebElement enterEmail;

    @FindBy(xpath = "//textarea[@id=\"contact-text\"] ")
    private WebElement enterMessage;

    @FindBy(xpath = "//*[@id=\"contact-form\"]/input")
    private WebElement clickTheSendButton;

    @FindBy(xpath = "//div[@class=\"alert fixed-top bg-success\"] ")
    private WebElement successMessage;

    public void contactUsLinksInfo(String email, String name, String text){
        clickContactUsLink.click();
        enterName.sendKeys(name);
        enterEmail.sendKeys(email);
        enterMessage.sendKeys(text);
//        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable(clickTheSendButton));
       clickTheSendButton.click();
    }
    public String returnSuccessMessage(){
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(successMessage));
        return successMessage.getText();
    }

}
