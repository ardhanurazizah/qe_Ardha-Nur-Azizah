package starter.user.cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class NewCart {
    protected static String url ="https://fakestoreapi.com/";

    @Step("I set the api POST endpoint")
    public String iSetPOSTApiEndpoints(){
        return  url + "carts";
    }
    @Step("I send HTTP POST request")
    public void iSendGETHTTPRequest(){
        String body = "{\n" +
                "    \"id\": 11,\n" +
                "    \"userId\": \"5\",\n" +
                "    \"date\": \"2020-02-03\",\n" +
                "    \"products\": \"[{productId:5,quantity:1},{productId:1,quantity:5}]\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(iSetPOSTApiEndpoints());
    }
    @Step("I receive a valid HTTP response code 200")
    public void iReceiveValidHTTPResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I received new data")
    public void iReceivedNewData(){
        restAssuredThat(response -> response.body("userId", equalTo(5)));
        restAssuredThat(response -> response.body("date", equalTo( "2020-02-03")));
    }
}
