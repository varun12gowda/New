package TestPrivacyPolicy;

import A_GenericLibrary.Base_Class;
import ObjectRepo.Privacy_Policy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyPrivacyPolicyTest extends Base_Class {
    @Test
    public void privacyPolicy() {
        privacypolicybutton=new Privacy_Policy(driver);
        String privacyPolicyText= privacypolicybutton.click_privacy_policy();

        System.out.println(privacyPolicyText);
    }
}
