package starter.user.user1;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class UpdateUser {
    protected String url = "https://fakestoreapi.com/";
    @Step("I set the api PUT endpoint")
    public String iSetTheApiPUTEndpoint(){
        return url + "users/7";
    }
    @Step("I send HTTP PUT request")
    public void iSendHTTPPUTRequest(){
        String body = " {\n" +
                "                email:'John@gmail.com',\n" +
                "                username:'johnd',\n" +
                "                password:'m38rmF$',\n" +
                "                name:{\n" +
                "                    firstname:'John',\n" +
                "                    lastname:'Doe'\n" +
                "                },\n" +
                "                address:{\n" +
                "                    city:'kilcoole',\n" +
                "                    street:'7835 new road',\n" +
                "                    number:3,\n" +
                "                    zipcode:'12926-3874',\n" +
                "                    geolocation:{\n" +
                "                        lat:'-37.3159',\n" +
                "                        long:'81.1496'\n" +
                "                    }\n" +
                "                },\n" +
                "                phone:'1-570-236-7033'\n" +
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
        restAssuredThat(response -> response.body("email", equalTo( "John@gmail.com")));
    }
}
