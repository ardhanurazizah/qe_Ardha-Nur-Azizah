package starter.user.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class UpdateProduct {
    protected String url = "https://fakestoreapi.com/";
    @Step("I set the api PUT endpoint")
    public String iSetTheApiPUTEndpoint(){
        return url + "products/7";
    }
    @Step("I send HTTP PUT request")
    public void iSendHTTPPUTRequest(){
        String body = "{\n" +
                "    \"id\": 7,\n" +
                "    \"title\": \"test product\",\n" +
                "    \"price\": \"13.5\",\n" +
                "    \"description\": \"lorem ipsum set\",\n" +
                "    \"image\": \"https://i.pravatar.cc\",\n" +
                "    \"category\": \"electronic\"\n" +
                "}";

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
        restAssuredThat(response -> response.body("title", equalTo("test product")));
        restAssuredThat(response -> response.body("description", equalTo( "lorem ipsum set")));
    }
}
