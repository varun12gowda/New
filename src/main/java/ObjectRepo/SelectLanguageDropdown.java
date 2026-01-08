package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectLanguageDropdown {

    public SelectLanguageDropdown(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//button[@class=\"btn dropdown-toggle text-white\"]")
    private WebElement languageButtonClick;

    @FindBy(xpath = "//button[@class=\"dropdown-item zh\"]")
    private WebElement zhChina;

    @FindBy(xpath = "//button[@class=\"dropdown-item hi\"]")
    private WebElement hiIndian;

    @FindBy(xpath = "//button[@class=\"dropdown-item de\"]")
    private WebElement deGermany;

    @FindBy(xpath = "//button[@class=\"dropdown-item uk\"]")
    private WebElement ukEngland;

    @FindBy(xpath = "//button[@class=\"dropdown-item ru\"]")
    private  WebElement ruRussia;

    @FindBy(xpath = "//button[@class=\"dropdown-item es\"]")
    private WebElement esSpain;

    @FindBy(xpath = "//button[@class=\"dropdown-item pt\"]")
    private WebElement ptPortugal;

    @FindBy(xpath = "//button[@class=\"dropdown-item ar\"]")
    private WebElement arArmenia;

    @FindBy(xpath = "//button[@class=\"dropdown-item fr\"]")
    private WebElement frFrance;

    @FindBy(xpath = "//button[@class=\"dropdown-item ja\"]")
    private WebElement jaJapan;

    @FindBy(xpath = "//button[@class=\"dropdown-item bn\"]")
    private WebElement baBangla;

    @FindBy(xpath = "//h2[@data-tr=\"your_tempmail_address_is_ready\"]")
    private WebElement titleName;

    public WebElement getLanguageButtonClick(){
        return languageButtonClick;
    }
    public WebElement getZhChina(){
        return zhChina;
    }
    public WebElement getHiIndian(){
        return hiIndian;
    }
    public WebElement getDeGermany(){
        return deGermany;
    }
    public WebElement getUkEngland(){
        return ukEngland;
    }
    public WebElement getRuRussia(){
        return ruRussia;
    }
    public WebElement getEsSpain(){
        return esSpain;
    }
    public WebElement getPtPortugal(){
        return ptPortugal;
    }
    public WebElement getArArmenia(){
        return arArmenia;
    }
    public WebElement getFrFrance(){
        return frFrance;
    }
    public WebElement getJaJapan(){
        return jaJapan;
    }
    public WebElement getBaBangla(){
        return baBangla;
    }
    public WebElement getTitleName(){
        return titleName;
    }
}
