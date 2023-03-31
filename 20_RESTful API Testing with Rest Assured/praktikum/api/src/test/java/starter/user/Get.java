package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Get {
    protected static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set the GET api endpoint")
    public String iSetTheGETApiEndpoint(){
        return url + "post";
    }
    @Step("I send HTTP GET request")
    public void iSendHTTPGETRequest(){
        SerenityRest.given().get(iSetTheGETApiEndpoint());
    }
    @Step("I receive valids HTTP response code 404")
    public void iReceiveValidsHTTPResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
    @Step("I don't receive any data for user details")
    public void iDonTReceiveAnyDataForUserDetails(){
    }
}
