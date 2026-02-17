package ObjectRepoTestAutomation;

import A_GenericLibrary.WebDriver_Utility;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static A_GenericLibrary.Base_Class.driver;

public class MouseHoverDropdown {
    WebDriver_Utility utility=new WebDriver_Utility(driver);
    WebDriverWait wait;

    public MouseHoverDropdown(WebDriver driver){
        PageFactory.initElements(driver, this);
        wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    }
    @FindBy(xpath = "//button[@class=\"dropbtn\"]")
    private WebElement toMousehoverOnThePointMe;

    @FindBy(xpath = "//*[@id=\"HTML3\"]/div[1]/div/div/a[2]")
    private WebElement toClickLaptopFromTheDropdown;

    public String performMousehover(){

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView(true);", toMousehoverOnThePointMe);
        utility.mouseHoveringOnElement(toMousehoverOnThePointMe);

        wait.until(ExpectedConditions.visibilityOf(toClickLaptopFromTheDropdown));
        return toClickLaptopFromTheDropdown.getText();
    }
    public void toClickTheDropdown() throws InterruptedException {
        Thread.sleep(100);
        toClickLaptopFromTheDropdown.click();
    }
}


