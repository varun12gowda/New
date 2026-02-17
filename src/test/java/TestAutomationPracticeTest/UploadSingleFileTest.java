package TestAutomationPracticeTest;

import A_GenericLibrary.Base_Class;
import ObjectRepoTestAutomation.UploadSingleFile;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.nio.file.Paths;

import java.nio.file.Paths;

public class UploadSingleFileTest extends Base_Class {
    @Test
    public void toTestUploadSingleFile(){
        uploadsinglefile=new UploadSingleFile(driver);


        String file1 = Paths.get("src/test/java/C_Resources/emailTestCases.csv")
                .toAbsolutePath()
                .toString();


        uploadsinglefile.addSingleFile(file1);


    }
}
