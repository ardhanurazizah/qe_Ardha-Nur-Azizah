package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.main.Hastags;

public class HastagsSteps {
    @Steps
    Hastags hastags;
    @Given("I am on the first page")
    public void onTheMainPage(){
        hastags.a();
    }
    @When("I click on the navbar hastags")
    public void iClickOnTheNavbarHastags() {
        hastags.iClickOnTheNavbarHastags();
    }

    @Then("I go to my hastags page")
    public void iGoToMyHastagsPage() {
        hastags.iGoToMyHastagsPage();
    }
}
