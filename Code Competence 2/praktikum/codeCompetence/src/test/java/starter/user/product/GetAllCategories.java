package starter.user.product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

public class GetAllCategories {
    protected static String url = "https://fakestoreapi.com/";
    @Step("I set the GET api endpoint")
    public String iSetTheGETApiEndpoint(){
        return url + "products/categories";
    }
    @Step("I send HTTP GET request")
    public void iSendHTTPGETRequest(){
        SerenityRest.given().get(iSetTheGETApiEndpoint());
    }
    @Step("I receive a valid HTTP response code 200")
    public void  iReceiveValidHTTPResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
    @Step("I receive data of all categories")
    public void iReceiveDataOfAllCategories(){
        restAssuredThat(response -> response.body("[0]", equalTo("electronics")));
//        restAssuredThat(response -> response.body("[1]", equalTo("jewelery")));
//        restAssuredThat(response -> response.body("[2]", equalTo("men's clothing")));
//        restAssuredThat(response -> response.body("[3]", equalTo("women's clothing")));
    }
}
