package starter.main;

import net.thucydides.core.annotations.Step;

public class Sort {
    @Step("I am on the h page")
    public void onTheMainPage(){
        System.out.println("I am on the h page");
    }
    @Step("I click the sort section")
    public void iClickTheSortSection(){
        System.out.println("I click the sort section");
    }
    @Step("I choose the most recent or most popular sort")
    public void iChooseTheMostRecentOrMostPopularSort(){
        System.out.println("I choose the most recent or most popular sort");
    }
    @Step("I can view posts by the selected sort")
    public void iCanViewPostsByTheSelectedSort(){
        System.out.println("I can view posts by the selected sort");
    }
}
