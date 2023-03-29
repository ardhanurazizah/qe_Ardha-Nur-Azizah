package starter.main;

import net.thucydides.core.annotations.Step;

public class Items {
    @Step("I am on the a page")
    public void onTheMainPage(){
        System.out.println("I am on the a page");
    }
    @Step("I click on the navbar item")
    public void iClickOnTheNavbarItem(){
        System.out.println("I click on the navbar item");
    }
    @Step("I go to my items page")
    public void iGoToMyItemsPage(){
        System.out.println("I go to my items page");
    }
}
