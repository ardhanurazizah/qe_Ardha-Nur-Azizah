package starter.screen;

import com.github.javafaker.Faker;
import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageObject.BasePageObject;

public class resgisterScreen extends BasePageObject {
    public String name = createRandomName();
    public String password = "password12";
    private By nameField(){
        return AppiumBy.id("textInputEditTextName");
    }
    private By createOne(){
        return AppiumBy.id("textViewLinkRegister");
    }
    private By emailField(){
        return AppiumBy.id("textInputEditTextEmail");
    }
    private By password(){
        return AppiumBy.id("textInputEditTextPassword");
    }
    private By confirmPw(){
        return AppiumBy.id("textInputEditTextConfirmPassword");
    }
    private By registerBtn(){
        return AppiumBy.id("appCompatButtonRegister");
    }
    private By message(){
        return AppiumBy.id("snackbar_text");
    }

    @Step
    public void userClickCreateOne(){
        onClick(createOne());
    }
    @Step
    public void userEnterAValidName(){
        onType(nameField(), createRandomName());
    }
    @Step
    public void userEnterAValidEmail(){

        onType(emailField(), createRandomName() + "@gmail.com");
    }
    public String createRandomName(){
        Faker faker = new Faker();
        return faker.name().firstName(); // Emory
    }
    @Step
    public void userEnterAValidPassword(){

        onType(password(), password);
    }
    @Step
    public void userEnterAValidConfirmPassword(){
        onType(confirmPw(), password);
    }
    @Step
    public void userClickOnTheRegisterButton(){
        onClick(registerBtn());
    }
//    @Step
//    public String theUserSeesAnMessage(){
//        return waitUntilVisible(message()).getText();
//    }
    @Step
    public String userSeeMessage() {
        return waitUntilVisible(message()).getText();
    }
}
