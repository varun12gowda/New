package TestHomeScreen;

import A_GenericLibrary.Base_Class;
import ObjectRepo.DeleteEmail;
import org.testng.annotations.Test;

import java.io.IOException;

public class DeleteEmailTest extends Base_Class {
    @Test
    public void deleteEmails() throws IOException {
        deleteEmail=new DeleteEmail(driver);
        String email= utility.readingDataFromPropertyFile("Email");
        deleteEmail.toSelectTheEmail(email);
        while(deleteEmail.getEmailCount()>0){
            deleteEmail.openFirstEmail();
            deleteEmail.deleteOpenedEmail();

        }
    }
}
