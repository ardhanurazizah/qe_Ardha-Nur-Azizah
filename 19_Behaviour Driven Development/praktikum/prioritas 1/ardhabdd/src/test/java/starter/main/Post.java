package starter.main;

import net.thucydides.core.annotations.Step;

public class Post {
    @Step("I am on the c page")
    public void onTheMainPage(){
        System.out.println("I am on the c page");
    }
    @Step("I click on the posts section")
    public void iClickOnThePostsSection(){
        System.out.println("I click on the posts section");
    }
    @Step("I get the post page")
    public void iGetThePostPage(){
        System.out.println("I get the post page");
    }
    @Step("I can choose who sees posts")
    public void iCanChooseWhoSeesPosts(){
        System.out.println("I can choose who sees posts");
    }
    @Step("I can fill posts")
    public void iCanFillPosts(){
        System.out.println("I can fill posts");
    }
    @Step("I can choose which emoticon to use")
    public void iCanChooseWhichEmoticonToUse(){
        System.out.println("I can choose which emoticon to use");
    }
    @Step("I can photos")
    public void iCanAddPhotos(){
        System.out.println("I can add photos");
    }
    @Step("I can add videos")
    public void iCanAddVideos(){
        System.out.println("I can add videos");
    }
    @Step("I can add documents")
    public void iCanAddDocuments(){
        System.out.println("I can add documents");
    }
    @Step("I can add another thing")
    public void iCanAddAnotherThing(){
        System.out.println("I can add another thing");
    }
    @Step("I can choose anyone who can comment")
    public void iCanChooseAnyoneWhoCanComment(){
        System.out.println("I can choose anyone who can comment");
    }
    @Step("I can schedule my posts")
    public void iCanScheduleMyPosts(){
        System.out.println("I can schedule my posts");
    }
    @Step("I click the post button")
    public void iClickThePostButton(){
        System.out.println("I click the post button");
    }
    @Step("I managed to post")
    public void iManagedToPost(){
        System.out.println("I managed to post");
    }
}
