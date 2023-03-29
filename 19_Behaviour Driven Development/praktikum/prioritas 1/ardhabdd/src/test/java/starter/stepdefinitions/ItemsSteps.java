package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.main.Article;
import starter.main.Items;

public class ItemsSteps {
    @Steps
    Items items;

    @Given("I am on the a page")
    public void onTheMainPage(){
        items.onTheMainPage();
    }
    @When("I click on the navbar item")
    public void iClickOnTheNavbarItem() {
        items.iClickOnTheNavbarItem();
    }

    @Then("I go to my items page")
    public void iGoToMyItemsPage() {
        items.iGoToMyItemsPage();
    }
}
