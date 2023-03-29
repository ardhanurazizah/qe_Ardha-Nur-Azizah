package starter.main;

import net.thucydides.core.annotations.Step;

public class Account {
    @Step("I am on the Z page")
    public void iAmOnTheZPage(){
        System.out.println("I am on the Z page");
    }
    @Step("I click on my profile")
    public void iClickOnMyProfile(){
        System.out.println("I click on my profile");
    }
    @Step("I click on selected settings")
    public void iClickOnSelectedSettings(){
        System.out.println("I click on selected settings");
    }
    @Step("I am on the page I selected earlier")
    public void iMOnThePageISelectedEarlier(){
        System.out.println("I am on the page I selected earlier");
    }
}
