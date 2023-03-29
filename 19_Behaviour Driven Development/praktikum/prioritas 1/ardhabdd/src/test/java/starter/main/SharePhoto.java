package starter.main;

import net.thucydides.core.annotations.Step;

public class SharePhoto {
    @Step("I am on the f page")
    public void onTheMainPage(){
        System.out.println("I am on the f page");
    }
    @Step("I click on photo menu")
    public void iClickOnThePhotoMenu(){
        System.out.println("I click on the photo menu");
    }
    @Step("I can add photo")
    public void iCanAddPhotos(){
        System.out.println("I can add photo");
    }
    @Step("I can click done button")
    public void iCanClickTheDoneButton(){
        System.out.println("I can click done button");
    }
    @Step("I have managed to post a photo")
    public void iHaveManagedToPostAPhoto(){
        System.out.println("I have managed to post a photo");
    }
}
