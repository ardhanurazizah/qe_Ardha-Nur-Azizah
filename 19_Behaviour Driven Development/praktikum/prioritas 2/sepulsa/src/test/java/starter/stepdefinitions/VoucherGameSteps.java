package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.Login;
import starter.login.VoucherGame;

public class VoucherGameSteps {
    @Steps
    VoucherGame voucherGame;
    @Given("I am on the login page")
    public void iAamOnTheLoginPage(){
        voucherGame.iAamOnTheLoginPage();
    }
    @When("I click on the game voucher product")
    public void iClickOnTheGameVoucherProduct(){
        voucherGame.iClickOnTheGameVoucherProduct();
    }
    @And("I can click on the selected voucher")
    public void iCanClickOnTheSelectedVoucher(){
        voucherGame.iCanClickOnTheSelectedVoucher();
    }
    @And("I can input the teletree number")
    public void iCanInputTheTeletreeNumber(){
        voucherGame.iCanInputTheTeletreeNumber();
    }
    @And("I can choose the nominal voucher")
    public void iCanChooseTheNominalVoucher(){
        voucherGame.iCanChooseTheNominalVoucher();
    }
    @And("I can click on the nominal chosen5")
    public void iCanClickOnTheNominalChosen1(){
        voucherGame.iCanClickOnTheNominalChosen1();
    }
    @And("I can go directly to the payment page1")
    public void iCanGoDirectlyToThePaymentPage1(){
        voucherGame.iCanGoDirectlyToThePaymentPage1();
    }
    @Then("I managed to make a credit product purchase2")
    public void iManagedToMakeACreditProductPurchase1(){
        voucherGame.iManagedToMakeACreditProductPurchase1();
    }
}
