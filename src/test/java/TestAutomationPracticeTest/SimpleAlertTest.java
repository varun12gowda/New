package TestAutomationPracticeTest;

import A_GenericLibrary.Base_Class;
import ObjectRepoTestAutomation.SimpleAlert;
import org.testng.annotations.Test;

public class SimpleAlertTest extends Base_Class {
    @Test
    public void toTestSimpleAlert() throws InterruptedException {
        simpleAlert =new SimpleAlert(driver);
     String text= simpleAlert.clickSimpleAlertbutton();
      System.out.println(text);
    }
}
