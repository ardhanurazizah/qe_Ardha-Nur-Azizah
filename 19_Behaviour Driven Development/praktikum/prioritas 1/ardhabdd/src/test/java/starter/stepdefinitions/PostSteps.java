package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.main.Article;
import starter.main.Post;

public class PostSteps {
    @Steps
    Post post;

    @Given("I am on the c page")
    public void onTheMainPage(){
        post.onTheMainPage();
    }
    @When("I click on the posts section")
    public void iClickOnThePostsSection() {
        post.iClickOnThePostsSection();
    }

    @And("I get the post page")
    public void iGetThePostPage() {
        post.iGetThePostPage();
    }

    @And("I can choose who sees posts")
    public void iCanChooseWhoSeesPosts() {
        post.iCanChooseWhoSeesPosts();
    }

    @And("I can fill posts")
    public void iCanFillPosts() {
        post.iCanFillPosts();
    }

    @And("I can choose which emoticon to use")
    public void iCanChooseWhichEmoticonToUse() {
        post.iCanChooseWhichEmoticonToUse();
    }
    @And("I can photos")
    public void iCanAddPhotos(){
        post.iCanAddPhotos();
    }

    @And("I can add videos")
    public void iCanAddVideos() {
        post.iCanAddVideos();
    }

    @And("I can add documents")
    public void iCanAddDocuments() {
        post.iCanAddDocuments();
    }

    @And("I can add another thing")
    public void iCanAddAnotherThing() {
        post.iCanAddAnotherThing();
    }

    @And("I can choose anyone who can comment")
    public void iCanChooseAnyoneWhoCanComment() {
        post.iCanChooseAnyoneWhoCanComment();
    }

    @And("I can schedule my posts")
    public void iCanScheduleMyPosts() {
        post.iCanScheduleMyPosts();
    }

    @And("I click the post button")
    public void iClickThePostButton() {
        post.iClickThePostButton();
    }

    @Then("I managed to post")
    public void iManagedToPost() {
        post.iManagedToPost();
    }
}
