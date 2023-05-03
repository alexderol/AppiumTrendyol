package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ButtonPage;
import pages.GenderPage;
import utils.DriverManager;

public class GenderSteps {
    GenderPage genderPage = new GenderPage(DriverManager.getDriver());




    @Given("user should see the Gender Page")
    public void userShouldSeeTheGenderPage() {

        genderPage.checkPage();
    }

    @When("taps Gender {string} on Gender Page")
    public void tapsGenderOnGenderPage(String gender) {
        genderPage.selectGender(gender);
    }
}
