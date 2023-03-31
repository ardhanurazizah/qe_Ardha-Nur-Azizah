package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class IPut {
    protected String url = "https://jsonplaceholder.typicode.com/";
    @Step("I set the endpoint in the PUT api")
    public String iSetTheEndpointInThePUTApi(){
        return url + "posts/101";
    }
    @Step("I send invalid HTTP PUT id request")
    public void iSendInvalidHTTPPUTIdRequest(){
        String body = "{\n" +
                "  \"userId\": 1,\n" +
                "  \"id\": 101,\n" +
                "  \"title\": \"ini terdapat perubahan\",\n" +
                "  \"body\": \"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\"\n" +
                "}";

        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).put(iSetTheEndpointInThePUTApi());
    }
    @Step("I received a 500 HTTP response code")
    public void iReceivedA500HTTPResponseCode(){
        restAssuredThat(response -> response.statusCode(500));
    }
    @Step("I receive valid data for updated user")
    public void iMNotReceivingValidDataForUpdatedUser(){
    }
}
