package starter.user.user1;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class DeleteUser {
    protected String url = "https://fakestoreapi.com/";
    @Step("I set the DELETE api endpoint")
    public String iSetTheDELETEApiEndpoint(){
        return url + "users/6";
    }
    @Step("I send HTTP DELETE request")
    public void iSendHTTPDELETERequest(){
        SerenityRest.given().delete(iSetTheDELETEApiEndpoint());
    }
    @Step("I receive a valid HTTP response code 200")
    public void  iReceiveValidHTTPResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I received the deleted data details")
    public void iReceivedTheDeletedDataDetails(){
        restAssuredThat(response -> response.body("id", equalTo(6)));
    }
}
