package TestHomeScreen;

import A_GenericLibrary.Base_Class;
import ObjectRepo.ContactUs;
import org.testng.annotations.Test;

import java.io.IOException;

public class  ContactUSTest extends Base_Class {
    @Test
    public void testContactUs() throws IOException {
      contactUs=new ContactUs(driver);
      String name= utility.readingDataFromPropertyFile("name");
      String email= utility.readingDataFromPropertyFile("recipientEmail");
      String text= utility.readingDataFromPropertyFile("text");

      contactUs.contactUsLinksInfo(email,name,text);

      String ActualMessage=contactUs.returnSuccessMessage();
      System.out.println(ActualMessage);
    }
}
