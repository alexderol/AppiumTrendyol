package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class FilterPage {
    ElementHelper elementHelper;

    By filterText = By.id("trendyol.com:id/textLeftUp");
    By Kargobedava = By.id("trendyol.com:id/filterName");
    By KargoRadioButton = By.xpath("//*[@text='Kargo Bedava']/../android.widget.CheckBox");
    By urunleriListele = By.id("trendyol.com:id/btnApplyFilter");



    public FilterPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }


    public void checkPage(){
        elementHelper.checkElement(filterText);

    }
    public void tabDeliveryOptions(String kargo){
        elementHelper.scroll(KargoRadioButton);
        elementHelper.click(KargoRadioButton);
    }
    public void tabsListButton(String kargo){
        elementHelper.click(urunleriListele);
    }



}
