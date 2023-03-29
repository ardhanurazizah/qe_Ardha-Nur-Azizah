package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.PDAM;

public class PDAMSteps {
    @Steps
    PDAM pdam;
    @Given("I am on the login page3")
    public void iAmOnTheLoginPage() {
        pdam.iAmOnTheLoginPage();
    }

    @When("I click on PDAM product")
    public void iClickOnPDAMProduct() {
        pdam.iClickOnPDAMProduct();
    }

    @And("I can enter the customer number")
    public void iCanEnterTheCustomerNumber() {
        pdam.iCanEnterTheCustomerNumber();
    }

    @And("I can enter a telephone number2")
    public void iCanEnterATelephoneNumber() {
        pdam.iCanEnterATelephoneNumber();
    }

    @And("I can click check bill")
    public void iCanClickCheckBill() {
        pdam.iCanClickCheckBill();
    }
    @And("I can go directly to the payment page6")
    public void iCanGoDirectlyToThePaymentPage() {
        pdam.iCanGoDirectlyToThePaymentPage();
    }
    @Then("I managed to make PDAM bill payments")
    public void iManagedToMakePDAMBillPayments() {
        pdam.iManagedToMakePDAMBillPayments();
    }
}
