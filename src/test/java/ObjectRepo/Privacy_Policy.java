package ObjectRepo;

import A_GenericLibrary.Base_Class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Privacy_Policy {
    WebDriverWait wait;
    public Privacy_Policy(WebDriver driver) {
        PageFactory.initElements(Base_Class.driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @FindBy(xpath = "//a[@data-tr = \"privacy\"]")
    private WebElement privacy_policy_button;

    @FindBy(xpath = "//a[contains(text(), 'Privacy policy')]")
    private WebElement dragfromsourse;

    @FindBy(xpath = "//a[contains(text(), 'tempmail4... .onion')]")
    private WebElement droptothepoint;

    public String click_privacy_policy() {
        privacy_policy_button.click();
        return privacy_policy_button.getText();
    }
    public void drag_from_sourse_to_destination(){

        wait.until(ExpectedConditions.visibilityOf(dragfromsourse));
        wait.until(ExpectedConditions.visibilityOf(droptothepoint));

        Actions actions=new Actions(Base_Class.driver);
        actions.dragAndDrop(dragfromsourse, droptothepoint).build().perform();
    }
}
