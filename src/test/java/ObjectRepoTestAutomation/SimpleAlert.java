package ObjectRepoTestAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



public class SimpleAlert {
    Alert alert;
    WebDriver driver;
    WebDriverWait wait;
    public SimpleAlert(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//button[text()='Simple Alert']")
    private WebElement simpleAlert;

    public String clickSimpleAlertbutton() throws InterruptedException {
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView(true);", simpleAlert);

        simpleAlert.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        alert = wait.until(ExpectedConditions.alertIsPresent());
         alert = driver.switchTo().alert();
        return alert.getText();
    }
    public void toAcceptAlert(){
        alert.accept();
        simpleAlert.click();
    }
}
