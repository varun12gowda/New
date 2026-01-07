package LoginModel;

import GenericLibrary.Base_Class;
import org.testng.annotations.Test;

import java.io.IOException;


public class LoginTest extends Base_Class {

    @Test (enabled = true, groups = "smoke")
    public void ValidateLoginModule() throws IOException, InterruptedException{

        login1.getUsername().sendKeys(utility.readingDataFromPropertyFile("Username"));
        login1.getPassword().sendKeys(utility.readingDataFromPropertyFile("Password"));
        login1.getLoginButtonClick().click();
        String text= login1.getLoginButtonClick().getText();
         System.out.println(text);
    }
}
