package ObjectRepoTestAutomation;

import A_GenericLibrary.WebDriver_Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static A_GenericLibrary.Base_Class.driver;

public class Slider {
       WebDriver_Utility SliderUtility=new WebDriver_Utility(driver);


        public void Slider(WebDriver driver) {
            PageFactory.initElements(driver,this);
        }

        private By sliderHandle = By.xpath("//*[@id='slider-range']/span[1]");
        private By priceText = By.xpath("//label[contains(text(),'Price range')]");

        public WebElement getSliderElement() {
            return driver.findElement(sliderHandle);
        }

        public String getSliderStyle() {
            return getSliderElement().getAttribute("style");
        }

        public String getPriceText() {
            return driver.findElement(priceText).getText();
        }
        public void moveSlider(int pixelOffset) {
            SliderUtility.clickAndHoldSlider(driver, getSliderElement(), pixelOffset);
        }
    }


