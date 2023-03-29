package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.main.Account;

public class AccountSteps {
    @Steps
    Account account;
    @Given("I am on the Z page")
    public void iAmOnTheZPage() {
        account.iAmOnTheZPage();
    }

    @When("I click on my profile")
    public void iClickOnMyProfile() {
        account.iClickOnMyProfile();
    }

    @And("I click on selected settings")
    public void iClickOnSelectedSettings() {
        account.iClickOnSelectedSettings();
    }

    @Then("I am on the page I selected earlier")
    public void iMOnThePageISelectedEarlier() {
        account.iMOnThePageISelectedEarlier();
    }
}
