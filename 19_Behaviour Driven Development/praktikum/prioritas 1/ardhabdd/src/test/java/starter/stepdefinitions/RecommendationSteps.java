package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.main.Recommendation;

public class RecommendationSteps {
    @Steps
    Recommendation recommendation;

    @Given("I am on the main page 1")
    public void onTheMainPage(){
        recommendation.onTheMainPage();
    }
    @When("I click the arrow in the message")
    public void iClickTheArrowInTheMessage() {
        recommendation.iClickTheArrowInTheMessage();
    }

    @And("I can search for users")
    public void iCanSearchForUsers() {
        recommendation.iCanSearchForUsers();
    }

    @And("I can click the send message button")
    public void iCanClickTheSendMessageButton() {
        recommendation.iCanClickTheSendMessageButton();
    }

    @And("I can fill in the message to be sent")
    public void iCanFillInTheMessageToBeSent() {
        recommendation.iCanFillInTheMessageToBeSent();
    }

    @And("I can click the submit button")
    public void iCanClickTheSubmitButton() {
        recommendation.iCanClickTheSubmitButton();
    }

    @Then("I have successfully sent the message")
    public void iHaveSuccessfullySentTheMessage() {
        recommendation.iHaveSuccessfullySentTheMessage();
    }
}
