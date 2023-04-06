package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By titleMain(){
        return By.xpath("//p[text()='Saat ini kamu masih Guest lho, masuk ke akun kamu yuk']");
    }
    private By titleLogin(){
        return By.xpath("//h3[text()='Yuk login dengan e-mail atau nomor HP mu untuk tetap terhubung dengan kami :)']");
    }
    private By masukBtn(){
        return By.xpath("//span[text()='Masuk']");
    }
    private By email(){
        return By.id("email");
    }
    private By password(){
        return By.id("password");
    }
    private By masukBtnPage(){
        return By.id("submit_login");
    }
    private By successLogin(){
        return By.xpath("//p[text()='Pulsa']");
    }

    //===================Positive Login=============================
    @Step
    public void userOnMainPage() {
        open();
        $(titleMain()).shouldBeVisible();
    }
    @Step
    public void userClickLoginButton() {
        $(masukBtn()).click();
    }
    @Step
    public void theUserOnTheLoginPage() {
        $(titleLogin()).shouldBeVisible();
    }
    @Step
    public void theUserEnterAValidEmail(String Email) {
        $(email()).type(Email);
    }
    @Step
    public void theUserEnterAValidPassword(String Password) {
        $(password()).type(Password);
    }
    @Step
    public void theUserClickTheLoginButton() {
        $(masukBtnPage()).click();
    }

    //===================Negative Login1=============================
    @Step
    public void theUserEnterAnInvalidEmail(String Email) {
        $(email()).type(Email);
    }
    @Step
    public void theUserEnterAnInvalidPassword(String Password) {
        $(password()).type(Password);
    }
    @Step
    public void userSeeErrorMessage(){
        $(titleLogin()).shouldBeVisible();
    }
}
