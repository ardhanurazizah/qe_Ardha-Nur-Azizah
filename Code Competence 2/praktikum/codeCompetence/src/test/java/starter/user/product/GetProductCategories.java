package starter.user.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetProductCategories {
    protected static String url = "https://fakestoreapi.com/";
    @Step("I set the GET api endpoint")
    public String iSetTheGETApiEndpoint(){
        return url + "products/category/jewelery";
    }
    @Step("I send HTTP GET request")
    public void iSendHTTPGETRequest(){
        SerenityRest.given().get(iSetTheGETApiEndpoint());
    }
    @Step("I receive a valid HTTP response code 200")
    public void  iReceiveValidHTTPResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive data all by category")
    public void iReceiveDataAllByCategory(){
        restAssuredThat(response -> response.body("[4].id", equalTo(5)));
        restAssuredThat(response -> response.body("[5].id", equalTo(6)));
        restAssuredThat(response -> response.body("[6].id", equalTo(7)));
        restAssuredThat(response -> response.body("[7].id", equalTo(8)));
    }
}
