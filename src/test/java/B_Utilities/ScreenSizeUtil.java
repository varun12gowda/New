package B_Utilities;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class ScreenSizeUtil {

    public static void setScreenSize(WebDriver driver, String screenType) {

        switch (screenType.toLowerCase()) {

            case "desktop":
                driver.manage().window().setSize(new Dimension(1920, 1080));
                break;

            case "laptop":
                driver.manage().window().setSize(new Dimension(1366, 768));
                break;

            case "tablet":
                driver.manage().window().setSize(new Dimension(768, 1024));
                break;

            case "mobile":
                driver.manage().window().setSize(new Dimension(375, 812));
                break;

            default:
                // fallback
                driver.manage().window().maximize();
                break;
        }
    }
}
