package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ResultPage;
import pages.SearchPage;
import utils.DriverManager;

public class ResultSteps {

    ResultPage resultPage = new ResultPage(DriverManager.getDriver());






    @Then("should see the Result Page")
    public void shouldSeeTheResultPage() {
        resultPage.checkPage();

    }

    @When("taps Filter on Result Page")
    public void tapsFilterOnResultPage() {
        resultPage.clickFilterButton();
    }

    @When("taps Order on Result Page")
    public void tapsOrderOnResultPage() {


    }

    @When("taps second Product on Result Page")
    public void tapsSecondProductOnResultPage() {
        resultPage.clickAnItem();
    }
}
