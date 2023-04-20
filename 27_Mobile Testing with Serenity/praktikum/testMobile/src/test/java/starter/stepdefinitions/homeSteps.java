package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import starter.screen.homeScreen;

public class homeSteps {
    @Steps
    homeScreen homeSreens;

    @Then("user on home page")
    public void theUserGoesToTheHomePage(String home) {
        Assert.assertEquals(home, homeSreens.theUserGoesToTheHomePage());
    }

    @And("user see name account")
    public void userSeeNameAccount(String name) {
        Assert.assertEquals(name, homeSreens.userSeeNameAccount());
    }

    @And("user see email account")
    public void userSeeEmailAccount(String email) {
        Assert.assertEquals(email, homeSreens.userSeeEmailAccount());
    }

    @And("user see password account")
    public void userSeePasswordAccount(String password) {
        Assert.assertEquals(password, homeSreens.userSeePasswordAccount());
    }
}
