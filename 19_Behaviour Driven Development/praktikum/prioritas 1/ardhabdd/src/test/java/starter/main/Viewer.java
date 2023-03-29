package starter.main;

import net.thucydides.core.annotations.Step;

public class Viewer {
    @Step("I am on the i page")
    public void onTheMainPage(){
        System.out.println("I am on the i page");
    }
    @Step("I click on the navbar viewer")
    public void iClickOnTheNavbarViewer(){
        System.out.println("I click on the navbar viewer");
    }
    @Step("I switch to my page viewer")
    public void iSwitchToMyPageViewer(){
        System.out.println("I switch to my page viewer");
    }
}
