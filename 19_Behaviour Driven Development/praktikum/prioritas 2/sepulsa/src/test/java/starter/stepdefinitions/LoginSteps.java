package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.login.Login;

public class LoginSteps {
    @Steps
    Login group;
    @Given("Remember me on the login page")
    public void rememberMeOnTheLoginPage(){
        group.rememberMeOnTheLoginPage();
    }
    @When("I enter my email or telephone and password correctly")
    public void iEnterMyEmailOrTelephoneAndPasswordCorrectly() {
        group.iEnterMyEmailOrTelephoneAndPasswordCorrectly();
    }
    @And("I clicked the login button")
    public void iClickedTheLogin(){
        group.iClickedTheLogin();
    }
    @Then("I'm on the home page")
    public void OnTheHomePage(){
        group.OnTheHomePage();
    }
}
