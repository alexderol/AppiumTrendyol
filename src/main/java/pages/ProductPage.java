package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class ProductPage {
    ElementHelper elementHelper;

    By pageControl = By.id("trendyol.com:id/linearLayoutTopLeftDefaultStamps");
    By itemName = By.id("trendyol.com:id/textViewBrandName");
    By addToCartFirstButton = By.id("trendyol.com:id/primaryButton");

    By addToCart = By.id("trendyol.com:id/buttonAddToBasketOrChooseVariant");

    By beden = By.id("trendyol.com:id/textViewValue");

    public ProductPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }


    public void checkPage() {
        elementHelper.checkElement(pageControl);

    }
    public String  productName() {
        System.out.println(elementHelper.getText(itemName));
        return elementHelper.getText(itemName);

    }

    public void addProductToCart(String item) {
        elementHelper.clickElementWithText(addToCartFirstButton,item);

    }
    public void selectSize(String size){
        System.out.println(elementHelper.getText(beden));
        elementHelper.clickElementWithText(beden,size);

    }
    public void addToCartSelectedSize(){
        elementHelper.click(addToCart);

    }

}
