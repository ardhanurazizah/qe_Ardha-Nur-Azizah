package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.main.Sort;

public class SortSteps {
    @Steps
    Sort sort;

    @Given("I am on the h page")
    public void onTheMainPage(){
        sort.onTheMainPage();
    }
    @When("I click the sort section")
    public void iClickTheSortSection() {
        sort.iClickTheSortSection();
    }

    @And("I choose the most recent or most popular sort")
    public void iChooseTheMostRecentOrMostPopularSort() {
        sort.iChooseTheMostRecentOrMostPopularSort();
    }

    @Then("I can view posts by the selected sort")
    public void iCanViewPostsByTheSelectedSort() {
        sort.iCanViewPostsByTheSelectedSort();
    }
}
