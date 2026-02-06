package TestHomeScreen;

import A_GenericLibrary.Base_Class;
import B_Utilities.InvalidEmailDataProvider;
import ObjectRepo.VerifyEmailWithInValidInputs;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvalidEmailTest extends Base_Class {

@Test(dataProvider ="invalidEmails" ,
dataProviderClass = InvalidEmailDataProvider.class)

    public void verifyInvalidEmailTest(String email, String expected) throws InterruptedException {
    verifyEmailWithInValidInputs =new VerifyEmailWithInValidInputs();
    verifyEmailWithInValidInputs.setCustomEmail(email);

String actualEerrorMessage = verifyEmailWithInValidInputs.verifyInvalidMessage();

//System.out.println("Testing invalid email: " + email +" " +actualEerrorMessage);
    Reporter.log("Testing email: " + email, true);

    Assert.assertEquals(
            actualEerrorMessage,
            expected,
            "Error message mismatch for invalid email: " + email
    );
}

}
