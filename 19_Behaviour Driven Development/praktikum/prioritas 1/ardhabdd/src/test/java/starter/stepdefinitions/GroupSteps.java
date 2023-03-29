package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import starter.main.Group;

public class GroupSteps {
    @Steps
    Group group;

    @Given("I am on main page")
    public void onMainPage(){
        group.onMainPage();
    }
    @When("I click on the navbar group")
    public void iClickOnTheNavbarGroup() {
        group.iClickOnTheNavbarGroup();
    }

    @Then("I go to my group page")
    public void iGoToMyGroupPage() {
        group.iGoToMyGroupPage();
    }
}
