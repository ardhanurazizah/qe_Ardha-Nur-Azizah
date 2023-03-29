package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.main.Network;

public class NetworkSteps {
    @Steps
    Network net;

    @Given("I am on the b page")
    public void onTheMainPage(){
        net.onTheMainPage();
    }
    @When("I click on the connection navbar")
    public void iClickOnTheConnectionNavbar() {
        net.iClickOnTheConnectionNavbar();
    }

    @Then("I switch to my network page")
    public void iSwitchToMyNetworkPage() {
        net.iSwitchToMyNetworkPage();
    }
}
