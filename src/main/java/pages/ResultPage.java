package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class ResultPage {
    ElementHelper elementHelper;

    By sirala = By.id("trendyol.com:id/layout_search_order");
    By filterButton = By.id("trendyol.com:id/textViewFilter");
    By item = By.id("trendyol.com:id/productCardViewRightProduct");



    public ResultPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }


    public void checkPage(){
        elementHelper.checkElement(sirala);

    }
    public void clickFilterButton(){
        elementHelper.click(filterButton);

    }
    public void clickAnItem(){
        elementHelper.click(item);
    }

}
