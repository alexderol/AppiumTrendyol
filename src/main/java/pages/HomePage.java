package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class HomePage {
    ElementHelper elementHelper;

    By popUp = By.id("trendyol.com:id/imageViewTooltipClose");
    By checkPage = By.id("trendyol.com:id/textViewTitle");
    By SearchArea = By.id("trendyol.com:id/search_view_inner_container");



    public HomePage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }


    public void closePopUp(){
      elementHelper.click(popUp);
    }
    public void checkPage(){
        elementHelper.checkElement(checkPage);
    }
    public void clickSeacrhArea(){
        elementHelper.click(SearchArea);
    }


}
