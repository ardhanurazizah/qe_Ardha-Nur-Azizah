package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;
import starter.pages.PaymentPage;
import starter.pages.ProductPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;

    //===================Positive Login=============================
    @Given("user on main page")
    public void userOnMainPage() {
        loginPage.userOnMainPage();
    }
    @And("user click login button")
    public void userClickLoginButton() {
        loginPage.userClickLoginButton();
    }

    @And("user on the login page")
    public void theUserOnTheLoginPage() {
        loginPage.theUserOnTheLoginPage();
    }

    @And("user enter a valid email")
    public void theUserEnterAValidEmail() {
        loginPage.theUserEnterAValidEmail("naardha0@gmail.com");
    }

    @And("user enter a valid password")
    public void theUserEnterAValidPassword() {
        loginPage.theUserEnterAValidPassword("Ardhanurazizah2001.");
    }

    @And("user click the login button")
    public void theUserClickTheLoginButton() {
        loginPage.theUserClickTheLoginButton();
    }

    @Then("user is on the product page")
    public void theUserIsOnTheProductPage() {
        loginPage.theUserIsOnTheProductPage();
    }

    @And("user enter an invalid email")
    public void theUserEnterAnInvalidEmail() {
        loginPage.theUserEnterAnInvalidEmail("ardha@gmail.com");
    }

    @And("user enter an invalid password")
    public void theUserEnterAnInvalidPassword() {
        loginPage.theUserEnterAnInvalidPassword("ardhanurazizah");
    }
    @And("user see error message")
    public void userSeeErrorMessage() {
        loginPage.userSeeErrorMessage();
    }

    //=================================Product==============================
    @Steps
    ProductPage productSteps;
    @And("user click pulse product")
    public void usersClickPulseProduct() {
        productSteps.usersClickPulseProduct();
    }

    @And("user fill in the phone number")
    public void userFillInThePhoneNumber() {
        productSteps.userFillInThePhoneNumber("085748682562");
    }

    @And("user click on the pulse package")
    public void userClickOnThePulsePackage() {
        productSteps.userClickOnThePulsePackage();
    }

    @And("user to the payment page")
    public void userToThePaymentPage() {
        productSteps.userToThePaymentPage();
    }

    @And("user see the total payment")
    public void userSeeTheTotalPayment() {
        productSteps.userSeeTheTotalPayment();
    }

    @And("user fill in the excess phone number")
    public void userFillInTheExcessPhoneNumber() {
        productSteps.userFillInTheExcessPhoneNumber("085748682562345");
    }

    @And("user see an error message")
    public void userSeeAnErrorMessage() {
        productSteps.userSeeAnErrorMessage();
    }

    @And("user click on the game voucher product")
    public void userClickOnTheGameVoucherProduct() {
        productSteps.userClickOnTheGameVoucherProduct();
    }

    @And("user click on the voucher menu")
    public void userClickOnTheVoucherMenu() {
        productSteps.userClickOnTheVoucherMenu();
    }

    @And("user click on the selected voucher type")
    public void userClickOnTheSelectedVoucherType() {
        productSteps.userClickOnTheSelectedVoucherType();
    }

    @And("user fill in the phone number voucher")
    public void userFillInThePhoneNumberVoucher() {
        productSteps.userFillInThePhoneNumberVoucher("085748682562");
    }

    @And("user click on the selected voucher package")
    public void userClickOnTheSelectedVoucherPackage() {
        productSteps.userClickOnTheSelectedVoucherPackage();
    }

    @And("user to the payment page voucher")
    public void userToThePaymentPageVoucher() {
        productSteps.userToThePaymentPageVoucher();
    }

    @Then("user see the total payment voucher")
    public void userSeeTheTotalPaymentVoucher() {
        productSteps.userSeeTheTotalPaymentVoucher();
    }
    @And("user fill in the excess cellphone number")
    public void userFillInTheExcessCellPhoneNumber() {
        productSteps.userFillInThePhoneNumberVoucher("085748682562345");
    }
    @Then("user see an error message voucher")
    public void userSeeAnErrorMessageVoucher() {
        productSteps.userSeeAnErrorMessageVoucher();
    }

    //===================Payment=============================
    @Steps
    PaymentPage paymentPage;
    @And("user chooses a payment method")
    public void userChoosesAPaymentMethod() {
        paymentPage.userChoosesAPaymentMethod();
    }

    @Then("user successfully select a payment method and click pay now")
    public void userSuccessfullySelectAPaymentMethodAndClickPayNow() {
        paymentPage.userSuccessfullySelectAPaymentMethodAndClickPayNow();
    }

    @Then("user cannot go to the payment page and choose a payment method")
    public void userCannotGoToThePaymentPageAndChooseAPaymentMethod() {
        paymentPage.userCannotGoToThePaymentPageAndChooseAPaymentMethod();
    }
}
