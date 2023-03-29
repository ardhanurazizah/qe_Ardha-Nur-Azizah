package starter.main;

import net.thucydides.core.annotations.Step;

public class Article {
    @Step("I am on the main page")
    public void onTheMainPage(){
        System.out.println("I am on the main page");
    }
    @Step("I click on the photo menu")
    public void iClickOnThePhotoMenu(){
        System.out.println("I click on the photo menu");
    }
    @Step("I can input a title")
    public void iCanInputATitle(){
        System.out.println("I can input a title");
    }
    @Step("I can add photos")
    public void iCanAddPhotos(){
        System.out.println("I can add photos");
    }
    @Step("I can input the contents of the article")
    public void iCanInputTheContentsOfTheArticle(){
        System.out.println("I can input the contents of the article");
    }
    @Step("I have successfully posted the article")
    public void iHaveSuccessfullyPostedTheArticle(){
        System.out.println("I have successfully posted the article");
    }
}
