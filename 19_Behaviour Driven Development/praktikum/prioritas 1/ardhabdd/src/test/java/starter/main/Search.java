package starter.main;

import net.thucydides.core.annotations.Step;

public class Search {
    @Step("I am on the e page")
    public void onTheMainPage(){
        System.out.println("I am on the e page");
    }
    @Step("I click the search section")
    public void onTheSearchSection(){
        System.out.println("I click the search section");
    }
    @Step("I entered username or job")
    public void enterInput(){
        System.out.println("I entered username/job");
    }
    @Step("will display related searches")
    public void onDisplay(){
        System.out.println("will display related searches");
    }
    @Step("I click the found user/job")
    public void click(){
        System.out.println("I click the found user/job");
    }
}
