package starter.login;

import net.thucydides.core.annotations.Step;

public class Other {
    @Step("I am on the payment page")
    public void iAmOnThePaymentPage(){
        System.out.println("I am on the payment page");
    }
    @Step("I click on the selected product")
    public void iClickOnTheSelectedProduct(){
        System.out.println("I click on the selected product");
    }
    @Step("I get transaction details")
    public void iGetTransactionDetails(){
        System.out.println("I get transaction details");
    }
    @Step("I can input the promo code")
    public void iCanInputThePromoCode(){
        System.out.println("I can input the promo code");
    }
    @Step("I can choose a payment method")
    public void iCanChooseAPaymentMethod(){
        System.out.println("I can choose a payment method");
    }
    @Step("I managed to direct to the selected method")
    public void iManagedToDirectToTheSelectedMethod(){
        System.out.println("I managed to direct to the selected method");
    }
}
