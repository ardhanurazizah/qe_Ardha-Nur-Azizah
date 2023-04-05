package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By usernameField() {
        return By.id("user-name");
    }
    private By passwordField(){
        return By.id("password");
    }
    private By loginBtn(){
        return By.id("login-button");
    }
    private By titleProduct(){
        return By.xpath("//span[text()='Products']");
    }
    private By errorMessage() {
        return By.xpath("//h3[@data-test='error']");
    }
    private By productBtn(){
        return By.id("add-to-cart-sauce-labs-backpack");
    }
    private By seeNumberCard(){
        return By.xpath("//span[text()='1']");
    }
    private By removeCard(){
        return By.id("remove-sauce-labs-backpack");
    }
    private By noSeeNumber(){
        return By.className("shopping_cart_link");
    }
    private By cartPage(){
        return By.xpath("//span[text()='Your Cart']");
    }
    private By checkoutBtn(){
        return By.id("checkout");
    }
    private By infPage(){
        return By.xpath("//span[text()='Checkout: Your Information']");
    }
    private By firstName() {
        return By.id("first-name");
    }
    private By lastName() {
        return By.id("last-name");
    }
    private By postalCode() {
        return By.id("postal-code");
    }
    private By continueBtn(){
        return By.id("continue");
    }
    private By overviewPage(){
        return By.xpath("//span[text()='Checkout: Overview']");
    }
    private By total(){
        return By.xpath("//div[text()='Total: $']");
    }
    private By finishBtn(){
        return By.id("finish");
    }
    private By success(){
        return By.xpath("//h2[text()='Thank you for your order!']");
    }
    private By errorFirstName(){
        return By.xpath("//h3[text()='Error: First Name is required']");
    }
    private By errorLastName(){
        return By.xpath("//h3[text()='Error: Last Name is required']");
    }
    private By errorPostalCode(){
        return By.xpath("//h3[text()='Error: Postal Code is required']");
    }
    //===================Positive Login=============================
    @Step
    public void onLoginPage() {
        open();
        $(loginBtn()).shouldBeVisible();
    }
    @Step
    public void inputUserName(String username) {
        $(usernameField()).type(username);
    }

    @Step
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton(){
        $(loginBtn()).click();
    }
    @Step
    public void onProductsPage() {
        $(titleProduct()).shouldBeVisible();
    }

    //===================Negative Login=============================
    @Step
    public void inputInvalidUsername(String invalidUsername) {
        $(usernameField()).type(invalidUsername);
    }
    @Step
    public void errorMessageIsDispalyed() {
        $(errorMessage()).shouldBeVisible();
    }

    //===================Positive All Item=============================
    @Step
    public void clickOneProduct(){
        $(productBtn()).click();
    }
    @Step
    public void seeNumber() {
        $(seeNumberCard()).shouldBeVisible();
    }

    //===================Negative All Item=============================
    @Step
    public void doesNotClickOneProduct(){
        $(removeCard()).click();
    }
    @Step
    public void doesNotSeeNumber(){
        $(noSeeNumber()).shouldBeVisible();
    }

    //===================Positive Checkout Information=============================
    @Step
    public void theUserClicksTheShoppingCart(){
        $(noSeeNumber()).click();
    }
    @Step
    public void theUserToTheCheckoutPage(){
        $(cartPage()).shouldBeVisible();
    }
    @Step
    public void theUserClicksTheCheckoutButton(){
        $(checkoutBtn()).click();
    }
    @Step
    public void theUserToThePersonalDataPage(){
        $(infPage()).shouldBeVisible();
    }
    @Step
    public void theUserFillsInTheFirstNameField(String firstName){
        $(firstName()).type(firstName);
    }
    @Step
    public void theUserFillsInTheLastNameField(String lastName){
        $(lastName()).type(lastName);
    }
    @Step
    public void theUserFillsInThePostalCodeField(String code){
        $(postalCode()).type(code);
    }
    @Step
    public void theUserClicksTheContinueButton(){
        $(continueBtn()).click();
    }
    @Step
    public void theUserOnTheOverviewPage(){
        $(overviewPage()).shouldBeVisible();
    }
    @Step
    public void theUserGetsTheTotalPrice(){
        $(total()).shouldBeVisible();
    }
    @Step
    public void theUserSuccessfullyCheckoutByClickFinish(){
        $(finishBtn()).click();
        $(success()).shouldBeVisible();
    }
    @Step
    public void theUserSeeAnErrorFirstName(){
        $(errorFirstName()).shouldBeVisible();
    }
    @Step
    public void theUserSeeAnErrorLastName(){
        $(errorLastName()).shouldBeVisible();
    }
    @Step
    public void theUserSeeAnErrorPostalCode(){
        $(errorPostalCode()).shouldBeVisible();
    }
    //===================Negative Checkout INformation=============================
}
