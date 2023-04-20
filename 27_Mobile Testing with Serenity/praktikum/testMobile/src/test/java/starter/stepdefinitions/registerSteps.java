package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import starter.screen.resgisterScreen;

public class registerSteps {
    @Steps
    resgisterScreen resgisterScreen;
    @When("user click create one")
    public void userClickCreateOne() {
        resgisterScreen.userClickCreateOne();
    }

    @And("user enter a valid name")
    public void userEnterAValidName() {
        resgisterScreen.userEnterAValidName();
    }

    @And("user enter a valid email")
    public void userEnterAValidEmail() {
        resgisterScreen.userEnterAValidEmail();
    }

    @And("user enter a valid password")
    public void userEnterAValidPassword() {
        resgisterScreen.userEnterAValidPassword();
    }

    @And("user enter a valid confirm password")
    public void userEnterAValidConfirmPassword() {
        resgisterScreen.userEnterAValidConfirmPassword();
    }

    @And("user click on the register button")
    public void userClickOnTheRegisterButton() {
        resgisterScreen.userClickOnTheRegisterButton();
    }

//    @Then("user see message registration has been successful")
//    public void theUserSeesAnMessage(String message) {
//        Assert.assertEquals(message, resgisterScreen.theUserSeesAnMessage());
//    }

    @Then("user see message {string}")
    public void userSeeMessage(String message) {
        Assert.assertEquals(message, resgisterScreen.userSeeMessage());
    }
}
