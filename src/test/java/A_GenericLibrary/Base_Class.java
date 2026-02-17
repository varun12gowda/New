package A_GenericLibrary;

import B_Utilities.InvalidEmailDataProvider;
import B_Utilities.ScreenSizeUtil;
import ObjectRepo.*;
import B_Utilities.Properties_Utility;
import ObjectRepoTestAutomation.*;
import TestHomeScreen.InvalidEmailTest;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.io.IOException;
import java.time.Duration;

public class Base_Class {

    public static WebDriver driver;
   public Properties_Utility utility = new Properties_Utility();
    public LoginPage1 login1;
    public VerifyLogo1 logo1;
    public SelectDropdown dropdown1;
    public SelectLanguageDropdown languageDropdown;
    public Privacy_Policy privacypolicybutton;
    public WebDriverWait wait;
    public WebDriver_Utility Webdriverutility;
    public ComposeEmail sendAnEmil;
    public VerifyEmailWithInValidInputs verifyEmailWithInValidInputs;
    public DeleteEmail deleteEmail;
    public ContactUs contactUs;
    public Registration registration;
    public UploadSingleFile uploadsinglefile;
    public DragTheFileAndDrop dragthefileanddropdown;
    public Slider slider;
    public MouseHoverDropdown mouseHoverDropdown;
    public SimpleAlert simpleAlert;


    @Parameters({"browser","language"})
    @BeforeClass
    public void setUp( String browser, String language) throws IOException {
     Properties_Utility.setLanguage(language);
        switch (browser) {

            case "edge":
                //WebDriverManager.edgedriver().setup();

                driver = new EdgeDriver();
                break;

            case "firefox":
                // WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            case "chrome":
                // WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            default:
                throw new IllegalArgumentException(
                        "Unsupported browser: " + browser
                );
        }
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       // Webdriverutility = new WebDriver_Utility(driver);
    }
        @BeforeMethod
        public void navigateAndInit() throws IOException {
            // Navigate to URL before every test to ensure a fresh start
            driver.get(utility.readingDataFromPropertyFile("url"));

    }
        // ✅ Page Object initialization
        //login1 = new LoginPage1(driver);
//    @BeforeClass
//    public void  initPage(){
//            //login1 = new LoginPage1(driver);
//            logo1 = new VerifyLogo1(driver);
//            dropdown1 = new SelectDropdown(driver);
//        }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
