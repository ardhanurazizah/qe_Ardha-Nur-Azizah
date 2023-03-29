package starter.main;

import net.thucydides.core.annotations.Step;

public class Recommendation {
    @Step("I am on the main page")
    public void onTheMainPage(){
        System.out.println("I am on the main page");
    }
    @Step("I click the arrow in the message")
    public void iClickTheArrowInTheMessage(){
        System.out.println("I click the arrow in the message");
    }
    @Step("I can search for users")
    public void iCanSearchForUsers(){
        System.out.println("I can search for users");
    }
    @Step("I can click the send message button")
    public void iCanClickTheSendMessageButton(){
        System.out.println("I can click the send message button");
    }
    @Step("I can fill in the message to be sent")
    public void iCanFillInTheMessageToBeSent(){
        System.out.println("I can fill in the message to be sent");
    }
    @Step("I can click the submit button")
    public void iCanClickTheSubmitButton(){
        System.out.println("I can click the submit button");
    }
    @Step("I have successfully sent the message")
    public void iHaveSuccessfullySentTheMessage(){
        System.out.println("I have successfully sent the message");
    }
}
