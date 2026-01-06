package LoginModel;

import GenericLibrary.Base_Class;
import org.testng.annotations.Test;

import java.io.IOException;


public class Login_123 extends Base_Class {
    @Test
    public void ValidateLoginModule() throws IOException, InterruptedException{

        login1.getUsername().sendKeys(utility.readingDataFromPropertyFile("Username"));
        login1.getPassword().sendKeys(utility.readingDataFromPropertyFile("Password"));
        login1.getLoginButtonClick().click();

    }
}
