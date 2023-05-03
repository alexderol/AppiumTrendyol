package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class GenderPage {
    ElementHelper elementHelper;

    By checkPage = By.className("android.widget.TextView");
    By gender = By.id("trendyol.com:id/buttonSelectGenderMan");


    public GenderPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }


    public void checkPage(){
         elementHelper.checkElement(checkPage);

    }
    public void selectGender(String sex){
        elementHelper.clickElementWithText(gender,sex);

    }


}
