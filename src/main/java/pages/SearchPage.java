package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class SearchPage {
    ElementHelper elementHelper;

    By checkPage = By.id("trendyol.com:id/layoutSliderBannerContainer");
    By searchBox = By.id("trendyol.com:id/edittext_search_view");
    By resultSearch = By.id("trendyol.com:id/textViewSearchSuggestionText");



    public SearchPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }


    public void checkPage(){
        elementHelper.getText(checkPage);

    }
    public void seacrhKey(String item){
        elementHelper.sendKeys(searchBox,item);

    }
    public void clickSeacrhResult(String item){
        elementHelper.clickElementWithText(resultSearch,item);

    }

}
