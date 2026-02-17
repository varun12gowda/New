package TestAutomationPracticeTest;

import A_GenericLibrary.Base_Class;
import ObjectRepoTestAutomation.DragTheFileAndDrop;
import org.testng.annotations.Test;

public class DragTheFileAndDropTest extends Base_Class {
    @Test
    public void test(){
        dragthefileanddropdown =new DragTheFileAndDrop(driver);

    }

}
