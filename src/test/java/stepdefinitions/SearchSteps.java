package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SearchPage;
import utils.DriverManager;

public class SearchSteps {

    SearchPage searchPage = new SearchPage(DriverManager.getDriver());





    @Then("should see the Search Page")
    public void shouldSeeTheSearchPage() {
        searchPage.checkPage();
    }

    @When("sendkeys Search Area {string} on Search Page")
    public void sendkeysSearchAreaOnSearchPage(String item) {
        searchPage.seacrhKey(item);
        searchPage.clickSeacrhResult(item);
    }
}
