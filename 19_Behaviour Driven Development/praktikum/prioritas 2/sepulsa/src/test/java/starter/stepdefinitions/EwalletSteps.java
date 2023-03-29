package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.Ewallet;

public class EwalletSteps {
    @Steps
    Ewallet ewallet;
    @Given("I am on the login page2")
    public void iAmOnTheLoginPage2(){
        ewallet.iAmOnTheLoginPage2();
    }
    @When("I click on electronic money products")
    public void iClickOnElectronicMoneyProducts(){
        ewallet.iClickOnElectronicMoneyProducts();
    }
    @And("I can choose the type of electronic money")
    public void iCanChooseTheTypeOfElectronicMoney(){
        ewallet.iCanChooseTheTypeOfElectronicMoney();
    }
    @And("I can enter a telephone number1")
    public void iCanEnterATelephoneNumber1(){
        ewallet.iCanEnterATelephoneNumber1();
    }
    @And("I can choose the nominal top up type")
    public void iCanChooseTheNominalTopUpType(){
        ewallet.iCanChooseTheNominalTopUpType();
    }
    @And("I can go directly to the payment page3")
    public void iCanGoDirectlyToThePaymentPage3(){
        ewallet.iCanGoDirectlyToThePaymentPage3();
    }
    @Then("I managed to top up electronic money")
    public void iManagedToTopUpElectronicMoney(){
        ewallet.iManagedToTopUpElectronicMoney();
    }
}
