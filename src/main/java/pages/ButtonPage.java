package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class ButtonPage {

    ElementHelper elementHelper;

    By title = By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView");
    By normalButton = By.id("io.appium.android.apis:id/button_normal");
    By smallButton = By.id("io.appium.android.apis:id/button_small");
    By swicthButton = By.id("io.appium.android.apis:id/button_toggle");


    public ButtonPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }


    public String checkTitle(){
      return elementHelper.getText(title);

    }
    public void checkWhereAreYou(){
        elementHelper.checkElement(title);
    }

    public String chekButtonIsNormal(){
      return  elementHelper.getText(normalButton);
    }

    public String chekButtonIsSmall(){
        return  elementHelper.getText(smallButton);
    }

    public String chekButtonIsSwicth(){
        return  elementHelper.getText(swicthButton);
    }

    public void clickbutton(){
        elementHelper.click(swicthButton);
    }

}
