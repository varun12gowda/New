package Utilities;

import ObjectRepo.LoginPage1;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.time.Duration;

public class Base_Class {

    public WebDriver driver;
   public Properties_Utility utility = new Properties_Utility();
    public LoginPage1 login1;

    @BeforeMethod
    public void LaunchBrowser() throws IOException {

        String browser = utility.readingDataFromPropertyFile("browser");

        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(22));
        driver.get(utility.readingDataFromPropertyFile("url"));

        // ✅ Page Object initialization
        login1 = new LoginPage1(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
