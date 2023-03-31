package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class IGet {
    protected static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set the endpoint in the GET api")
    public String iSetTheEndpointInTheGETApi(){
        return url + "posts/101";
    }
    @Step("I send invalid id GET HTTP request")
    public void iSendInvalidIdGETHTTPRequest(){
        SerenityRest.given().get(iSetTheEndpointInTheGETApi());
    }
    @Step("I received a 404 HTTP response code")
    public void iReceivedA404HTTPResponseCode(){
        restAssuredThat(response -> response.statusCode(404));
    }
    @Step("I don't receive valid data for user details")
    public void iDonTReceiveValidDataForUserDetails(){
    }
}
