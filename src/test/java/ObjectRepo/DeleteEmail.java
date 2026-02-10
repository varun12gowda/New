package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DeleteEmail {

    private WebDriver driver;
    private WebDriverWait wait;

    public DeleteEmail(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    /* ---------- STATIC ELEMENTS (SAFE TO CACHE) ---------- */

    @FindBy(id = "pre_rand")
    private WebElement refresh;

    @FindBy(id = "pre_button")
    private WebElement clearAndinsertNewEmail;

    @FindBy(xpath = "//button[@class='form-control dropdown-toggle']")
    private WebElement dropDown;

    @FindBy(xpath = "//button[text()='mailto.plus']")
    private WebElement toSelectDropdown;

    @FindBy(id = "delete_mail")
    private WebElement deleteButton;

    @FindBy(id = "confirm_mail")
    private WebElement confirmDeleteButton;

    /* ---------- DYNAMIC LOCATORS (MUST NOT BE @FindBy) ---------- */

    private By inboxMails =
            By.xpath("//div[contains(@class,'mail') and .//span[@data-tr='date']]");

    private By deleteModal =
            By.id("modal-destroy-mail");

    /* ---------- METHODS ---------- */

    public void toSelectTheEmail(String email) {
        refresh.click();
        clearAndinsertNewEmail.sendKeys(Keys.chord(Keys.CONTROL, "a"));
        clearAndinsertNewEmail.sendKeys(Keys.DELETE);
        clearAndinsertNewEmail.sendKeys(email);
        dropDown.click();
        toSelectDropdown.click();
    }

    public int getEmailCount() {
        return driver.findElements(inboxMails).size();
    }

    public void openFirstEmail() {
        List<WebElement> emails = driver.findElements(inboxMails);
        wait.until(ExpectedConditions.elementToBeClickable(emails.get(0)));
        emails.get(0).click();
    }

    public void deleteOpenedEmail() {

        int beforeDeleteCount = getEmailCount();

        wait.until(ExpectedConditions.elementToBeClickable(deleteButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(confirmDeleteButton)).click();

        // IMPORTANT: wait until modal disappears
        wait.until(ExpectedConditions.invisibilityOfElementLocated(deleteModal));


        if (beforeDeleteCount > 1) {
            // wait until email count decreases
            wait.until(ExpectedConditions.numberOfElementsToBeLessThan(
                    inboxMails, beforeDeleteCount
            ));
        } else {
            // last email deleted → inbox becomes empty
            wait.until(ExpectedConditions.numberOfElementsToBe(
                    inboxMails, 0));
        }
    }
}
