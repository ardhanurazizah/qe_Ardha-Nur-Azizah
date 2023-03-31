package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class IGetAll {
    protected static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set the api's GET endpoint")
    public String iSetTheApiSGETEndpoint(){
        return url + "posts";
    }
    @Step("I send a HTTP GET request")
    public void iSendAHTTPGETRequest(){
        SerenityRest.given().get(iSetTheApiSGETEndpoint());
    }
    @Step("I receive valid the HTTP response code 200")
    public void iReceiveValidTheHTTPResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive any data for all users details")
    public void iReceiveAnyDataForAllUsersDetails(){
        restAssuredThat(response -> response.body("[0].id", equalTo(1)));
    }
}
