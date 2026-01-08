package TempMail;

import GenericLibrary.Base_Class;
import ObjectRepo.SelectDropdown;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class CopyEmailTest extends Base_Class {
    @Test
    public void validateEmail() throws IOException, UnsupportedFlavorException, InterruptedException {
        dropdown1 = new SelectDropdown(driver);
        dropdown1.getRefresh().click();
        Thread.sleep(1000);
        dropdown1.getInsertText().sendKeys(utility.readingDataFromPropertyFile("Emailname"));
        dropdown1.getDropDown().click();
        dropdown1.getChitsDrop().click();
        dropdown1.getCopyButton().click();

        Clipboard clipboard= Toolkit.getDefaultToolkit().getSystemClipboard();
        String CopiedText=(String) clipboard.getData(DataFlavor.stringFlavor);

 // String copyText=dropdown1.getCopyButton().getText();
  System.out.println("The email copied is "+ CopiedText);

    }
}