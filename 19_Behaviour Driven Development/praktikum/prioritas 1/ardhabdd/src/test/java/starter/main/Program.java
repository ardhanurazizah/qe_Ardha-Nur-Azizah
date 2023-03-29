package starter.main;

import net.thucydides.core.annotations.Step;

public class Program {
    @Step("I am on the d page")
    public void onTheMainPage(){
        System.out.println("I am on the d page");
    }
    @Step("I click on the navbar events")
    public void iClickOnTheNavbarEvents(){
        System.out.println("I click on the navbar events");
    }
    @Step("I go to my events page")
    public void iGoToMyEventsPage(){
        System.out.println("I go to my events page");
    }
}
