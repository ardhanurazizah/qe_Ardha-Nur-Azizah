package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.*;

public class UserSteps {
    @Steps
    GetOne getOne;
    @Given("I set GET api endpoints")
    public void iSetGETApiEndpoints() {
        getOne.iSetGETApiEndpoints();
    }

    @When("I send GET HTTP request")
    public void iSendGETHTTPRequest() {
        getOne.iSendGETHTTPRequest();
    }

    @Then("I receive valid HTTP response code 200")
    public void iReceiveValidHTTPResponseCode() {
        getOne.iReceiveValidHTTPResponseCode();
    }

    @And("I receive valid data for detail user")
    public void iReceiveValidDataForDetail() {
        getOne.iReceiveValidDataForDetail();
    }

    @Steps
    Post post;
    @Given("I set POST api endpoints")
    public void iSetPOSTApiEndpoints() {
        post.iSetPOSTApiEndpoints();
    }

    @When("I send POST HTTP request")
    public void iSendPOSTHTTPRequest() {
        post.iSendPOSTHTTPRequest();
    }

    @Then("I receive valid HTTP response code 201")
    public void iReceive1ValidHTTPResponseCode() {
        post.iReceive1ValidHTTPResponseCode();
    }

    @And("I receive valid data for new user")
    public void iReceiveValidDataForNewUser() {
        post.iReceiveValidDataForNewUser();
    }

    @Steps
    Put put;
    @Given("I set PUT api endpoints")
    public void iSetPUTApiEndpoints() {
        put.iSetPUTApiEndpoints();
    }

    @When("I send PUT HTTP request")
    public void iSendPUTHTTPRequest() {
        put.iSendPUTHTTPRequest();
    }

    @And("I receive valid data for updated user")
    public void iReceiveValidDataForUpdatedUser() {
        put.iReceiveValidDataForUpdatedUser();
    }

    @Steps
    Delete delete;
    @Given("I set DELETE api endpoints")
    public void iSetDELETEApiEndpoints() {
        delete.iSetDELETEApiEndpoints();
    }

    @When("I send DELETE HTTP request")
    public void iSendDELETEHTTPRequest() {
        delete.iSendDELETEHTTPRequest();
    }

    @Then("I receive valid HTTP response code 204")
    public void iReceiveValidHTTPResponseCode204() {
        delete.iReceiveValidHTTPResponseCode204();
    }

    @Steps
    IPost iPost;

    @Given("I set the endpoint in the POST api")
    public void iSetTheEndpointInThePOSTApi() {
        iPost.iSetTheEndpointInThePOSTApi();
    }

    @When("I send invalid HTTP POST id request")
    public void iSendInvalidHTTPPOSTIdRequest() {
        iPost.iSendInvalidHTTPPOSTIdRequest();
    }

    @Then("I receive a valid HTTP response code 404")
    public void iReceiveAValidHTTPResponseCode404() {
        iPost.iReceiveAValidHTTPResponseCode404();
    }

    @And("I can't add new user")
    public void iCanTAddNewUser() {
        iPost.iCanTAddNewUser();
    }

    @Steps
    IPut iPut;
    @Given("I set the endpoint in the PUT api")
    public void iSetTheEndpointInThePUTApi() {
        iPut.iSetTheEndpointInThePUTApi();
    }

    @When("I send invalid HTTP PUT id request")
    public void iSendInvalidHTTPPUTIdRequest() {
        iPut.iSendInvalidHTTPPUTIdRequest();
    }

    @Then("I received a 500 HTTP response code")
    public void iReceivedA500HTTPResponseCode() {
        iPut.iReceivedA500HTTPResponseCode();
    }

    @And("I am not receiving valid data for updated user")
    public void iMNotReceivingValidDataForUpdatedUser() {
        iPut.iMNotReceivingValidDataForUpdatedUser();
    }
    @Steps
    IDelete iDelete;
    @Given("I set the endpoint in the DELETE api")
    public void iSetTheEndpointInTheDELETEApi() {
        iDelete.iSetTheEndpointInTheDELETEApi();
    }

    @When("I send invalid id DELETE HTTP request")
    public void iSendInvalidIdREMOVEHTTPRequest() {
        iDelete.iSendInvalidIdREMOVEHTTPRequest();
    }
    @Then("I receive valid HTTP response code 404")
    public void iReceiveValidHTTPResponseCode404() {
        iDelete.iReceiveValidHTTPResponseCode404();
    }

    @Steps
    IGet iGet;
    @Given("I set the endpoint in the GET api")
    public void iSetTheEndpointInTheGETApi() {
        iGet.iSetTheEndpointInTheGETApi();
    }

    @When("I send invalid id GET HTTP request")
    public void iSendInvalidIdGETHTTPRequest() {
        iGet.iSendInvalidIdGETHTTPRequest();
    }
    @Then("I received a 404 HTTP response code")
    public void iReceivedA404HTTPResponseCode() {
        iGet.iReceivedA404HTTPResponseCode();
    }

    @And("I don't receive valid data for user details")
    public void iDonTReceiveValidDataForUserDetails() {
        iGet.iDonTReceiveValidDataForUserDetails();
    }

    @Steps
    Get get;
    @Given("I set the GET api endpoint")
    public void iSetTheGETApiEndpoint() {
        get.iSetTheGETApiEndpoint();
    }

    @When("I send HTTP GET request")
    public void iSendHTTPGETRequest() {
        get.iSendHTTPGETRequest();
    }

    @Then("I receive valids HTTP response code 404")
    public void iReceiveValidsHTTPResponseCode404() {
        get.iReceiveValidsHTTPResponseCode404();
    }

    @And("I don't receive any data for user details")
    public void iDonTReceiveAnyDataForUserDetails() {
        get.iDonTReceiveAnyDataForUserDetails();
    }

    @Steps
    IGetAll iGetAll;
    @Given("I set the api's GET endpoint")
    public void iSetTheApiSGETEndpoint() {
        iGetAll.iSetTheApiSGETEndpoint();
    }

    @When("I send a HTTP GET request")
    public void iSendAHTTPGETRequest() {
        iGetAll.iSendAHTTPGETRequest();
    }

    @Then("I receive valid the HTTP response code 200")
    public void iReceiveValidTheHTTPResponseCode200() {
        iGetAll.iReceiveValidTheHTTPResponseCode200();
    }

    @And("I receive any data for all users details")
    public void iReceiveAnyDataForAllUsersDetails() {
        iGetAll.iReceiveAnyDataForAllUsersDetails();
    }
}
