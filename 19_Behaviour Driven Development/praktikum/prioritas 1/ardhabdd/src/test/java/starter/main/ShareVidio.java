package starter.main;

import net.thucydides.core.annotations.Step;

public class ShareVidio {
    @Step("I am on the g page")
    public void onTheMainPage(){
        System.out.println("I am on the g page");
    }
    @Step("I click on the vidio menu")
    public void iClickOnTheVidioMenu(){
        System.out.println("I click on the vidio menu");
    }
    @Step("I can add vidio")
    public void iCanAddVidio(){
        System.out.println("I can add vidio");
    }
    @Step("I can click the done button")
    public void iCanClickTheDoneButton(){
        System.out.println("I can click the done button");
    }
    @Step("I have managed to post a vidio")
    public void iHaveManagedToPostAVidio(){
        System.out.println("I have managed to post a vidio");
    }
}
