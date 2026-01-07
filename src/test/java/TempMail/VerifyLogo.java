package TempMail;

import GenericLibrary.Base_Class;
import ObjectRepo.VerifyLogo1;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class VerifyLogo extends Base_Class {
    
    @Test
    public void LogoName() throws IOException {
//driver.get(utility.readingDataFromPropertyFile("url"));
        logo1 = new VerifyLogo1(driver);
        String actualLogoName = logo1.getLogoText();
        String expectedLogoName = "tempmail +"; 
        Assert.assertEquals(actualLogoName,expectedLogoName, "Logo text mismatch");
        System.out.println("Actual Logo Name : " + actualLogoName);
        System.out.println("Expected Logo Name : " + expectedLogoName);
        }
        
}
