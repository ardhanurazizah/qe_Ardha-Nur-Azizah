package starter.login;

import net.thucydides.core.annotations.Step;

public class Pulsa {
    @Step("Remember me on login page")
    public void rememberMeOnLoginPage(){
        System.out.println("Remember me on login page");
    }
    @Step("I click the pulse product")
    public void iClickThePulsaProduct(){
        System.out.println("I click the pulse product");
    }
    @Step("I can input the telephone number")
    public void iCanInputTheTelephoneNumber(){
        System.out.println("I can input the telephone number");
    }
    @Step("I can choose a nominal pulse")
    public void iCanChooseANominalPulse(){
        System.out.println("I can choose a nominal pulse");
    }
    @Step("I can click on the nominal chosen")
    public void iCanClickOnTheNominalChosen(){
        System.out.println("I can click on the nominal chosen");
    }
    @Step("I can go directly to the payment page")
    public void iCanGoDirectlyToThePaymentPage(){
        System.out.println("I can go directly to the payment page");
    }
    @Step("I managed to make a credit product purchase")
    public void iManagedToMakeACreditProductPurchase(){
        System.out.println("I managed to make a credit product purchase");
    }
}
