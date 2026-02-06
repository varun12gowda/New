package B_Utilities;

import org.testng.annotations.DataProvider;

public class InvalidEmailDataProvider {
 @DataProvider(name="invalidEmails")
    public static Object[][] invalidEmails(){
     return new Object[][]{
             {"abc@", "Name can only contain alphanumeric characters and symbols \".-_\"."},
             {"@gmail.com", "Name can only contain alphanumeric characters and symbols \".-_\"."},
             {"abc gmail.com", "Name can only contain alphanumeric characters and symbols \".-_\"."},
             {"abc@.com", "Name can only contain alphanumeric characters and symbols \".-_\"."},
             {"", "The name must not be empty."},
             {"   ", "Name can only contain alphanumeric characters and symbols \".-_\"."}
     };
 }
}
