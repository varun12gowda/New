package TestAutomationPracticeTest;

import A_GenericLibrary.Base_Class;
import ObjectRepoTestAutomation.Slider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderTest extends Base_Class {
    @Test
    public void test(){
        slider=new Slider();
        String beforeStyle = slider.getSliderStyle();
        String beforePrice = slider.getPriceText();

        slider.moveSlider(40);

        String afterStyle = slider.getSliderStyle();
        String afterPrice = slider.getPriceText();

//        Assert.assertEquals(beforeStyle, afterStyle);
//        Assert.assertEquals(beforePrice, afterPrice);
    }

}
