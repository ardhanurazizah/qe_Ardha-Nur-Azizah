package starter.main;

import net.thucydides.core.annotations.Step;

public class Group {
    @Step("I am on main page")
    public void onMainPage(){
        System.out.println("I am on main page");
    }
    @Step("I click on the navbar group")
    public void iClickOnTheNavbarGroup(){
        System.out.println("I click on the navbar group");
    }
    @Step("I go to my group page")
    public void iGoToMyGroupPage(){
        System.out.println("I go to my group page");
    }
}
