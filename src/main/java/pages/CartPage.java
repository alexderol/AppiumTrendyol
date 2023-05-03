package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class CartPage {

    ElementHelper elementHelper;

    By pageControl = By.id("trendyol.com:id/textLeftUp");
    By BrandName = By.id("trendyol.com:id/textViewBrandName");

    By deleteButton = By.id("trendyol.com:id/imageViewDeleteProduct");
    By deletePopUp = By.id("trendyol.com:id/textViewBasketRemoveAction");
    By deletedMessage = By.id("trendyol.com:id/textViewMessage");


    public CartPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }


    public void checkPage() {
        elementHelper.checkElement(pageControl);

    }

    public String checkProductName() {
        return elementHelper.getText(BrandName);

    }
    public void deleteProduct() {
        elementHelper.click(deleteButton);

    }
    public void tapsDeletePopUp() {
        elementHelper.click(deletePopUp);

    }
    public String checkEmptyMessage() {
        return elementHelper.getText(deletedMessage);

    }
}
