package ObjectRepoTestAutomation;

import A_GenericLibrary.WebDriver_Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;

import static A_GenericLibrary.Base_Class.driver;

public class Registration {
    int todaysDate= LocalDate.now().getDayOfMonth();
    int tomorrowsDate=LocalDate.now().plusDays(1).getDayOfMonth();

    WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(2));
    WebDriver_Utility utility=new WebDriver_Utility(driver);

    public Registration(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@placeholder=\"Enter Name\"]")//First name
    private WebElement enterName;

    @FindBy(xpath = "//input[@placeholder=\"Enter EMail\"]")//enter email
    private WebElement enterEmail;

    @FindBy(xpath = "//input[@placeholder=\"Enter Phone\"]")//enter phone
    private WebElement enterPhone;

    @FindBy(xpath = "//textarea[@class='form-control']")//address
    private WebElement enterAddress;

//    @FindBy(xpath = "/html/body/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div[1]/div[1]/div/div/div/div/div[2]/div[3]/div[1]/input")
//    private WebElement selectGender;

    @FindBy(xpath = "//input[@value=\"sunday\"]")
    private  WebElement selectSunday;

    @FindBy(id = "country")
    private WebElement countryDropdown;

    @FindBy(id="colors")
    private  WebElement colorsDropdown;

    @FindBy(id="animals")
    private WebElement animalDropdown;

    @FindBy(xpath = "//input[@id=\"datepicker\"]")
    private WebElement clickDatePicker1;

    @FindBy (xpath = "//input[@id=\"txtDate\"]")
    private WebElement clickDatePicker2;


    @FindBy(xpath = "//button[@class=\"submit-btn\"]")
    private WebElement submitButton;

    public void toEnterTheINformation(String Name, String Email, String Phone, String Address){
        enterName.sendKeys(Name);
        enterEmail.sendKeys(Email);
        enterPhone.sendKeys(Phone);
        enterAddress.sendKeys(Address);
//        selectGender.click();
        selectSunday.click();
    }
    public void toSelectTheGender(String gender){

        WebElement data = driver.findElement(
                By.xpath(STR."//input[@id='\{gender}']")
        );
        data.click();
    }

    public String toSelectTheDropdownsForCountry(String country) {
       wait.until(ExpectedConditions.visibilityOf(countryDropdown));

        utility.handelingDropdownbyValue(countryDropdown, country);
        return new Select(countryDropdown)
                .getFirstSelectedOption()
                .getAttribute("value");
    }
    public String toSelectTheDropdownForColours(String colour){
        wait.until(ExpectedConditions.visibilityOf(colorsDropdown));
        utility.handelingDropdownbyValue(colorsDropdown, colour);
        return  new Select(colorsDropdown)
                .getFirstSelectedOption()
                .getAttribute("value");
    }
    public String toSelectTheDropdownForAnimal(String animals){
        wait.until(ExpectedConditions.visibilityOf(animalDropdown));
        utility.handelingDropdownbyValue(animalDropdown, animals);
        return new Select(animalDropdown)
                .getFirstSelectedOption()
                .getAttribute("value");
    }
    public String toSelectTodaysDate() {
        clickDatePicker1.click();
        WebElement date = driver.findElement(
                By.xpath(STR."//a[@data-date='\{todaysDate + 1}']"));
        date.click();
        return clickDatePicker1.getAttribute("value");
    }
public String toSelectTomorrowDate(){
        clickDatePicker2.click();
        WebElement date2= driver.findElement(
                By.xpath(STR."//a[@data-date='\{tomorrowsDate}']"));
    date2.click();
    return clickDatePicker2.getAttribute("value");
}

}
