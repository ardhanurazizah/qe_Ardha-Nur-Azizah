package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.Login;
import starter.login.Pulsa;

public class PulsaSteps {
    @Steps
    Pulsa pulsa;
    @Given("Remember me on login page")
    public void rememberMeOnLoginPage(){
        pulsa.rememberMeOnLoginPage();
    }
    @When("I click the pulsa product")
    public void iClickThePulsaProduct(){
        pulsa.iClickThePulsaProduct();
    }
    @And("I can input the telephone number")
    public void iCanInputTheTelephoneNumber(){
        pulsa.iCanInputTheTelephoneNumber();
    }
    @And("I can choose a nominal pulse")
    public void iCanChooseANominalPulse(){
        pulsa.iCanChooseANominalPulse();
    }
    @And("I can click on the nominal chosen")
    public void iCanClickOnTheNominalChosen(){
        pulsa.iCanClickOnTheNominalChosen();
    }
    @And("I can go directly to the payment page")
    public void iCanGoDirectlyToThePaymentPage(){
        pulsa.iCanGoDirectlyToThePaymentPage();
    }
    @Then("I managed to make a credit product purchase")
    public void iManagedToMakeACreditProductPurchase(){
        pulsa.iManagedToMakeACreditProductPurchase();
    }
}
