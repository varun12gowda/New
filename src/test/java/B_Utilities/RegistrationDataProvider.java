package B_Utilities;

import org.testng.annotations.DataProvider;

public class RegistrationDataProvider {
    @DataProvider(name="RegistrationData")
    public static Object [][] validRegistration(){
        return new Object[][]{
                {"King", "j@gmail.com", "12","a", "United States", "male", "red", "cat"},
                {"kk", "4@gmail.com", "123","ab", "india", "female", "blue", "lion"}
        };
    }
}
