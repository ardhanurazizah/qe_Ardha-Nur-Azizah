package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class ProductPage extends PageObject {
    private By pulsa(){
        return By.id("Pulsa");
    }
    private By phoneNumber(){
        return By.id("phone_number");
    }
    private By choosePulse(){
        return By.id("Indosat Rp5.000");
    }
    private By paymentPage(){
        return By.xpath("//h1[text()='Pembayaran']");
    }
    private By total(){
        return By.id("total_checkout");
    }
    private By errorMassage(){
        return By.xpath("//p[text()='Nomor handphonenya kelebihan. Maksimal 13 digit ya.']");
    }
    private By voucherGame(){
        return By.id("Group_15644");
    }
    private By tabVoucher(){
        return By.id("tab_voucher_game");
    }
    private By selectVoucher(){
        return By.id("Steam Game CD Keys");
    }
    private By phoneVoucher(){
        return By.id("phone_number");
    }
    private By packetVoucher(){
        return By.id("Steam Game CD Keys - Dark Souls II: Scholar of The First Sin");
    }
    private By paymentvoucher(){
        return By.xpath("//h1[text()='Pembayaran']");
    }
    private By totalVoucher(){
        return By.id("total_checkout");
    }
    private By errorMassageVoucher(){
        return By.xpath("//p[text()='Nomor handphonenya kelebihan. Max cuma 13 digit aja ya.']");
    }
    @Step
    public void usersClickPulseProduct(){
        $(pulsa()).click();
    }
    @Step
    public void userFillInThePhoneNumber(String nomor){
        $(phoneNumber()).type(nomor);
    }
    @Step
    public void userClickOnThePulsePackage(){
        $(choosePulse()).click();
    }
    @Step
    public void userToThePaymentPage(){
        $(paymentPage()).shouldBeVisible();
    }
    @Step
    public void userSeeTheTotalPayment(){
        $(total()).shouldBeVisible();
    }
    @Step
    public void userFillInTheExcessPhoneNumber(String nomer){
        $(phoneNumber()).type(nomer);
    }
    @Step
    public void userSeeAnErrorMessage(){
        $(errorMassage()).shouldBeVisible();
    }
    @Step
    public void userClickOnTheGameVoucherProduct(){
        $(voucherGame()).click();
    }
    @Step
    public void userClickOnTheVoucherMenu(){
        $(tabVoucher()).click();
    }
    @Step
    public void userClickOnTheSelectedVoucherType(){
        $(selectVoucher()).click();
    }
    @Step
    public void userFillInThePhoneNumberVoucher(String voucher){
        $(phoneVoucher()).type(voucher);
    }
    @Step
    public void userClickOnTheSelectedVoucherPackage(){
        $(packetVoucher()).click();
    }
    @Step
    public void userToThePaymentPageVoucher(){
        $(paymentvoucher()).shouldBeVisible();
    }
    @Step
    public void userSeeTheTotalPaymentVoucher(){
        $(totalVoucher()).shouldBeVisible();
    }
    @Step
    public void userFillInTheExcessCellPhoneNumber(String voucher){
        $(phoneVoucher()).type(voucher);
    }
    @Step
    public void userSeeAnErrorMessageVoucher(){
        $(errorMassageVoucher()).shouldBeVisible();
    }
}
