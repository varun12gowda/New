package ObjectRepo;

import A_GenericLibrary.Base_Class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyLogo1 {

    public VerifyLogo1(WebDriver driver) {
        PageFactory.initElements(Base_Class.driver, this);
    }

    @FindBy(xpath = "//div[@class=\"logo\"]")
    private WebElement logo;

    public String getLogoText() {
        return logo.getText();
    }
}
