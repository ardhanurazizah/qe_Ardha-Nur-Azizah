package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.main.SharePhoto;

public class SharePhotoSteps {
    @Steps
    SharePhoto sharePhoto;

    @Given("I am on the f page")
    public void onTheMainPage(){
        sharePhoto.onTheMainPage();
    }
    @When("I click on photo menu")
    public void iClickOnThePhotoMenu(){
        sharePhoto.iClickOnThePhotoMenu();
    }
    @And("I can add photo")
    public void iCanAddPhotos(){
        sharePhoto.iCanAddPhotos();
    }
    @And("I can click done button")
    public void iCanClickTheDoneButton() {
    }
    @Then("I have managed to post a photo")
    public void iHaveManagedToPostAPhoto() {
    }
}
