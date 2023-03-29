package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.main.Viewer;

public class ViewerSteps {
    @Steps
    Viewer viewer;

    @Given("I am on the i page")
    public void onTheMainPage(){
        viewer.onTheMainPage();
    }
    @When("I click on the navbar viewer")
    public void iClickOnTheNavbarViewer() {
        viewer.iClickOnTheNavbarViewer();
    }

    @Then("I switch to my page viewer")
    public void iSwitchToMyPageViewer() {
        viewer.iSwitchToMyPageViewer();
    }
}
