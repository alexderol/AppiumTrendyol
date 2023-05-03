package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FilterPage;
import pages.ResultPage;
import utils.DriverManager;

public class FilterSteps {
    FilterPage filterPage = new FilterPage(DriverManager.getDriver());







    @Then("should see the Filter Page")
    public void shouldSeeTheFilterPage() {
        filterPage.checkPage();
    }

    @When("taps Filter {string} on Filter Page")
    public void tapsFilterOnFilterPage(String kargo) {
        filterPage.tabDeliveryOptions(kargo);
    }

    @When("taps List Products {string} on Filter Page")
    public void tapsListProductsOnFilterPage(String listele) {
        filterPage.tabsListButton(listele);
    }
}
