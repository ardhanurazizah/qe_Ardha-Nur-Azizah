package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.Telkom;

public class TelkomSteps {
    @Steps
    Telkom telkom;
    @Given("I am on the login page5")
    public void iAmOnTheLoginPage() {
        telkom.iAmOnTheLoginPage();
    }

    @When("I click on the game voucher product1")
    public void iClickOnTheGameVoucherProduct() {
        telkom.iClickOnTheGameVoucherProduct();
    }

    @And("I can click on the selected voucher1")
    public void iCanClickOnTheSelectedVoucher() {
        telkom.iCanClickOnTheSelectedVoucher();
    }

    @And("I can input the teletree number2")
    public void iCanInputTheTeletreeNumber() {
        telkom.iCanInputTheTeletreeNumber();
    }

    @And("I can choose the nominal voucher1")
    public void iCanChooseTheNominalVoucher() {
        telkom.iCanChooseTheNominalVoucher();
    }

    @And("I can click on the nominal chosen1")
    public void iCanClickOnTheNominalChosen() {
        telkom.iCanClickOnTheNominalChosen();
    }

    @And("I can go directly to the payment page5")
    public void iCanGoDirectlyToThePaymentPage() {
        telkom.iCanGoDirectlyToThePaymentPage();
    }

    @Then("I managed to make a credit product purchase1")
    public void iManagedToMakeACreditProductPurchase() {
        telkom.iManagedToMakeACreditProductPurchase();
    }
}
