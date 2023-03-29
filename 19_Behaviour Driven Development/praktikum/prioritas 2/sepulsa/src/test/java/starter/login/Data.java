package starter.login;

import net.thucydides.core.annotations.Step;

public class Data {
    @Step("I am on the login page1")
    public void iaAmOnTheLoginPage1(){
        System.out.println("I am on the login page1");
    }
    @Step("I click product data plan")
    public void iClickProductDataPlan(){
        System.out.println("I click product data plan");
    }
    @Step("I can enter a telephone number")
    public void iCanEnterATelephoneNumber(){
        System.out.println("I can enter a telephone number");
    }
    @Step("I can choose a data package")
    public void iCanChooseADataPackage(){
        System.out.println("I can choose a data package");
    }
    @Step("I can go directly to the payment page2")
    public void iCanGoDirectlyToThePaymentPage2(){
        System.out.println("I can go directly to the payment page2");
    }
    @Step("I managed to purchase a data package")
    public void iManagedToPurchaseADataPackage(){
        System.out.println("I managed to purchase a data package");
    }
}
