package TestHomeScreen;

import A_GenericLibrary.Base_Class;
import ObjectRepo.ComposeEmail;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class ComposeEmailTest extends Base_Class {
   @Test
    public void composeEmail() throws IOException, InterruptedException {
       sendAnEmil=new ComposeEmail(driver);
       String email= utility.readingDataFromPropertyFile("Email");
       String recipientEmail= utility.readingDataFromPropertyFile("recipientEmail");
       String subject= utility.readingDataFromPropertyFile("subject");
       String text= utility.readingDataFromPropertyFile("text");
       sendAnEmil.setEmail(email);

       sendAnEmil.toComposeEmail(recipientEmail, subject, text);

       String message= sendAnEmil.verifySuccessMessage();
       System.out.println(message);

   }
}
