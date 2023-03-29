package starter.main;

import net.thucydides.core.annotations.Step;

public class Network {
    @Step("I am on the b page")
    public void onTheMainPage(){
        System.out.println("I am on the b page");
    }
    @Step("I click on the connection navbar")
    public void iClickOnTheConnectionNavbar(){
        System.out.println("I click on the connection navbar");
    }
    @Step("I switch to my network page")
    public void iSwitchToMyNetworkPage(){
        System.out.println("I switch to my network page");
    }
}
