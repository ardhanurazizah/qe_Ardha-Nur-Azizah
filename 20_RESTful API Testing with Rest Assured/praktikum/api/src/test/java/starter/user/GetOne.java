package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetOne {
    protected static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set GET api endpoints")
    public String iSetGETApiEndpoints(){
        return url + "posts/1";
    }
    @Step("I send GET HTTP request")
    public void iSendGETHTTPRequest(){
        SerenityRest.given().get(iSetGETApiEndpoints());
    }
    @Step("I receive valid HTTP response code 200")
    public void iReceiveValidHTTPResponseCode(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive valid data for detail user")
    public void iReceiveValidDataForDetail(){
        restAssuredThat(response -> response.body("userId", equalTo(1)));
        restAssuredThat(response -> response.body("id", equalTo(1)));
    }
}
