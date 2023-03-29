package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.Other;

public class OtherSteps {
    @Steps
    Other other;
    @Given("I am on the payment page")
    public void iAmOnThePaymentPage() {
        other.iAmOnThePaymentPage();
    }

    @When("I click on the selected product")
    public void iClickOnTheSelectedProduct() {
        other.iClickOnTheSelectedProduct();
    }

    @And("I get transaction details")
    public void iGetTransactionDetails() {
        other.iGetTransactionDetails();
    }

    @And("I can input the promo code")
    public void iCanInputThePromoCode() {
        other.iCanInputThePromoCode();
    }

    @And("I can choose a payment method")
    public void iCanChooseAPaymentMethod() {
        other.iCanChooseAPaymentMethod();
    }

    @Then("I managed to direct to the selected method")
    public void iManagedToDirectToTheSelectedMethod() {
        other.iManagedToDirectToTheSelectedMethod();
    }
}
