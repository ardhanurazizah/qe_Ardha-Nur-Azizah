package starter.user.cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class UpdateCart {
    protected String url = "https://fakestoreapi.com/";
    @Step("I set the api PUT endpoint")
    public String iSetTheApiPUTEndpoint(){
        return url + "carts/7";
    }
    @Step("I send HTTP PUT request")
    public void iSendHTTPPUTRequest(){
        String body = "{\n" +
                "                    userId:3,\n" +
                "                    date:2019-12-10,\n" +
                "                    products:[{productId:1,quantity:3}]\n" +
                "                }";

        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).put(iSetTheApiPUTEndpoint());
    }
    @Step("I receive a valid HTTP response code 200")
    public void iReceiveValidHTTPResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I received edited data")
    public void iReceivedEditedData(){
        restAssuredThat(response -> response.body("id", equalTo(7)));
        restAssuredThat(response -> response.body("userId", equalTo(3)));
        restAssuredThat(response -> response.body("date", equalTo( "2019-12-10")));
    }
}
