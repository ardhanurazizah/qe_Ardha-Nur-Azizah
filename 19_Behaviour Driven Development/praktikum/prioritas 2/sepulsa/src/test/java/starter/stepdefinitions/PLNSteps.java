package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.PLN;

public class PLNSteps {
    @Steps
    PLN pln;
    @Given("I am on the login page4")
    public void iAmOnTheLoginPage() {
        pln.iAmOnTheLoginPage();
    }
    @When("I click on PLN electricity products")
    public void iClickOnPLNElectricityProducts() {
        pln.iClickOnPLNElectricityProducts();
    }
    @And("I can input the customer id number")
    public void iCanInputTheCustomerIdNumber() {
        pln.iCanInputTheCustomerIdNumber();
    }

    @And("I can input the teletree number1")
    public void iCanInputTheTeletreeNumber1() {
        pln.iCanInputTheTeletreeNumber1();
    }

    @And("I can go directly to the payment page4")
    public void iCanGoDirectlyToThePaymentPage4() {
        pln.iCanGoDirectlyToThePaymentPage4();
    }

    @Then("I managed to make a purchase of electricity tokens")
    public void iManagedToMakeAPurchaseOfElectricityTokens() {
        pln.iManagedToMakeAPurchaseOfElectricityTokens();
    }
}
