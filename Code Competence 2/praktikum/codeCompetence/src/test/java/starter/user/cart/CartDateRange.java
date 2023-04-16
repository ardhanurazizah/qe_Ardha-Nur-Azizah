package starter.user.cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class CartDateRange {
    protected static String url = "'https://fakestoreapi.com/";
    @Step("I set the GET api endpoint")
    public String iSetTheGETApiEndpoint(){
        return url + "carts?startdate=2019-12-10&enddate=2020-10-10";
    }
    @Step("I send HTTP GET request")
    public void iSendHTTPGETRequest(){
        SerenityRest.given().get(iSetTheGETApiEndpoint());
    }
    @Step("I receive a valid HTTP response code 200")
    public void  iReceiveValidHTTPResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive data from specified date")
    public void iReceiveDataFromSpecifiedDate(){
        restAssuredThat(response -> response.body("[0].id", equalTo(1)));
        restAssuredThat(response -> response.body("[0].userId", equalTo(1)));
    }
}
