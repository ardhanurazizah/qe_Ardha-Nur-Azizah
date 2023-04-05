package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;

    //===================Positive Login=============================
    @Given("user on login page")
    public void userOnLoginPage() {
        loginPage.onLoginPage();
    }

    @When("user input valid username")
    public void userInputValidUsername(){
        loginPage.inputUserName("standard_user");
    }

    @And("user input valid password")
    public void userInputValidPassword() {
        loginPage.inputPassword("secret_sauce");
    }

    @And("user click login button")
    public void userClickLoginButton()  {
        loginPage.clickLoginButton();
    }

    @Then("user on products page")
    public void userOnProductsPage() {
        loginPage.onProductsPage();
    }

    //===================Negative Login=============================

    @When("user input invalid username")
    public void userInputInvalidUsername() {
        loginPage.inputInvalidUsername("ardha");
    }

    @Then("user see error message")
    public void userSeeErrorMessage() {
        loginPage.errorMessageIsDispalyed();
    }

    //===================Positive All Item=============================
    @And("the user clicks the add to card button in one product")
    public void clickOneProduct(){
        loginPage.clickOneProduct();

    }
    @Then("the user can see the number of products in the shopping cart symbol")
    public void seeNumber() {
        loginPage.seeNumber();
    }

    //===================Negative All Item=============================
    @And("the user click the remove button in one product")
    public void doesNotClickOneProduct(){
        loginPage.doesNotClickOneProduct();

    }
    @Then("the user does not see the number of products in the shopping cart")
    public void doesNotSeeNumber(){
        loginPage.doesNotSeeNumber();

    }

    //===================Positive Checkout Information=============================
    @And("the user clicks the shopping cart")
    public void theUserClicksTheShoppingCart() {
        loginPage.theUserClicksTheShoppingCart();
    }

    @And("the user to the checkout page")
    public void theUserToTheCheckoutPage() {
        loginPage.theUserToTheCheckoutPage();
    }

    @And("the user clicks the checkout button")
    public void theUserClicksTheCheckoutButton() {
        loginPage.theUserClicksTheCheckoutButton();
    }

    @And("the user to the personal data page")
    public void theUserToThePersonalDataPage() {
        loginPage.theUserToThePersonalDataPage();
    }

    @And("the user fills in the first name field")
    public void theUserFillsInTheFirstNameField() {
        loginPage.theUserFillsInTheFirstNameField("erlita");
    }

    @And("the user fills in the last name field")
    public void theUserFillsInTheLastNameField() {
        loginPage.theUserFillsInTheLastNameField("sandra");
    }

    @And("the user fills in the postal code field")
    public void theUserFillsInThePostalCodeField() {
        loginPage.theUserFillsInThePostalCodeField("64483");
    }

    @And("the user clicks the continue button")
    public void theUserClicksTheContinueButton() {
        loginPage.theUserClicksTheContinueButton();
    }

    @And("the user on the overview page")
    public void theUserOnTheOverviewPage() {
        loginPage.theUserOnTheOverviewPage();
    }

    @And("the user gets the total price")
    public void theUserGetsTheTotalPrice() {
        loginPage.theUserOnTheOverviewPage();
    }

    @Then("the user successfully checkout by click finish")
    public void theUserSuccessfullyCheckoutByClickFinish() {
        loginPage.theUserSuccessfullyCheckoutByClickFinish();
    }

    @And("the user see an error first name")
    public void theUserSeeAnErrorFirstName() {
    }

    @And("the user see an error last name")
    public void theUserSeeAnErrorLastName() {
    }

    @Then("the user see an error postal code")
    public void theUserSeeAnErrorPostalCode() {
    }
}
