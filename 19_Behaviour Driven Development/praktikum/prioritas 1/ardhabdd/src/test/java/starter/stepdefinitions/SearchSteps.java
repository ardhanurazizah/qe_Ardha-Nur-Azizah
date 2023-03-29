package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.main.Search;

public class SearchSteps {
    @Steps
    Search search;
        @Given("I am on the e page")
        public void onTheMainPage(){
            search.onTheMainPage();
        }
        @When("I click the search section")
        public void onTheSearchSection(){
            search.onTheSearchSection();
        }
        @And("I entered username or job")
        public void enterInput(){
            search.enterInput();
        }
        @And("will display related searches")
        public void onDisplay(){
            search.onDisplay();
        }
        @Then("I click the found user/job$")
        public void click(){
            search.click();
        }
}

