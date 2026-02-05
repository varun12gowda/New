package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
        public LoginPage1(WebDriver driver){
            PageFactory.initElements(driver, this);
        }
        @FindBy(xpath = "//input[@name='username']")
        private WebElement username;

        @FindBy(xpath = "//input[@type='password']")
        private WebElement password;

        @FindBy(xpath = "//span[text()= 'Log in']")
        private  WebElement loginButtonClick;

        public WebElement getLoginButtonClick(){
            return loginButtonClick;
        }
        public WebElement getUsername(){
            return username;
        }
        public WebElement getPassword(){
            return password;
    }
}
