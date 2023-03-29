package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.main.Article;

public class ArticleSteps {
    @Steps
    Article art;

    @Given("I am on the main page")
    public void onTheMainPage(){
        art.onTheMainPage();
    }
    @When("I click on the photo menu")
    public void iClickOnThePhotoMenu() {
       art.iClickOnThePhotoMenu();
    }

    @And("I can input a title")
    public void iCanInputATitle() {
        art.iCanInputATitle();
    }

    @And("I can add photos")
    public void iCanAddPhotos() {
        art.iCanAddPhotos();
    }

    @And("I can input the contents of the article")
    public void iCanInputTheContentsOfTheArticle() {
        art.iCanInputTheContentsOfTheArticle();
    }

    @Then("I have successfully posted the article")
    public void iHaveSuccessfullyPostedTheArticle() {
        art.iHaveSuccessfullyPostedTheArticle();
    }
}
