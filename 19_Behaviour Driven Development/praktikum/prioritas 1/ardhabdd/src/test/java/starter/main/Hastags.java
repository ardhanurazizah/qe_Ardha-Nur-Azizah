package starter.main;

import net.thucydides.core.annotations.Step;

public class Hastags {
    @Step("I am on the first page")
    public void a(){
        System.out.println("I am on the firt page");
    }
    @Step("I click on the navbar hastags")
    public void iClickOnTheNavbarHastags(){
        System.out.println("I click on the navbar hastags");
    }
    @Step("I go to my hastags page")
    public void iGoToMyHastagsPage(){
        System.out.println("I go to my hastags page");
    }
}
