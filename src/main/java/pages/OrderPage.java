package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class OrderPage {
    ElementHelper elementHelper;

    By searchArea = By.id("trendyol.com:id/edittext_search_view");
    By sirala = By.id("trendyol.com:id/layout_search_order");
    By clickEncok = By.xpath("//*[@text]");


    public OrderPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }


    public void checkPage(){
        elementHelper.checkElement(searchArea);
    }

    public void tabsselection(String encok){
       elementHelper.click(sirala);
       elementHelper.clickElementWithText(clickEncok,encok);
    }



}
