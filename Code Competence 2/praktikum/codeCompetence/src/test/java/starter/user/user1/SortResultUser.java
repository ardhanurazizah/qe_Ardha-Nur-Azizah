package starter.user.user1;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class SortResultUser {
    protected static String url = "https://fakestoreapi.com/";
    @Step("I set the GET api endpoint")
    public String iSetTheGETApiEndpoint(){
        return url + "users?sort=descc";
    }
    @Step("I send HTTP GET request")
    public void iSendHTTPGETRequest(){
        SerenityRest.given().get(iSetTheGETApiEndpoint());
    }
    @Step("I receive a valid HTTP response code 200")
    public void  iReceiveValidHTTPResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive data with highest id all the way to low")
    public void iReceiveDataWithHighestIdAllTheWayToLow(){
        restAssuredThat(response -> response.body("[19].id", equalTo(20)));
        restAssuredThat(response -> response.body("[18].id", equalTo(19)));
        restAssuredThat(response -> response.body("[17].id", equalTo(18)));
    }
}
