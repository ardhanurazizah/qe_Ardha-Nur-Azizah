package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import starter.screen.loginScreen;

public class loginSteps {
    @Steps
    loginScreen login;
    @Given("user on login page")
    public void userOnLoginPage() {
        login.onLoginPage();
    }

    @When("user input valid username")
    public void userInputValidUsername() {
        login.inputEmail("anik@gmail.com");
    }

    @And("user input invalid password")
    public void userInputInvalidPassword() {
        login.inputPassword("123123123");
    }

    @Then("user see error message {string}")
    public void userSeeErrorMessage(String message) {
        Assert.assertEquals(message, login.getErrorMessage());
    }

    @And("user click login button")
    public void userClickLoginButton() {
        login.tapLoginButton();
    }

    @When("user input invalid username")
    public void userInputInvalidUsername() {
        login.userInputInvalidUsername("anikz@gmail.com");
    }
    @And("user input valid password")
    public void userInputValidPassword() {
        login.userInputValidPassword("anik");
    }
}
