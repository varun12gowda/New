package TestAutomationPracticeTest;

import A_GenericLibrary.Base_Class;
import B_Utilities.RegistrationDataProvider;
import ObjectRepoTestAutomation.Registration;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class ResistrationTest extends Base_Class {
@Test(dataProvider = "RegistrationData", dataProviderClass = RegistrationDataProvider.class)

    public void registrationTestTest(String Name,String Email, String Phone, String Address, String country, String gender, String colour, String animals ) throws IOException {
    registration=new Registration(driver);

//    String Name= utility.readingDataFromPropertyFile("Name");
//    String Email= utility.readingDataFromPropertyFile("Email");
//    String Phone= utility.readingDataFromPropertyFile("Phone");
//    String Address= utility.readingDataFromPropertyFile("Address");

    registration.toEnterTheINformation(Name, Email, Phone, Address);
    registration.toSelectTheDropdownsForCountry(country);
    registration.toSelectTheGender(gender);
    registration.toSelectTheDropdownForColours(colour);
    registration.toSelectTheDropdownForAnimal(animals);

   String CountryValue= registration.toSelectTheDropdownsForCountry(country);
   String ColourValue= registration.toSelectTheDropdownForColours(colour);
   String AnimalValue= registration.toSelectTheDropdownForAnimal(animals);
   String selectedDate= registration.toSelectTodaysDate();
   String selectedtomorrowDate= registration.toSelectTomorrowDate();

   System.out.println(CountryValue + ColourValue + AnimalValue);
   System.out.println(selectedDate);
    System.out.println(selectedtomorrowDate);

//    Assert.assertEquals(CountryValue, "india");
//    Assert.assertEquals(ColourValue, "yellow");
//    Assert.assertEquals(AnimalValue, "lion");
}
}
