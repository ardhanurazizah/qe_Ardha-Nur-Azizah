package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.main.ShareVidio;

public class ShareVidioSteps {
    @Steps
    ShareVidio shareVidio;

    @Given("I am on the g page")
    public void onTheMainPage(){
        shareVidio.onTheMainPage();
    }
    @When("I click on the vidio menu")
    public void iClickOnTheVidioMenu() {
    }

    @And("I can add vidio")
    public void iCanAddVidio() {
    }
    @And("I can click the done button")
    public void iCanClickTheDoneButton() {
    }
    @Then("I have managed to post a vidio")
    public void iHaveManagedToPostAVidio() {
    }
}
