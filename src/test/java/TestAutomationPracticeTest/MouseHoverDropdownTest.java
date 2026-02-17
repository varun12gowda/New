package TestAutomationPracticeTest;

import A_GenericLibrary.Base_Class;
import ObjectRepoTestAutomation.MouseHoverDropdown;
import org.testng.annotations.Test;

public class MouseHoverDropdownTest extends Base_Class {
    @Test
    public void toGetTheDropdownText(){
        mouseHoverDropdown=new MouseHoverDropdown(driver);
        String dropdownValue=mouseHoverDropdown.performMousehover();
        System.out.println(dropdownValue);
    }
}
