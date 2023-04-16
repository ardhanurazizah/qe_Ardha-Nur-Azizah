package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.user.cart.CartDateRange;
import starter.user.cart.GetAllCart;
import starter.user.cart.GetOneCart;
import starter.user.cart.GetUserCart;
import starter.user.product.*;
import starter.user.Login;
import starter.user.user1.GetAllUser;

public class UserSteps {
    // ====================================LOGIN=============================================
    @Steps
    Login login;

    @Given("I set the api POST endpoint")
    public void iSetPOSTApiEndpoints(){
        login.iSetPOSTApiEndpoints();
    }
    @When("I send HTTP POST request")
    public void iSendGETHTTPRequest(){
        login.iSendGETHTTPRequest();
    }
    @Then("I receive a valid HTTP response code 200")
    public void iReceiveValidHTTPResponseCode200(){
        login.iReceiveValidHTTPResponseCode200();
    }
    @And("I received the token")
    public void iReceivedTheToken(){
        login.iReceivedTheToken();
    }

    // ====================================GET ALL PRODUCT=============================================
    @Steps
    GetAllProduct getAllProduct;
    @Given("I set the GET api endpoint")
    public void iSetTheGETApiEndpoint() {
        getAllProduct.iSetTheGETApiEndpoint();
    }

    @When("I send HTTP GET request")
    public void iSendHTTPGETRequest() {
        getAllProduct.iSendHTTPGETRequest();
    }

    @And("I received the data of all products")
    public void iReceivedTheDataOfAllProducts() {
        getAllProduct.iReceivedTheDataOfAllProducts();
    }

    // ====================================GET ALL PRODUCT=============================================
    @Steps
    GetOneProduct getOneProduct;
    @And("I received data id 1")
    public void iReceivedDataId() {
        getOneProduct.iReceivedDataId();
    }

    // ====================================LIMIT RESULT PRODUCT=============================================
    @Steps
    LimitResultProduct limitResultProduct;
    @And("I receive data with a limit of 5")
    public void iReceiveDataWithALimitOf5() {
        limitResultProduct.iReceiveDataWithALimitOf5();
    }

    // ====================================SORT RESULT=============================================
    @Steps
    SortResultProduct sortResultProduct;
    @And("I receive data with highest id all the way to low")
    public void iReceiveDataWithHighestIdAllTheWayToLow() {
        sortResultProduct.iReceiveDataWithHighestIdAllTheWayToLow();
    }

    // ====================================GET ALL CATEGORIES=============================================
    @Steps
    GetAllCategories getAllCategories;
    @And("I receive data of all categories")
    public void iReceiveDataOfAllCategories() {
        getAllCategories.iReceiveDataOfAllCategories();
    }

    // ====================================GET PRODUCT IN CATEGORIES=============================================
    @Steps
    GetProductCategories getProductCategories;
    @And("I receive data all by category")
    public void iReceiveDataAllByCategory() {
        getProductCategories.iReceiveDataAllByCategory();
    }
    // ====================================NEW PRODUCT=============================================
    @Steps
    NewProduct newProduct;
    @And("I received new data")
    public void iReceivedNewData() {
        newProduct.iReceivedNewData();
    }

    // ====================================UPDATE PRODUCT=============================================
    @Steps
    UpdateProduct updateProduct;
    @Given("I set the api PUT endpoint")
    public void iSetTheApiPUTEndpoint() {
        updateProduct.iSetTheApiPUTEndpoint();
    }

    @When("I send HTTP PUT request")
    public void iSendHTTPPUTRequest() {
        updateProduct.iSendHTTPPUTRequest();
    }

    @And("I received edited data")
    public void iReceivedEditedData() {
        updateProduct.iReceivedEditedData();
    }
    // ====================================DELETE PRODUCT=============================================
    @Steps
    DeleteProduct deleteProduct;
    @Given("I set the DELETE api endpoint")
    public void iSetTheDELETEApiEndpoint() {
        deleteProduct.iSetTheDELETEApiEndpoint();
    }

    @When("I send HTTP DELETE request")
    public void iSendHTTPDELETERequest() {
        deleteProduct.iSendHTTPDELETERequest();
    }

    @And("I received the deleted data details")
    public void iReceivedTheDeletedDataDetails() {
        deleteProduct.iReceivedTheDeletedDataDetails();
    }

    // ====================================GET ALL CART=============================================
    @Steps
    GetAllCart getAllCart;
    @And("I receive the data of all carts")
    public void iReceiveTheDataOfAllCarts() {
        getAllCart.iReceiveTheDataOfAllCarts();
    }

    // ====================================GET ONE CART=============================================
    @Steps
    GetOneCart getOneCart;
    @And("I received data id 5")
    public void iReceivedDataId5() {
        getOneCart.iReceivedDataId5();
    }

    // ====================================CART RANGE DATE=============================================
    @Steps
    CartDateRange cartDateRange;
    @And("I receive data from specified date")
    public void iReceiveDataFromSpecifiedDate() {
        cartDateRange.iReceiveDataFromSpecifiedDate();
    }

    // ====================================GET USER CART=============================================
    @Steps
    GetUserCart getUserCart;
    @And("I receive all data based on user id")
    public void iReceiveAllDataBasedOnUserId() {
        getUserCart.iReceiveAllDataBasedOnUserId();
    }

    // ====================================GET ALL USER=============================================
    @Steps
    GetAllUser getAllUser;
    @And("I receive the data of all users")
    public void iReceiveTheDataOfAllUsers() {
        getAllUser.iReceiveTheDataOfAllUsers();
    }
}
