package TempMail;

import GenericLibrary.Base_Class;
import GenericLibrary.WebDriver_Utility;
import ObjectRepo.SelectLanguageDropdown;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyLanguageTest extends Base_Class {
    WebDriver_Utility webUtil;

    @BeforeMethod
    public void initPageObject() {
        languageDropdown = new SelectLanguageDropdown(driver);
       webUtil=new WebDriver_Utility(driver);
    }

    @Test
    public void validateChinaLanguage() {


        //ChinaLanguage
       // webUtil.doubletap(languageDropdown.getLanguageButtonClick());
       languageDropdown.getLanguageButtonClick().click();
        languageDropdown.getZhChina().click();
        String actualchinaTitle = languageDropdown.getTitleName().getText();
        String expectedChinaTitle = "您的临时邮箱地址已准备就绪";
        if (actualchinaTitle.equals(expectedChinaTitle)) {
            System.out.println("✅ Title matched successfully | Language: Chinese | Title: " + actualchinaTitle);
        }

        Assert.assertEquals(
                actualchinaTitle,
                expectedChinaTitle,
                "❌ Title mismatch | Expected: " + expectedChinaTitle + " | Actual: " + actualchinaTitle
        );

    }
  @Test
  public void validateHindiLanguage(){
    //IndianLanguage
     languageDropdown.getLanguageButtonClick().click();
        languageDropdown.getHiIndian().click();
        String ActualIndianTitle=languageDropdown.getTitleName().getText();
        String ExpectedIndianTitle="आपका नया पता";

      if(ActualIndianTitle.equals(ExpectedIndianTitle)){
          System.out.println("The language is valid "+ ActualIndianTitle);
      }
      Assert.assertEquals(ActualIndianTitle,ExpectedIndianTitle,"The language is invalid expected "+ ExpectedIndianTitle);

    }

    @Test
    public void valudateGermanyLanguage(){
        languageDropdown.getLanguageButtonClick().click();
        languageDropdown.getDeGermany().click();
        String ActualGermanyTitle=languageDropdown.getTitleName().getText();
        String ExpectedGermanyTitle="Ihre neue Adresse";

        if(ActualGermanyTitle.equals(ExpectedGermanyTitle)){
            System.out.println("The language is valid "+ ActualGermanyTitle);
        }
        Assert.assertEquals(ActualGermanyTitle,ExpectedGermanyTitle,"The language is invalid expected "+ ExpectedGermanyTitle);
    }
}