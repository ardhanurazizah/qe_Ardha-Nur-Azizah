package starter.login;

import net.thucydides.core.annotations.Step;

public class Login {
    @Step("Remember me on the login page")
    public void rememberMeOnTheLoginPage(){
        System.out.println("Remember me on the login page");
    }
    @Step("I enter my email or telephone and password correctly")
    public void iEnterMyEmailOrTelephoneAndPasswordCorrectly(){
        System.out.println("I enter my email or telephone and password correctly");
    }
    @Step("I clicked the login button")
    public void iClickedTheLogin(){
        System.out.println("I clicked the login button");
    }
    @Step("I'm on the home page")
    public void OnTheHomePage(){
        System.out.println("I'm on the home page");
    }
}
