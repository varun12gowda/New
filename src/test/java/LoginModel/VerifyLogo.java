package LoginModel;

import GenericLibrary.Base_Class;
import ObjectRepo.VerifyLogo1;
import org.testng.annotations.Test;

public class VerifyLogo extends Base_Class {
    @Test
    public void LogoName(){
        VerifyLogo1 logo = new VerifyLogo1(driver);
        String actualLogoName = logo.getLogoText();
        String expectedLogoName = "tempmail +"; // ❌ intentionally wrong

        System.out.println("Actual Logo Name : " + actualLogoName);
        System.out.println("Expected Logo Name : " + expectedLogoName);

        if (!actualLogoName.equalsIgnoreCase(expectedLogoName)) {
            throw new RuntimeException(
                    "TEST FAILED ❌ | Logo mismatch. Expected: "
                            + expectedLogoName + " but found: " + actualLogoName
            );
        }

        System.out.println("TEST PASSED ✅ (This line will never execute)");
    }
}
