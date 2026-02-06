package TestHomeScreen;

import A_GenericLibrary.Base_Class;
import ObjectRepo.SelectDropdown;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class CopyEmailTest extends Base_Class {

    @Test
    public void validateEmail() throws IOException, UnsupportedFlavorException, InterruptedException {
        SelectDropdown dropdown1 = new SelectDropdown(driver);

        // Type the email and select the dropdown
        dropdown1.setCustomEmail(utility.readingDataFromPropertyFile("Email"));

        // Click the copy button
        //dropdown1.copyEmail();

        // Get the value from the input field
        String actual = dropdown1.copyEmail();

        // Read the clipboard content
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        String copiedText = (String) clipboard.getData(DataFlavor.stringFlavor);

        System.out.println("The actual email in input field: " + actual);
        System.out.println("The email copied from clipboard: " + copiedText);

        // Validations
        Assert.assertNotNull(copiedText, "Clipboard is empty!");
        Assert.assertTrue(copiedText.contains(actual), "Copied email does not match input!");
    }
}
