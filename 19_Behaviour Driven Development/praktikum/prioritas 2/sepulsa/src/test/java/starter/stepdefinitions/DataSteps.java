package starter.stepdefinitions;

import net.thucydides.core.annotations.Steps;
import starter.login.Data;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class DataSteps {
    @Steps
    Data data;

    @Given("I am on the login page1")
    public void iaAmOnTheLoginPage1(){
        data.iaAmOnTheLoginPage1();
    }
    @When("I click product data plan")
    public void iClickProductDataPlan(){
        data.iClickProductDataPlan();
    }
    @And("I can enter a telephone number")
    public void iCanEnterATelephoneNumber(){
        data.iCanEnterATelephoneNumber();
    }
    @And("I can choose a data package")
    public void iCanChooseADataPackage(){
        data.iCanChooseADataPackage();
    }
    @And("I can go directly to the payment page2")
    public void iCanGoDirectlyToThePaymentPage2(){
        data.iCanGoDirectlyToThePaymentPage2();
    }
    @Then("I managed to purchase a data package")
    public void iManagedToPurchaseADataPackage(){
        data.iManagedToPurchaseADataPackage();
    }

}
