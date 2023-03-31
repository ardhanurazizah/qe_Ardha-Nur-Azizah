package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class IDelete {
    protected String url = "https://jsonplaceholder.typicode.com/";
    @Step("I set the endpoint in the DELETE api")
    public String iSetTheEndpointInTheDELETEApi(){
        return url + "posts/101";
    }
    @Step("I send invalid id DELETE HTTP request")
    public void iSendInvalidIdREMOVEHTTPRequest(){
        SerenityRest.given().delete(iSetTheEndpointInTheDELETEApi());
    }
    @Step("I receive a valid HTTP response code 404")
    public void iReceiveValidHTTPResponseCode404(){
        restAssuredThat(response -> response.statusCode(400));
    }
}
