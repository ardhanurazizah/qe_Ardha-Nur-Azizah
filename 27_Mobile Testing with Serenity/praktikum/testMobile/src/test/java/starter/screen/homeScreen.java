package starter.screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageObject.BasePageObject;

public class homeScreen extends BasePageObject {
    private By homePage() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.TextView[1]");
    }
    private By email(){
        return AppiumBy.id("textViewEmail");
    }
    private By password(){
        return AppiumBy.id("textViewPassword");
    }
    private By name(){
        return AppiumBy.id("textViewName");
    }

    @Step
    public String theUserGoesToTheHomePage() {
        return waitUntilVisible(homePage()).getText();
    }
    @Step
    public String userSeeNameAccount() {
        return waitUntilVisible(name()).getText();
    }
    @Step
    public String userSeeEmailAccount() {
        return waitUntilVisible(email()).getText();
    }
    @Step
    public String userSeePasswordAccount(){
        return waitUntilVisible(password()).getText();
    }
}
