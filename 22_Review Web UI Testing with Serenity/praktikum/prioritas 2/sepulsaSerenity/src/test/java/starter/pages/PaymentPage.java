package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class PaymentPage extends PageObject {
    private By methodPayment(){
        return By.id("checkbox ShopeePay");
    }
    private By payBtn(){
        return By.xpath("//span[text()='Bayar Sekarang']");
    }
    private By errorMassagePayment(){
        return By.xpath("//p[text()='Nomor handphonenya kelebihan. Maksimal 13 digit ya.']");
    }
    @Step
    public void userChoosesAPaymentMethod() {
        $(methodPayment()).click();
    }
    @Step
    public void userSuccessfullySelectAPaymentMethodAndClickPayNow() {
        $(payBtn()).click();
    }
    @Step
    public void userCannotGoToThePaymentPageAndChooseAPaymentMethod() {
        $(errorMassagePayment()).click();
    }
}
