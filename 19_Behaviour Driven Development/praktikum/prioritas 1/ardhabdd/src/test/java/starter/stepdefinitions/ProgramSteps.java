package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.main.Article;
import starter.main.Program;

public class ProgramSteps {
    @Steps
    Program program;

    @Given("I am on the d page")
    public void onTheMainPage(){
        program.onTheMainPage();
    }
    @When("I click on the navbar events")
    public void iClickOnTheNavbarEvents() {
        program.iClickOnTheNavbarEvents();
    }

    @Then("I go to my events page")
    public void iGoToMyEventsPage() {
        program.iGoToMyEventsPage();
    }
}
