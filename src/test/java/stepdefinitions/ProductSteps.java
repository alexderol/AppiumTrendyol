package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OrderPage;
import pages.ProductPage;
import utils.DriverManager;

public class ProductSteps {

    ProductPage productPage = new ProductPage(DriverManager.getDriver());


    static String productName;



    @Then("should see the Product Page")
    public void shouldSeeTheProductPage() {
        productPage.checkPage();
    }

    @When("save Product Name on Product Page")
    public void saveProductNameOnProductPage() {
      productName =  productPage.productName();
    }

    @And("taps Add To Basket {string} on Product Page")
    public void tapsAddToBasketOnProductPage(String item) {
        productPage.addProductToCart(item);
    }

    @And("taps Size {string} on Product Page")
    public void tapsSizeOnProductPage(String size) {
        productPage.selectSize(size);
    }

    @And("taps Size Add to Basket on Product Page")
    public void tapsSizeAddToBasketOnProductPage() {
        productPage.addToCartSelectedSize();

    }
}
