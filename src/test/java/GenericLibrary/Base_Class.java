package GenericLibrary;

import ObjectRepo.LoginPage1;
import ObjectRepo.SelectDropdown;
import ObjectRepo.SelectLanguageDropdown;
import ObjectRepo.VerifyLogo1;
import Utilities.Properties_Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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


    @BeforeTest
    @Parameters("browser")
    public void setUp( String browser) throws IOException {

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


    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
