package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CartPage;
import pages.ProductPage;
import utils.DriverManager;

public class CartSteps {

    CartPage cartPage = new CartPage(DriverManager.getDriver());
    ProductSteps productSteps = new ProductSteps();


    @Then("should see the Cart Page")
    public void shouldSeeTheCartPage() {
        cartPage.checkPage();
    }

    @And("should see Same Product Name on Cart Page")
    public void shouldSeeSameProductNameOnCartPage() {
        String brandName = cartPage.checkProductName();
        String currentProductName = productSteps.productName;
        Assert.assertEquals(currentProductName,brandName);

    }

    @When("taps Delete Button on Cart Page")
    public void tapsDeleteButtonOnCartPage() {
        cartPage.deleteProduct();
    }

    @And("taps Delete Popup on Cart Page")
    public void tapsDeletePopupOnCartPage() {
        cartPage.tapsDeletePopUp();
    }

    @Then("should see Empty Message {string} on")
    public void shouldSeeEmptyMessageOn(String message) {
        String returnedMessage = cartPage.checkEmptyMessage();
        Assert.assertEquals(returnedMessage,message);
    }
}
